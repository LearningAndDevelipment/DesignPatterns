package com.samuel.dp.factory;

public class DemoFactory {

	public static void main(String[] args) {
		String lang = "French";
		MessageFactory mf = new MessageFactory();
		ErrorMessage em = mf.getMessageObject(lang);
		System.out.println(em.fatalError());

	}

}
