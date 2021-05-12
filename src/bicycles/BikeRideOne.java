package bicycles;

public class BikeRideOne {
    private final Bicycle bicycles;

    public BikeRideOne(Bicycle bicycles){
        this.bicycles = bicycles;
    }

    public void bikeOneRide(){
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.brake();
        this.bicycles.brake();
        this.bicycles.brake();
        this.bicycles.brake();
    }

    public int getCurrentRideSpeed(){
        return this.bicycles.CurrentSpeed();
    }
}
