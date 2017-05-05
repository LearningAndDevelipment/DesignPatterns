package com.samuel.dp.factory;

public class FrenchMessage implements ErrorMessage{

	@Override
	public String fatalError() {
		
		return "Serious xx mess up Contact administrateur";
	}

	@Override
	public String warning() {
		// TODO Auto-generated method stub
		return "Warning you have not filled all data fields";
	}

}
