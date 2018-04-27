package com.yourname.visitor;

/**
 * Created by Charles Kelly.
 */
public class PostageVisitor implements Visitor
{
    private double totalPostageForCart;

    //collect data about the book
    public void visit(Book book)
    {
        //assume we have a calculation here related to weight and price
        //free postage for a book over 10
        if (book.getPrice() < 100.0)
        {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    //add other visitors here
    public void visit(CD cd)
    {
    }

    //return the internal state
    public double getTotalPostage()
    {
        return totalPostageForCart;
    }
}