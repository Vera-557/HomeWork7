package Middle.GuessTheNumber1;
/*
Написать игру “Угадай число”.
Должно быть 2 игрока. Первый (сама программа) загадывает число от 1 до 10. Второй должен угадать число,
вводя его на клавиатуре. Если число больше предложенного, программа должна выводить “число больше”,
если меньше — то “число меньше”. Должно быть 2 режима игры: без указания количество попыток и с
ограниченным числом попыток. Игра должны быть написана в ООП стиле, с использованием классов и методов.
 */

public class Player {
    private int tryCounter = 1;

    public void increaseTryCounter() {

        tryCounter++;
    }

    public int getTryCounter() {
        return tryCounter;
    }
}
