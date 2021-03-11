package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
    private double price;

    public House(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        if (price > this.price) {
            super.setChanged();
            super.notifyObservers(price);
        }
        this.price = price;
    }
}

class Member implements Observer {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof House) {
            if (arg instanceof Double) {
                double newPrice = (Double) arg;
                System.out.println("房价上涨了: " + newPrice + ", " + this.name + " 开始买房了！");
            }
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
        House house = new House(50000);
        Member member1 = new Member("1");
        Member member2 = new Member("2");
        Member member3 = new Member("3");
        Member member4 = new Member("4");
        house.addObserver(member1);
        house.addObserver(member2);
        house.addObserver(member3);
        house.addObserver(member4);
        house.setPrice(80000.00);
    }
}