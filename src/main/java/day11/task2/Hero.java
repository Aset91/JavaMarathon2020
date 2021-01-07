package day11.task2;

public abstract class Hero implements PhysAttack{
    double health;
    double physAtt;
    double physDef;
    double magicDef;


    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackSc = physAtt * (1 - hero.physDef);
        if (hero.health - attackSc < 0) {
            hero.health = 0;

        }
        else {
            hero.health -= attackSc;
        }

    }
}
