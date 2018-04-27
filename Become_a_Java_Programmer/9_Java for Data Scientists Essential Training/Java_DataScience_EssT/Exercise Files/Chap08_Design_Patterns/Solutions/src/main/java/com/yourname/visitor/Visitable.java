package com.yourname.visitor;

/**
 * Created by Charles Kelly.
 */
public interface Visitable
{
    public void accept(Visitor visitor);
}
