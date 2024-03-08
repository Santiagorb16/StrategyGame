package Main;

import Unit.Unit;
import behaviors.MeleeAttack;
import behaviors.RangedAttack;
import behaviors.Run;
import behaviors.Walk;

public class Main {
    public static void main(String[] args) {
        Unit soldier = new Unit(new Walk(), new MeleeAttack());
        soldier.move();
        soldier.attack();

        soldier.setMovementBehavior(new Run());
        soldier.move();

        Unit archer = new Unit(new Walk(), new RangedAttack());
        archer.attack();
    }
}
