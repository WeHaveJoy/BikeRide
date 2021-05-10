package bicycles;

public abstract class RoadBike extends BicycleBase {
    @Override
    public void AccelerateSpeed() {
        changeSpeed(11);
    }

    @Override
    public void BrakeSpeed() {
        changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType(){
        return BicycleType.RoadBike;
    };
}
