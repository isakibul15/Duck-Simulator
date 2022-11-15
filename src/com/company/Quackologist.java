package com.company;

public class Quackologist implements Observer {

    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " quacked right away.");
    }

    public String toString() {
        return "Quackologist";
    }
}