public class BynarySearch {


    //O(log2(N))- сожность алгоритма- кол-во делений промежутка пополам
    public static double sqrt(int x) {
        double left = 0;
        double right = x;
        double epsilon = 0.000000000001;
        while (right - left > epsilon) {
            double middle = (left + right) / 2;
            if (middle * middle == x) {
                return middle;
            }
            if (middle * middle > x) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return left; //неважно вернем right или left

    }


    public static int BynarySearch(int key, int[] array) {

        //array have to be sorted
        //масссив должен ббыть сортирован
        int left = 0, right = array.length - 1;
        while (right - left >= 0) {
            int idx = (left + right) / 2;
            if (array[idx] == key) {
                return idx;
            }
            if (array[idx] > key) {
                right = idx - 1;
            } else {
                left = idx + 1;
            }

        }
return -1;

    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(sqrt(25798760));
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);


        System.out.println(BynarySearch(9,new int[]{1,2,3,4,5,6,7,8}));




    }


}
