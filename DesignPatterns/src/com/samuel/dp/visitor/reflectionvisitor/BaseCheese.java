package com.samuel.dp.visitor.reflectionvisitor;

public abstract class BaseCheese implements Cheese{
	public void accept(Visitor v) throws Exception { v.visit(this); } 
}
