package com.samuel.dp.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<MenuComponent> getComponents() {
		return menuComponents;
	}
	public void setComponents(List<MenuComponent> components) {
		this.menuComponents = components;
	}
	
	String print(MenuComponent menuComponent){
		StringBuilder sb = new StringBuilder(name);
		sb.append(":");
		sb.append(url);
		sb.append("\n");
		return sb.toString();
	}
	
	public abstract String toString();
	
	public MenuComponent add(MenuComponent menuComponent){
		throw new UnsupportedOperationException("This feature not implemented yet");
		
	}
	
	public MenuComponent remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException("This feature not implemented yet");
		
	}
	

}
