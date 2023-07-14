package SomeGame;

public class Building implements Health {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
        System.out.println("Building");
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    // FIXME: 29.06.2023 Дописать нужное

    @Override
    public int getCurrentHealthLevel() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxHealthLevel() {
        return maxHealthPoint;
    }

    @Override
    public void showCurrentHealthLevel() {
        System.out.println(currentHealthPoint);
    }

    @Override
    public void showMaxHealthLevel() {
        System.out.println(maxHealthPoint);
    }

    @Override
    public void increaseHealth(int points) {
        if (currentHealthPoint < maxHealthPoint) {
            currentHealthPoint += points;

            if (currentHealthPoint > maxHealthPoint) {
                currentHealthPoint = maxHealthPoint;
            }
        } else {
            currentHealthPoint = maxHealthPoint;
        }
    }

    @Override
    public void decreaseHealth(int points) {
        if (currentHealthPoint > 0) {
            currentHealthPoint -= points;
            if (currentHealthPoint < 0) {
                currentHealthPoint = 0;
                die();
            }
        } else {
            currentHealthPoint = 0;
            die();
        }
    }

    @Override
    public void die() {
        System.out.println("The building is destroyed");
    }
}
