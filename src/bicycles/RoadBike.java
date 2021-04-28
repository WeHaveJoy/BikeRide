package bicycles;

public abstract class RoadBike extends BicycleBase {
    //int speed = 0;
    @Override
    public void AccelerateSpeed() {
        //  speed += 11;
        changeSpeed(11);
    }

    @Override
    public void BrakeSpeed() {
        //speed -= 4;
        changeSpeed(-4);
    }

//    @Override
//    public int CurrentSpeed() {
//        return CurrentSpeed();
//    }
//
//    @Override
//    public void stop() {
//        stop();
//    }

}
