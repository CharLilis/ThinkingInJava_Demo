package com.lilith.thinkinginjava.unit09.interfaceprocessor;

import com.lilith.thinkinginjava.unit09.filters.Filter;
import com.lilith.thinkinginjava.unit09.filters.Waveform;

public class FilterAdapter implements Processor{
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	public String name() {
		return filter.name();
	}
	public Object process(Object input) {
		return filter.process((Waveform)input);
	}

}
