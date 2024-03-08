package behaviors;

import interfaces.AttackBehavior;

public class MeleeAttack implements AttackBehavior {
    public void attack() {
        System.out.println("Atacando cuerpo a cuerpo...");
    }
}