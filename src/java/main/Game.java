package main;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numRandom = new ArrayList<>();        //записываем в этот массив рандомные числа
        int max = 4;                              // максимальная длина массива
        int rundomnumber;                     //случайное число
        while (numRandom.size() < max) {
            rundomnumber = (int)(Math.random() * 10); //создадим случайное число
            if (numRandom.indexOf(rundomnumber) == -1) {         // проверим есть оно  у нас или нет
                numRandom.add(rundomnumber);         // записываем в массив т.к нету
            }
        }
//        int num1 = (int) (Math.random() * 10);
//        int num2 = (int) (Math.random() * 10);
//        int num3 = (int) (Math.random() * 10);
//        int num4 = (int) (Math.random() * 10);
//        String num = Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3) + Integer.toString(num4);

        boolean a = false;
        do {
            int bk = 0;
            int cow = 0;
            System.out.println("Введите набор цифр: ");
            String userNum = in.nextLine();
            char[] strUser = userNum.toCharArray();
            int[] numUser = new int [4];
            for (int i = 0; i < strUser.length; i++) {
                for (int j = 0; j < numUser.length; j++) {
                    numUser[j] = Character.getNumericValue(strUser[i]);
                }

            }
            for (int i = 0; i < numRandom.size(); i++) {
                for (int j = 0; j < numUser.length; j++) {
                    if (numRandom.get(i) == numUser[j] && (j == i)) {
                        bk += 1;
                    }
                    if (numRandom.get(i) == numUser[j] && (j != i)) {
                        cow += 1;
                    }
                }
            }
            System.out.println("коров: " + cow + " быков: " + bk);
            if (bk == 4) {
                a = true;
            }
            else {
                a = false;
            }
        } while (a == false);
    }
}
