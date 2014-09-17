package org.jgdev.tune.waves;

public class Square implements Wave {

	@Override
	public byte[] getSamples(int n) {
		byte[] samples = new byte[n];
		
		for(int t=0; t<n; t++) {
			float x = (float)(t)/n;
			
			float y = (float) (1 - Math.floor(x*2) % 2);
			samples[t] = (byte) (Math.round(y*255) - 128);
		}
		
		return samples;
	}

	@Override
	public byte getSample(float freq, long millis) {
		if(millis > 1000) millis -= 1000;
		
		float x = millis/1000f;
		float y = (float) (1 - Math.floor(x*2*freq) % 2);
		return (byte) (Math.round(y*255) - 128);
	}

}
