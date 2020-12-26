package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Input_Cases {


    public static void main(String[] args) throws IOException {
 /* //   int a=System.in.read();
        byte[] a=new byte[10];
    // System.out.println(a);
        System.in.read(a);
        System.out.println(Arrays.toString(a));*/
        //   Scanner in = new Scanner(System.in);
        //  in.next();//вернет одно слово
        //   in.nextLine();// вернет одну строку
        //    int a=in.nextInt();//не сможем записать в int другой тип
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(line);
        //String[] words=line.split(" ");
        String[] words = line.split(" +");
        //   System.out.println(Arrays.toString(words));
        //      if (line.matches("\\+7\\([0-9]{3}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}")) {
        //          System.out.println("OK");
        //      }
        line = line.replaceAll("-", "");
        System.out.println(line);
        String[] params = line.split("[()]");
        System.out.println(line);
        System.out.println(Arrays.toString(params));

        String s = "abc";
        s.length();
        s.charAt(0);// вернет символ под данным индексом
        System.out.println(s.contains("ab"));// содержит ли строка такую подстроку
        System.out.println(s.indexOf("ab"));//вернет индекс элемента,с к-рого начинается эта подстрока
        System.out.println(s.indexOf('c'));//вернет индекс элемента
        s.startsWith("ab");// начинается ли строка с такой подстроки
        s.endsWith("bc");

        System.out.println(s.compareTo("bbc"));//сравнение строк "abc"<"bbc", получим число <0
        s.equals("abc");
        s.substring(1,2);//вернет подстроку с указанного по указанный индекс
        s.toCharArray(); //вернет массив  символов
    }


}
