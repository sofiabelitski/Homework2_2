package com.company;

public class MyArraySizeException extends IndexOutOfBoundsException{
    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("Размер массива некорректный");
    }
}
