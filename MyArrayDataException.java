package com.company;


import java.util.IllegalFormatException;

public class MyArrayDataException extends RuntimeException{
    int line;
int column;
    public MyArrayDataException(int i, int j) {
        this.line = ++i;
        this.column = ++j;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("Ошибка в строке "+line+" и в столбце "+column);
    }
}
