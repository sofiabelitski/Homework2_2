package com.company;

public class Main {

    public static void main(String[] args) throws MyArraySizeException {
	// write your code here
        String[][] array=new String[][]{
            { "3","7","6","9"},
            { "7","5","0","2"},
                { "3","4","8","1"},
                { "4","1","6","oj"}
        };
        String[][] array2=new String[][]{
                { "3","7","6","9"},
                { "7","5","0","2"},
                { "3","4"},
                { "4","1","6","oj"}
        };
        String[][] array3=new String[][]{
                { "3","7","6","9"},
                { "7","5","0","2"},
                { "3","4","9","0"},
                { "4","1","6","0"}
        };
        try{
      arrmethod(array)  ;}
        catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
        try{
            arrmethod(array2)  ;}
        catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

        try{
            arrmethod(array3)  ;}
        catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

    }

    public static void arrmethod(String[][] array)  {
        if(array.length!=4) throw new MyArraySizeException();
        for (String[] ar:array) {
            if(ar.length!=4){
                throw new MyArraySizeException();
            }
        }
        int sum=0;
        for (int i=0; i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {

try{
                    sum+=Integer.parseInt(array[i][j]);
}
catch(RuntimeException e){
   throw new MyArrayDataException(i,j);

}
  }

        }
        System.out.println("Сумма элементов массива равна "+sum);

    }
}
