package com.yourname.visitor;

/**
 * Created by Charles Kelly.
 */
public interface Visitor
{
    public void visit(Book book);

    //visit other concrete items
    public void visit(CD cd);
}
