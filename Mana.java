package SomeGame;

public interface Mana {
    void showCurrentManaLevel();

    void showMaxManaLevel();

    int getCurrentManaLevel();

    int getMaxManaLevel();

    void increaseManaLevel(int points);

    void decreaseManaLevel(int points);

    void helpless();
}
