package com.samuel.dp.factory;

public class MessageFactory {
	
	public ErrorMessage getMessageObject(String language){
		if(language.equals("French")) return new FrenchMessage();
		else return new EnglishMessage();
	}

}
