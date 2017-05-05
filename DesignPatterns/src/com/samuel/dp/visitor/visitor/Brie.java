package com.samuel.dp.visitor.visitor;

public class Brie  extends BaseCheese {
    String brieName() { return "This is brie n "; }
    public void accept(Visitor v) { v.visit(this); }

}
