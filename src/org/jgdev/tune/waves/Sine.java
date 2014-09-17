package org.jgdev.tune.waves;

public class Sine implements Wave {

	@Override
	public byte[] getSamples(int n) {
		byte[] samples = new byte[n];
		
		for(int t=0; t<n; t++) {
			float x = t/n;
			
			float y = (float) Math.sin(x * Math.PI * 2);
			samples[t] = (byte) (Math.round(y/2f + 0.5f)*127 - 255);
		}
		
		return samples;
	}

	@Override
	public byte getSample(float freq, long millis) {
		if(millis > 1000) millis -= 1000;
		
		float x = millis/1000f;
		float y = (float) Math.sin(x * Math.PI * 2 * freq);
		return (byte) (Math.round(y/2f + 0.5f)*127 - 255);
	}

}
