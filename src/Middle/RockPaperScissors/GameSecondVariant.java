package Middle.RockPaperScissors;

import java.util.Scanner;

public class GameSecondVariant {


    public static void main(String[] args) {
        Computer computer = new Computer();

        System.out.println("Камень - Ножницы - Бумага?");
        System.out.println(" 0 - камень, 1 - ножницы, 2 - бумага");
        int computerNumber = computer.inviteNumber();
        int answer = new Scanner(System.in).nextInt();


        switch (answer) {
            case 0:
                if (computerNumber == 1) System.out.print("\nВы победили\n");
                if (computerNumber == 2) System.out.print("\nВы проиграли\n");
                System.out.print("\uD83D\uDC8E");
                break;
            case 1:
                if (computerNumber == 2) System.out.print("\nВы победили\n");
                if (computerNumber == 0) System.out.print("\nВы проиграли\n");
                System.out.print("✂\uFE0F");
                break;
            case 2:
                if (computerNumber == 0) System.out.print("\nВы победили\n");
                if (computerNumber == 1) System.out.print("\nВы проиграли\n");
                System.out.print("\uD83D\uDCC4");
                break;
        }
            System.out.print("   ⚔\uFE0F   ");

            switch (computerNumber) {
                case 0:
                    System.out.print("\uD83D\uDC8E");
                    break;
                case 1:
                    System.out.print("✂\uFE0F");
                    break;
                case 2:
                    System.out.print("\uD83D\uDCC4");
                    break;
            }

            if (answer == computerNumber) {
                System.out.println("\nНичья");
            }

        }


    }
