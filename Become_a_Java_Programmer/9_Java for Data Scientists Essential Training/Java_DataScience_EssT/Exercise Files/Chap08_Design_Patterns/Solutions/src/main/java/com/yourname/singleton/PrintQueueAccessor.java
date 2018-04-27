package com.yourname.singleton;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Charles Kelly.
 */
public class PrintQueueAccessor
{
    private static Queue<String> hiddenPrintQueue;

    private PrintQueueAccessor()
    {
        // restrict public access
    }
    public static void writeToQueue(String sampleString)
    {
        // lazy instantiation
        if (null == hiddenPrintQueue)
            hiddenPrintQueue = new LinkedList();

        processPrintJob(sampleString);
    }
    private static void processPrintJob(String sampleString)
    {
        // handle print job here
    }
    public static boolean isPrintQueueInstantiated()
    {
        if (null == hiddenPrintQueue)
            return false;
        else
            return true;
    }
}
