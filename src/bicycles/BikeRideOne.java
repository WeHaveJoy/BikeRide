package bicycles;

public class BikeRideOne {
    private  int speed;
    public BikeRideOne(Object bicycles) {
    }


    Bicycles bicycles = new Bicycles() {
        @Override
        public void AccelerateSpeed() {
            speed += 2;
        }

        @Override
        public void BrakeSpeed() {
            speed -=1;
        }

        @Override
        public int CurrentSpeed() {
            return speed;
        }

        @Override
        public void stop() {
            speed = 0;
        }

        @Override
        public void accelerate() {
            speed += 2;
        }

        @Override
        public void brake() {
            speed -= 1;
        }
    };
    public void ride() {
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.brake();
        this.bicycles.brake();
        this.bicycles.accelerate();
    }
//    BikeRideOne bikeRideOne = new BikeRideOne(bicycles);
//    bikeRideOne.ride();
//
//System.out.println(bikeRideOne.currentSpeed());
}
