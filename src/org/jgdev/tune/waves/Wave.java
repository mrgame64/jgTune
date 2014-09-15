package org.jgdev.tune.waves;

public interface Wave {
	public byte[] getSamples();
	public int getSample(double freq, long t);
}
