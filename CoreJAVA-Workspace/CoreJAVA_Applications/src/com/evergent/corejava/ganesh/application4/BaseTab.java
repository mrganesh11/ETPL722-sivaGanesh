package com.evergent.corejava.ganesh.application4;

// Abstract class that defines the basic structure for all tabs
public abstract class BaseTab implements MenuTab
{
    // Abstract method to print a header, to be implemented by subclasses
    abstract void printHeader(String title);
}