import java.util.Arrays;

public class Arrays_homewor {
    public static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {


            array[i] = (int) Math.round(Math.random());
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();

    }

    public static void task2() {
        int[] arr = new int[8];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;

        }

        for (int i = 0; i < arr.length; i++) {


            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void task3() {

        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }


    public static void task4() {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);


            }
            System.out.println();
        }
        System.out.println();
    }


    public static void task5() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {


            array[i] = (int) Math.round(Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

    public static boolean task6(int[] array) {
        boolean equationParts = false;

        for (int i = 0; i < array.length; i++) {
            int sumBefore = 0;
            int sumAfter = 0;
            for (int j = 0; j < i; j++) {
                sumBefore += array[j];
            }

            for (int j = i; j < array.length; j++) {
                sumAfter += array[j];
            }
            if (sumBefore == sumAfter) {

                equationParts = true;

                break;
            }


        }
        return equationParts;
    }

    public static boolean CheckBalance(int[] input) {
        StringBuilder result = new StringBuilder();
        int fullSum = 0;
        for (int el : input)
            fullSum += el;

        if (fullSum % 2 == 1) {
            return false;//есди не делится на 2, то не будет двух равных участков
        } else {
            int leftSum = 0;
            for (int el : input) {
                leftSum += el;
                if (leftSum == fullSum / 2) {
                    int sum = 0;
                    for (int elem : input) {
                        result.append(elem).append(' ');
                        sum += elem;
                        if (sum == leftSum) {

                            result.append("| ");
                        }
                    }
                    System.out.println(result);
                    return true;
                }
            }
            return false;
        }


    }

    public static void shift(int[] input, int n) {
        //12345  +1    51234
        //12345  -1     23451   -1==4
        //12345  +-10   12345     ==0   n%input.length=0
        if (n < 0) {
            n = -n;
            n = n % input.length;
            n = input.length - n;
        }
        n = n % input.length;
        for (int i = 0; i < n; i++) {
            int tmp = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = tmp;

        }

        System.out.println(Arrays.toString(input));
    }

    public static void shiftON(int[] input, int n) {

        if (n < 0) {
            n = -n;
            n = n % input.length;
            n = input.length - n;
        }
        n = n % input.length;
        int[] temp = new int[input.length];
        for (int i = n; i < n + input.length; i++) {
            temp[i - n] = input[i % input.length];
            //2:3=0, остаток 2
            //при делении меньщего на большее, остаток - это делитель
            //те мы не можем поделить меньшее на большее, поэтому оно у нас и остается
        }
        System.out.println(Arrays.toString(temp));

    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        System.out.println(task6(new int[]{1, 1, 1, 2, 1}));
        System.out.println(CheckBalance(new int[]{1, 5, 3, 2, 1}));

        // shift(new int[]{1, 2, 3, 4, 5}, 3);
        shiftON(new int[]{1, 2, 3, 4, 5}, 3);
        for (int i = 0; i < 5; i++) {
            System.out.println(i % 5);
        }


    }
}
