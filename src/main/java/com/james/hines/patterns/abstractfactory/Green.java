package com.james.hines.patterns.abstractfactory;

/**
 * Created by James on 12/14/2014.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
