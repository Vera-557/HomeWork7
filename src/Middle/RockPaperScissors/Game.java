package Middle.RockPaperScissors;

import Middle.GuessTheNumber1.Player;

import java.util.Scanner;

/*Написать игру “Камень-ножницы-бумага” Программа выбирает случайным образом число от 0 до 2. Под каждым номером
содержится либо камень, либо ножницы, либо бумага. Например: 0-камень, 1-ножницы, 2-бумага Программа предлагает
ввести вам число от 0 до 2. Если ваши числа совпали — то ничья, если нет — то камень бьёт ножницы, ножницы —
бумагу и т.д. Подсказка: Получить случайное число от 0 до 2 можно, используя такую конструкцию
(int) (Math.*random*() * 3) Math — это пакет java.lang, с которым вы встречались в предыдущих модулях.
 */
public class Game {
    public static void main(String[] args) {
        Computer computer = new Computer();

        System.out.println("Камень - Ножницы - Бумага?");
        System.out.println(" 0 - камень, 1 - ножницы, 2 - бумага");
        int computerNumber = computer.inviteNumber();
        int answer = new Scanner(System.in).nextInt();

        switch (answer){
            case 0 :
                if (computerNumber == 1) System.out.print("\nВы победили\n");
                if (computerNumber == 2) System.out.print("\nВы проиграли\n");
                System.out.print("\uD83D\uDC8E");
                break;
            case 1 :
                if (computerNumber == 2) System.out.print("\nВы победили\n");
                if (computerNumber == 0) System.out.print("\nВы проиграли\n");
                System.out.print("✂\uFE0F");
                break;
            case 2 :
                if (computerNumber == 0) System.out.print("\nВы победили\n");
                if (computerNumber == 1) System.out.print("\nВы проиграли\n");
                System.out.print("\uD83D\uDCC4");
                break;
        }
        System.out.print("   ⚔\uFE0F   ");

        switch (computerNumber){
            case 0 :
                System.out.print("\uD83D\uDC8E");
                break;
            case 1 :
                System.out.print("✂\uFE0F");
                break;
            case 2 :
                System.out.print("\uD83D\uDCC4");
                break;
        }

       if (answer == computerNumber){
           System.out.println("\nНичья");
       }

    }

}


