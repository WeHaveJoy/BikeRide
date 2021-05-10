package bicycles;

public abstract class MountainBike extends BicycleBase {

    @Override
    public void AccelerateSpeed() {
        changeSpeed(5);
    }

    @Override
    public void BrakeSpeed() {
        changeSpeed(-3);
    }

    @Override
    public BicycleType getBicycleType(){
        return BicycleType.MountainBike;
    };
}