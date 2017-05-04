package com.samuel.dp.adapter;

import java.util.Arrays;
import java.util.List;

public class JavaHasAdapters {
	
	public static void main(String[] args){
		JavaInbuiltArraysToListAdapter();
		
	}

	private static void JavaInbuiltArraysToListAdapter() {
		Integer[] arrayOfInts = new Integer[] {21, 32, 67, 11, 19};
		List<Integer>  listOfIntegers= Arrays.asList(arrayOfInts);
		System.out.println(arrayOfInts);
		System.out.println(listOfIntegers);
	}
	
	

}
