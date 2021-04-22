package bicycles;

public abstract class BicycleBase implements  Bicycles{

    private  int speed = 0;

    protected void changeSpeed(int x ) {
       speed = x;
    }

//    @Override
//    public void AccelerateSpeed() {
//
//    }
//
//    @Override
//    public void BrakeSpeed() {
//
//    }

    @Override
    public int CurrentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;

    }
}
