package Hard.Gallow;

public class Hanged {
   static private int countMiss = 0;
    public void countFalse(){
       countMiss ++;
       printHanged();
    }
    public int getCountMiss(){
        return countMiss;
    }

    public void printHanged(){
        switch (getCountMiss()){
            case 1:
                System.out.println("\n" +
                        "        ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⣄⠀⡇⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣷⠃⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠉⡀⠀⠀⠀⠀⠀");
                break;
            case 2:
                System.out.println("        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⣄⠀⡇⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣷⠃⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠉⡀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⡇⢂⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⡇⠀⢂⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠀⠃⠀⠀⢂⠀⠀⠀");
                break;
            case 3:
                System.out.println("        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⣄⠀⡇⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣷⠃⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠉⡀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⡇⢂⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⡇⠀⢂⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠀⠃⠀⠀⢂⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⠀⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡈⠈⡀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠰⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠆⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⠀⠀⠀⠈⡀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠠⠂⠀⠀⠀⠀⠀⠀⢁⠀⠀⠀");
                break;
        }
    }
}
