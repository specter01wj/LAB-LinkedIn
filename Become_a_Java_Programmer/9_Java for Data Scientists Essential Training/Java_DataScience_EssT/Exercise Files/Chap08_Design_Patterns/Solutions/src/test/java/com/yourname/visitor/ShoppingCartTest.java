package com.yourname.visitor;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Charles Kelly.
 */
public class ShoppingCartTest
{
    //normal shopping cart stuff
    private ArrayList<Visitable> items;

    @Before
    public void populateVisitableList()
    {
        try
        {
            items = new ArrayList<Visitable>();
            Book book1 = new Book(14.95, 1.5);
            items.add(book1);
            Book book2 = new Book(19.95, 2.2);
            items.add(book2);
        }
        catch (Exception e)
        {
            fail(e.toString() );
        }
    }
    @Test
    public void testPostageCalculation()
    {
        double anticipatedResult = 7.4;
        double calculatedPostage = calculatePostage();
        assertEquals(anticipatedResult, calculatedPostage, 0.00001);
    }
    private double calculatePostage()
    {
        //create a visitor
        PostageVisitor visitor = new PostageVisitor();
        //iterate through all items
        for (Visitable item : items)
        {
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }
}
