package bicycles;

public class MountainBike extends BicycleBase {
    // int speed = 0;
    @Override
    public void AccelerateSpeed() {
        //  speed += 5;
        changeSpeed(5);
    }

    @Override
    public void BrakeSpeed() {
        //speed -= 3;
        changeSpeed(-3);
    }

//    @Override
//    public int Current() {
//
//    }

//    @Override
//    public int CurrentSpeed() {
//        return 0;
//    }

//    @Override
//    public int CurrentSpeed() {
//        return CurrentSpeed();
//    }
//
//    @Override
//    public void stop() {
//        stop();
//    }
//}
}