package com.opencodez.domain.pagination;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterBy {

	private Map<String, String> mapOfFilters;
	
	private boolean globalSearch;

	public FilterBy() {
		if (null == mapOfFilters) {
			mapOfFilters = new HashMap<String, String>();
		}
	}

	public void addFilter(String filterColumn, String filterValue) {
		mapOfFilters.put(filterColumn, filterValue);
	}

}
