package com.yourname.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * copied from: https://docs.oracle.com/javase/tutorial/java/generics/why.html
 *
 * Created by Charles Kelly.
 */
public class SampleGenerics
{
    public void withoutGenerics()
    {
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
    }

    public void withGenerics()
    {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0);   // no cast
//        list.add(17);             // compiler detects error
    }
}
