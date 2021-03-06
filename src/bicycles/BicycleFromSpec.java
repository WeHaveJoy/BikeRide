package bicycles;

public abstract class BicycleFromSpec extends  BicycleBase{
    private final bicycles.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec (bicycles.BicycleSpecification bicycleSpecification) {
        this.BicycleSpecification = bicycleSpecification;
    }

    public void AccelerateSpeed() {
       this.BicycleSpecification.getAccelerationSpeed();

    }


    public void BrakeSpeed() {
   this.BicycleSpecification.getBrake();
    }

    @Override
    public BicycleType getBicycleType(){
        this.BicycleSpecification.getBicycleType();
        return null;
    }

}
