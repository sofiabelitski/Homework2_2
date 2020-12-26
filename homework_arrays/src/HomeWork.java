import java.util.Scanner;


public class HomeWork {
    public static void GuessNumberGame() {
        int number = (int) (Math.random() * 1000);
        Scanner in = new Scanner(System.in);
        int tryCount = 10;
        System.out.println("Угадайте число от 0 до 100");
        int userAnswer = in.nextInt();
        while (tryCount > 0) {
  if (userAnswer == number) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                userAnswer = in.nextInt();
                if (userAnswer == 1) {
                    GuessNumberGame();
                } else {
                    return;
                }
            } else if (userAnswer > number) {
                System.out.println("Ваше число больше");
                tryCount--;
                System.out.println("Попробуйте еще. Осталось " + tryCount + " попыток");
                userAnswer = in.nextInt();

            } else {
                System.out.println("Ваше число меньше");
                tryCount--;
                System.out.println("Попробуйте еще. Осталось " + tryCount + " попыток");
                userAnswer = in.nextInt();
            }
        }
        System.out.println("Вы проиграли!");
    }




    public static void GuessWordGame() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int number = (int) ((Math.random() * (words.length-1)));
        String  word=words[number];
        Scanner in = new Scanner(System.in);

        System.out.println("Угадайте слово");
        String userAnswer = in.next();
        while (true) {
            if (userAnswer.equals(word)) {
                System.out.println("Вы угадали!");
                 return;
            } else  {
                StringBuffer progress =new StringBuffer("##############");

                for (int i = 0; i < word.length() ; i++) {
                  if (word.charAt(i)==userAnswer.charAt(i)){
                      progress.deleteCharAt(i);
                      progress.insert(i,word.charAt(i));
                  }

                }
                System.out.println("Ваш прогресс:");
                System.out.println(progress);
                System.out.println("Попробуйте еще.");
                userAnswer = in.next();

            }
        }

    }


    public static void main(String[] args) {
    //    GuessNumberGame();
        GuessWordGame();
    }


}
