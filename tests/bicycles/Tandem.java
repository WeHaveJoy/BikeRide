package bicycles;

public class Tandem implements Bicycles {

        private int speed = 0;
    @Override
    public void AccelerateSpeed() {
          speed += 12;
    }

    @Override
    public void BrakeSpeed() {
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
}
