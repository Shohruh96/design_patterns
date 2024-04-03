package test.strategy;

import test.strategy.qobiliyatlar.QolJangi;

public class Brusle extends Jangchi{

    public Brusle(){
        setQurollar(new QolJangi());
    }
    @Override
    public void display() {
        System.out.println("I'm Bruslee");
    }
}
