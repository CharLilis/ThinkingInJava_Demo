package com.lilith.thinkinginjava.unit09.interfaceprocessor;

import com.lilith.thinkinginjava.unit09.classprocessor.Apply;
import com.lilith.thinkinginjava.unit09.filters.BandPass;
import com.lilith.thinkinginjava.unit09.filters.HighPass;
import com.lilith.thinkinginjava.unit09.filters.LowPass;
import com.lilith.thinkinginjava.unit09.filters.Waveform;
/**
 * P178	关于适配器
 * @author Perform
 *
 */
public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
