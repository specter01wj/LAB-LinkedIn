package com.example.java;

import com.example.java.model.Olive;
import com.example.java.model.OliveColor;
import com.example.java.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.PURPLE, 3));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));
        olives.add(new Olive(OliveName.LIGURIAN, OliveColor.BLACK, 2));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
