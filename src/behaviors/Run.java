package behaviors;

import interfaces.MovementBehavior;

public class Run implements MovementBehavior {
    public void move() {
        System.out.println("Corriendo...");
    }
}