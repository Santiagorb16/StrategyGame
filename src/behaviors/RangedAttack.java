package behaviors;

import interfaces.AttackBehavior;

public class RangedAttack implements AttackBehavior {
    public void attack() {
        System.out.println("Atacando desde lejos...");
    }
}
