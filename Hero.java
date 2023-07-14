package SomeGame;

public class Hero implements Health, Mana {
    @Override
    public int getCurrentHealthLevel() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxHealthLevel() {
        return maxHealthPoint;
    }

    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    public int getCurrentManaPoint() {
        return currentManaPoint;
    }

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;

        System.out.println("Hero");
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }


    // FIXME: 29.06.2023 Дописать нужное


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
        System.out.println("The hero is dead");
    }

    @Override
    public void showCurrentManaLevel() {
        System.out.println(currentManaPoint);
    }

    @Override
    public void showMaxManaLevel() {
        System.out.println(maxManaPoint);
    }

    @Override
    public int getCurrentManaLevel() {
        return currentManaPoint;
    }

    @Override
    public int getMaxManaLevel() {
        return maxManaPoint;
    }

    @Override
    public void increaseManaLevel(int points) {
        if (currentManaPoint < maxManaPoint) {
            currentManaPoint += points;

            if (currentManaPoint > maxManaPoint) {
                currentManaPoint = maxManaPoint;
            }
        } else {
            currentManaPoint = maxManaPoint;
        }
    }

    @Override
    public void decreaseManaLevel(int points) {
        if (currentManaPoint > 0) {
            currentManaPoint -= points;
            if (currentManaPoint < 0) {
                currentManaPoint = 0;
                helpless();
            }
        } else {
            currentManaPoint = 0;
            helpless();
        }
    }

    @Override
    public void helpless() {
        System.out.println("The hero has no energy");
    }
}
