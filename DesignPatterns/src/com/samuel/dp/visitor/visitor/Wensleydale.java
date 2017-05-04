package com.samuel.dp.visitor.visitor;

public class Wensleydale extends BaseCheese{

	String wensleydaleName() { return "This is wensleydale"; }
    public void accept(Visitor v) { v.visit(this); }
	

}
