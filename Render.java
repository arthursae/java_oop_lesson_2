package SomeGame;

public class Render {
    public static final String ANSI_RESET = "\u001B[0m";
    //public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    //public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    //public static final String ANSI_CYAN = "\u001B[36m";
    //public static final String ANSI_WHITE = "\u001B[37m";

    public void showIndicator(Object someObject) {
        if (someObject instanceof Mana) {
            ((Health) someObject).showCurrentHealthLevel();
            ((Health) someObject).showMaxHealthLevel();
            ((Mana) someObject).showCurrentManaLevel();
            ((Mana) someObject).showMaxManaLevel();
        } else {
            ((Health) someObject).showCurrentHealthLevel();
            ((Health) someObject).showMaxHealthLevel();
        }
    }

    public void showHealthBar(Health someObject) {
        String symbol = "x";
        int currentLevel = someObject.getCurrentHealthLevel();
        int maxLevel = someObject.getMaxHealthLevel();
        String output = "Current health level: ";
        double percentage = (double) currentLevel / maxLevel;
        int scale = (int) Math.pow(10, 2);
        double result = (double) Math.round(percentage * scale) / scale * 10;
        output += result * 10 + "% [";

        if (result > 0 && result <= 2.5) {
            output = ANSI_RED + output;
        } else if (result > 2.5 && result <= 5.0) {
            output = ANSI_PURPLE + output;
        } else if (result > 5.0 && result <= 7.5) {
            output = ANSI_YELLOW + output;
        } else if (result > 7.5) {
            output = ANSI_GREEN + output;
        }

        for (int i = 1; i < maxLevel / 10 + 1; i++) {
            if (i <= result) {
                output += symbol;
            } else {
                output += "_";
            }
        }
        output += "]\n";
        System.out.print(output + ANSI_RESET);
    }

    public void showManaBar(Mana someObject) {
        String symbol = "x";
        int currentLevel = ((Mana) someObject).getCurrentManaLevel();
        int maxLevel = ((Mana) someObject).getMaxManaLevel();
        String output = "Current mana level: ";
        double percentage = (double) currentLevel / maxLevel;
        int scale = (int) Math.pow(10, 2);
        double result = (double) Math.round(percentage * scale) / scale * 10;
        output += result * 10 + "% [";

        if (result > 0 && result <= 2.5) {
            output = ANSI_RED + output;
        } else if (result > 2.5 && result <= 5.0) {
            output = ANSI_PURPLE + output;
        } else if (result > 5.0 && result <= 7.5) {
            output = ANSI_YELLOW + output;
        } else if (result > 7.5) {
            output = ANSI_GREEN + output;
        }

        for (int i = 1; i < maxLevel / 10 + 1; i++) {
            if (i <= result) {
                output += symbol;
            } else {
                output += "_";
            }
        }

        output += "]\n";
        System.out.print(output + ANSI_RESET);
    }
}
