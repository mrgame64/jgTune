package org.jgdev.tune.waves;

public interface Wave {
	public byte[] getSamples(int n);
	public byte getSample(float freq, long millis);
	public byte getSample(float freq, float sec);
}
