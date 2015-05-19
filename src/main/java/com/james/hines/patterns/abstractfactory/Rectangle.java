package com.james.hines.patterns.abstractfactory;

/**
 * Created by James on 12/14/2014.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
