package com.yourname;

/**
 * Editor Basics
 *
 * Created by Charles Kelly.
 */
public class MyTriple02
{
    private int preliminaryValue;
    private int finalValue;

    public int createTriple(int initialValue)
    {
        return initialValue * 3;
    }

    public int getPreliminaryValue() {
        return preliminaryValue;
    }

    public void setPreliminaryValue(int preliminaryValue) {
        this.preliminaryValue = preliminaryValue;
    }

    public int getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(int finalValue) {
        this.finalValue = finalValue;
    }
}
