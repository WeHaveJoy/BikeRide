package bicycles;

    public interface Bicycles {
        public void AccelerateSpeed();

        public  void BrakeSpeed ();

       public int CurrentSpeed();

//       public int Current();

        public  void stop();

        public default BicycleType getBicycleType(BicycleType bicycleType){
            return bicycleType;
        }

        void accelerate();

        void brake();

//    private int speed = 0;
//        public void AccelerateSpeed ()
//        {
//            speed += 5;
//        }
//        public void BrakeSpeed ()
//        {
//            speed -= 3;
//        }
//        public int currentSpeed() {
//            return speed;
//        }
//        public void stop() {
//            speed = 0;
        }
//    }


