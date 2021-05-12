package bicycles;


public class RoadBike extends BicycleBase {

    public void accelerate() {
        changeSpeed(11);
    }


    public void brake() {
        changeSpeed(-4);
    }


    @Override
    public BicycleType getBicycleType(){
        return BicycleType.RoadBike;
    }

    @Override
    public void stopRide() {

    }

    ;
}
