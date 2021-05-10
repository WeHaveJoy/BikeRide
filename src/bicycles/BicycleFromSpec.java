package bicycles;

public abstract class BicycleFromSpec extends  BicycleBase{
    private final bicycles.BicycleSpecification BicycleSpecification;

    public BicycleFromSpec (bicycles.BicycleSpecification bicycleSpecification) {
        this.BicycleSpecification = bicycleSpecification;
    }
    @Override
    public void AccelerateSpeed() {
       this.BicycleSpecification.getAccelerationSpeed();

    }

    @Override
    public void BrakeSpeed() {
   this.BicycleSpecification.getBrake();
    }

    @Override
    public BicycleType getBicycleType(){
        this.BicycleSpecification.getBicycleType();
        return null;
    }

}
