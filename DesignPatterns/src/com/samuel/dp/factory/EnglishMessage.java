package com.samuel.dp.factory;

public class EnglishMessage implements ErrorMessage{

	@Override
	public String fatalError() {
		
		return "Serious mess up Contact administrator";
	}

	@Override
	public String warning() {
		// TODO Auto-generated method stub
		return "Warning you have not filled all data fields";
	}

}
