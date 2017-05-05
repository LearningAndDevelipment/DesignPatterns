package com.samuel.dp.singleton;

public class SingletonClient {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.myMethod("Santosh");

	}

}
