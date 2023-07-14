package SomeGame;

import static java.lang.Math.round;

public class Render {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void showIndicator(Object someObject) {

        //1 - Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
        //2 - Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.

        if (someObject instanceof Building || someObject instanceof Neutral) {
            ((Health) someObject).showCurrentHealthLevel();
            ((Health) someObject).showMaxHealthLevel();
        } else if (someObject instanceof Hero) {
            ((Hero) someObject).showCurrentHealthLevel();
            ((Hero) someObject).showMaxHealthLevel();
            ((Hero) someObject).showCurrentManaLevel();
            ((Hero) someObject).showMaxManaLevel();

        }
    }

    public void showMeter(Object someObject) {
        if (someObject instanceof Building) {
            int currentHP = ((Building) someObject).getCurrentHealthPoint();
            int maxHP = ((Building) someObject).getMaxHealthPoint();

            // Можно внедрить индикатор используя проценты текущего уровня currentHP от максимального maxHP
            // System.out.println(ANSI_RED + "This text has a red background but default text!" + ANSI_RESET);
            // System.out.println(ANSI_GREEN + "This text has a green background but default text!" + ANSI_RESET);

        }
    }
}
