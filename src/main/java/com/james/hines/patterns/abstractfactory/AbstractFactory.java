package com.james.hines.patterns.abstractfactory;

/**
 * Created by James on 12/14/2014.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
