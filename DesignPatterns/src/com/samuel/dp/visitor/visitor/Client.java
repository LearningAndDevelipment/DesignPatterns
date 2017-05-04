package com.samuel.dp.visitor.visitor;

public class Client {

	public static void main(String[] args) {
        Cheese cheese1 = new Wensleydale();
        Cheese cheese2 = new Gouda();
        Cheese cheese3 = new Brie();
        Visitor v = new VisitorImpl();
        cheese1.accept(v);
        cheese2.accept(v);
        cheese3.accept(v);
    }
}
