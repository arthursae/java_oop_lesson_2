package SomeGame;

import SomeGame.Building;

public class Homework {

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);
        render.showIndicator(building); // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100
        //render.showMeter();

        Neutral neutral = new Neutral(100);
        neutral.setCurrentHealthPoint(75);
        render.showIndicator(neutral);
        //render.showMeter();

        Hero hero = new Hero(100, 100);
        hero.setCurrentHealthPoint(90);
        hero.setCurrentManaPoint(55);
        render.showIndicator(hero);
        //render.showMeter();

    }
}
