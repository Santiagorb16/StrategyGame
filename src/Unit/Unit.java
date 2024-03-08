package Unit;

import interfaces.AttackBehavior;
import interfaces.MovementBehavior;

public class Unit {
    private MovementBehavior movementBehavior;
    private AttackBehavior attackBehavior;

    public Unit(MovementBehavior movementBehavior, AttackBehavior attackBehavior) {
        this.movementBehavior = movementBehavior;
        this.attackBehavior = attackBehavior;
    }

    public void move() {
        movementBehavior.move();
    }

    public void attack() {
        attackBehavior.attack();
    }

    public void setMovementBehavior(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}