package Hard.Gallow;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Hanged picture = new Hanged();
        Player playerFirst = new Player();
        Player playerSecond = new Player();
        System.out.println("Первый игрок вводит имя");
        playerFirst.getName();
        System.out.println("Второй игрок вводит имя");
        playerSecond.getName();
        System.out.println(playerFirst.name + " загадывает слово: ");
        String slowo = new Scanner(System.in).next().trim();
        boolean found = false;

        char [] slowoArray = slowo.toCharArray();
        StringBuilder result = new StringBuilder();


        for (int symb = 0; symb < slowoArray.length; symb++) {
            slowoArray[symb] = '*';
            System.out.print(slowoArray[symb]);
        }
        System.out.println();
        while (picture.getCountMiss() < 3){
            System.out.println("\n" + playerSecond.name + " вводит букву");
            char bukwa = new Scanner(System.in).next().charAt(0);
            result.setLength(0);
            for (int i = 0; i < slowoArray.length; i++) {
                if (slowo.charAt(i) == bukwa) {
                    result.append(bukwa);
                    found = true;
                } else if (!found){ result.append(slowoArray[i]);


                    System.out.println("Здесь нет такой буквы");
                    picture.countFalse();
                }
                //result.append(slowoArray[i]);

            }
            System.out.println(result.toString());

        }

        System.out.println("Вы проиграли \uD83D\uDC80");



// он высчитывает по массиву все символы так в слове из 3 букв 1 верна, а 2 коунт++
        //нужно чтоб был фолс или тру если есть буква
    }



}
