package bicycles;

public class BikeRideOne {
    public BikeRideOne(Object bicycles) {
    }

    public void ride() {
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.accelerate();
        this.bicycles.brake();
        this.bicycles.brake();
        this.bicycles.accelerate();
    }



    Bicycles bicycles = new Bicycles() {
        @Override
        public void AccelerateSpeed() {

        }

        @Override
        public void BrakeSpeed() {

        }

        @Override
        public int CurrentSpeed() {
            return CurrentSpeed();
        }

        @Override
        public void stop() {

        }

        @Override
        public void accelerate() {

        }

        @Override
        public void brake() {

        }
    };
//    BikeRideOne bikeRideOne = new BikeRideOne(bicycles);
//    bikeRideOne.ride();
//
//System.out.println(bikeRideOne.currentSpeed());
}
