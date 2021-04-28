package bicycles;

public abstract class BicycleFromSpec extends  BicycleBase{
    public BicycleSpecification bicycleSpecification;

    public BicycleFromSpec (Bicycles bicycles) {

    }
//    @Override
    public void AccelerateSpeed() {
       changeSpeed(this.bicycleSpecification.getAccelerationSpeed());

    }


    public void BrakeSpeed() {
   changeSpeed(this.bicycleSpecification.getBrake());
    }

    public int Current(){
        return this.CurrentSpeed();
    }

//    @Override
    public void stopRide() {
        this.stop();
    }
}
