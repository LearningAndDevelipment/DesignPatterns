package com.samuel.dp.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {
	
	public Menu(String name, String url){
		this.name=name;
		this.url=url;
		
	}
	
	public MenuComponent add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	public MenuComponent remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(print(this));
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent menuComponent = iterator.next();
			sb.append(menuComponent.toString());
		}
		return sb.toString();
	}

}
