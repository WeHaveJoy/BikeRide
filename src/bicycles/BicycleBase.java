package bicycles;

public abstract class BicycleBase implements  Bicycle{

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

    public abstract void accelerate();

    public abstract void brake();

    public abstract BicycleType getBicycleType();

    public abstract void stopRide();
}
