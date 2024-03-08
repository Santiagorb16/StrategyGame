package behaviors;

import interfaces.MovementBehavior;

public class Walk implements MovementBehavior {
    public void move() {
        System.out.println("Caminando...");
    }
}
