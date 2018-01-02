package br.com.booblebee.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Marcas implements Serializable{

	private static final long serialVersionUID = 1L;
	private String key;
	private String id;
	private String fipe_name;
	private String name;
	private String order;
		
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFipe_name() {
		return fipe_name;
	}
	public void setFipe_name(String fipe_name) {
		this.fipe_name = fipe_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
}
