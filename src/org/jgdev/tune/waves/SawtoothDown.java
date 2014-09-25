package org.jgdev.tune.waves;

public class SawtoothDown implements Wave {

	@Override
	public byte[] getSamples(int n) {
		byte[] samples = new byte[n];
		
		for(int t=0; t<n; t++)
			samples[t] = getSample(1f, (float)(t)/n);
		
		return samples;
	}

	@Override
	public byte getSample(float freq, long millis) {
		return getSample(freq, millis/1000f);
	}

	@Override
	public byte getSample(float freq, float sec) {
		float x = sec % 1f;
		float k = x*freq + 0.5f;
		float y = (float) (k - Math.floor(k) - 0.5f)*2 * -1f;
		return (byte) (Math.round((y/2f + 0.5f)*255) - 128);
	}

}
