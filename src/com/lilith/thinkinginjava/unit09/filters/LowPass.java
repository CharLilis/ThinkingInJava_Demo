package com.lilith.thinkinginjava.unit09.filters;

public class LowPass extends Filter{
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}
