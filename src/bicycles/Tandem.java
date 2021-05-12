package bicycles;

public class Tandem implements Bicycles {

        private int speed = 0;
    @Override
    public void accelerate() {
          speed += 12;
    }

    @Override
    public void brake() {
        speed -= 7;
    }

    @Override
    public int CurrentSpeed() {
        return  speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public BicycleType getBicycleType(){
        return BicycleType.Tandem;
    };
}
