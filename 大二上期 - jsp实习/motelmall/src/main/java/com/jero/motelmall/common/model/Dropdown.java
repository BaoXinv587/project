package com.jero.motelmall.common.model;

public class Dropdown {
	private String label;
	private Object value;

	public Dropdown() {
	}

	public Dropdown(String label, Object value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
