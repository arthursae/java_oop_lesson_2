package SomeGame;

public interface Health {

    void showCurrentHealthLevel();

    void showMaxHealthLevel();

    void increaseHealth(int points);

    void decreaseHealth(int points);

    void die();

}
