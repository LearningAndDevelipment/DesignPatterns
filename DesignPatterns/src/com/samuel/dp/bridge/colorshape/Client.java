package com.samuel.dp.bridge.colorshape;

public class Client {

	public static void main(String[] args){
		Color blue = new Blue();
		Shape square = new Square(blue);
		square.applyColor();
		
	}
}
