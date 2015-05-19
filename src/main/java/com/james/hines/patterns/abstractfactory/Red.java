package com.james.hines.patterns.abstractfactory;

/**
 * Created by James on 12/14/2014.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
