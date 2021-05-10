package bicycles;

public abstract class BicycleBase implements  Bicycles{

    private  int speed = 0;

    public void changeSpeed(int x ) {
       speed = x;
    }


    @Override
    public int CurrentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;

    }

    public abstract BicycleType getBicycleType();

    public abstract void stopRide();
}
