package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt = 15;
    public int heal = 50;
    public int healTeammate = 30;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
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
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef) > 0) {
            hero.health -= magicAtt * (1 - hero.magicDef);
        }
        else {
            hero.health = 0;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}


