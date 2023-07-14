package SomeGame;

public class Homework {

    public static void main(String[] args) {
        Render render = new Render();

        Building building1 = new Building(100);
        building1.setCurrentHealthPoint(25);
        //render.showIndicator(building1); // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100
        render.showHealthBar(building1);

        Building building2 = new Building(100);
        building2.setCurrentHealthPoint(50);
        //render.showIndicator(building2); // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100
        render.showHealthBar(building2);

        Neutral neutral = new Neutral(100);
        neutral.setCurrentHealthPoint(75);
        //render.showIndicator(neutral);
        render.showHealthBar(neutral);

        Hero hero = new Hero(100, 100);
        hero.setCurrentHealthPoint(100);
        hero.setCurrentManaPoint(55);
        //render.showIndicator(hero);
        render.showHealthBar(hero);
        render.showManaBar(hero);


    }
}
