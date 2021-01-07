package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef) >= 0) {
            hero.health -= magicAtt * (1 - hero.magicDef);
        }
        else {
            hero.health = 0;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}


