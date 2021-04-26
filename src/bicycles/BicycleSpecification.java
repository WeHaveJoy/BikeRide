package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brake;
    private BicycleType bicycleType;
    // add a variable for brakeSpeed

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brake = brakeSpeed;
        // initialize brakeSpeed private variable
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrake() {
        return brake;
    }
    // add getters for brakeSpeed

        public BicycleType getBicycleType(){
            return bicycleType;
        }
        // add getters for brakeSpeed
    }



