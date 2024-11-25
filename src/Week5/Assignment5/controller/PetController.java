package Week5.Assignment5.controller;

import Week5.Assignment5.model.Pet;
import Week5.Assignment5.view.PetView;

public class PetController {
    private Pet pet;
    private PetView view;
    private volatile double targetX, targetY;
    private volatile boolean isMoving = false;
    private volatile boolean shutdownRequested = false;

    public PetController(double startX, double startY, PetView view) {
        this.pet = new Pet(startX, startY);
        this.view = view;
        new Thread(this::runMovementLoop).start();
    }

    public void updateTargetPosition(double x, double y) {
        this.targetX = x;
        this.targetY = y;
        isMoving = true; // Trigger movement
    }

    public void requestShutdown() {
        shutdownRequested = true; // Set the shutdown flag to true
    }

    private void runMovementLoop() {
        while (!shutdownRequested) { // Run the loop as long as shutdown is not requested
            if (isMoving) {
                pet.moveTowards(targetX, targetY);

                // Stop if the pet has reached the target
                if (Math.abs(pet.getX() - targetX) < 1 && Math.abs(pet.getY() - targetY) < 1) {
                    isMoving = false;
                }

                // Update the GUI safely
                view.updateCanvas();
            }

            // Sleep for smoother animation (approx. 60 FPS)
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopPet() {
        isMoving = false;
    }

    public double getPetX() {
        return pet.getX();
    }

    public double getPetY() {
        return pet.getY();
    }
}
