package day11.task2;

public class Paladin extends Hero implements Healer {
    public int heal = 25;
    public int healTeammate = 10;

    public Paladin() {

        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + heal > 100) {
            health = 100;
        } else {
            health += heal;
        }
    }

    @Override
    public void healTeammate(Hero hero) {

        if (hero.health + healTeammate > 100) {
            hero.health = 100;
        } else {
            hero.health += healTeammate;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}


