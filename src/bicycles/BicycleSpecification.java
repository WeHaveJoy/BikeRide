package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brake;
    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brake = brakeSpeed;
        // initialize brakeSpeed private variable
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrake() {
        return brake;
    }
    // add getters for brakeSpeed
}
