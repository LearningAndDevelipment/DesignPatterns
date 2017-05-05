package com.samuel.dp.singleton;

public class Singleton {
	
	
		    
	    private static final Singleton instance = new Singleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private Singleton(){}

	    public static Singleton getInstance(){
	        return instance;
	    }
	    
	    public String myMethod(String name){

	    	return "Hello Mr   ssss"+name;


	    }
	

	
}
