package com.company.pack;

public class Cat implements RunJumpable{
    int lenght=50;
    int  height=1;
String name;
    public Cat(String name,int lenght,int height) {
        this.name = name;
        this.height=height;
        this.lenght=lenght;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

}
