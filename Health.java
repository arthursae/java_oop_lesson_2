package SomeGame;

public interface Health {

    int getCurrentHealthLevel();

    int getMaxHealthLevel();

    void showCurrentHealthLevel();

    void showMaxHealthLevel();

    void increaseHealth(int points);

    void decreaseHealth(int points);

    void die();

}
