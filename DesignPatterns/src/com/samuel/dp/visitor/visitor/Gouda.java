package com.samuel.dp.visitor.visitor;

public class Gouda extends BaseCheese {
    String goudaName() { return "This is gouda"; }
    public void accept(Visitor v) { v.visit(this); }
}
