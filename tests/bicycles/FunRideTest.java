package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldBeAbleToAcceptOnly3Rides() {

        FunRide2 funRide2 = new FunRide2(3) {

        };
        funRide2.accept(BicycleType.Tandem);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.RoadBike);
    }


    @Test
    public void shouldBeAbleToAcceptOnly6Rides() {

        FunRide2 funRide2 = new FunRide2(6) {

        };
        funRide2.accept(BicycleType.Tandem);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.RoadBike);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.Tandem);
    }


    @Test
    public void shouldBeAbleToAcceptOnly10Rides() {

        FunRide2 funRide2 = new FunRide2(10) {

        };
        funRide2.accept(BicycleType.Tandem);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.RoadBike);
        funRide2.accept(BicycleType.Tandem);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.RoadBike);
        funRide2.accept(BicycleType.MountainBike);
        funRide2.accept(BicycleType.Tandem);
        funRide2.accept(BicycleType.RoadBike);
    }
}
