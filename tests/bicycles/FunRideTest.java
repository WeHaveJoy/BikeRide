package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldBeAbleToAcceptOnly3Rides() {

        FunRide2 funRide2 = new FunRide2(3) {

        };
        Tandem tandem = new Tandem();

        funRide2.accept(tandem);
        funRide2.accept(tandem);
        funRide2.accept(tandem);
        assertEquals(1, funRide2.getCountForType(BicycleType.Tandem));
    }


    @Test
    public void shouldBeAbleToAcceptOnly6MountainBikeRides() {

        FunRide2 funRide2 = new FunRide2(6);

        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike2 = new MountainBike();
        MountainBike mountainBike3 = new MountainBike();

        funRide2.accept(mountainBike2);
        funRide2.accept(mountainBike3);
        funRide2.accept(mountainBike);
        funRide2.accept(mountainBike);
        funRide2.accept(mountainBike);
        funRide2.accept(mountainBike);
        assertEquals(3, funRide2.getCountForType(BicycleType.MountainBike));
    }


    @Test
    public void shouldBeAbleToAcceptOnly1RoadBikeRide() {

        FunRide2 funRide2 = new FunRide2(1) {

        };
        RoadBike roadBike = new RoadBike();
        funRide2.accept(roadBike);
        assertEquals(1, funRide2.getCountForType(BicycleType.RoadBike));
    }


    @Test
    public void shouldBeAbleToAcceptOnly7RidesFromAnyBikeType() {

        FunRide2 funRide2 = new FunRide2(7);
        RoadBike roadBike = new RoadBike();
        RoadBike roadBike2 = new RoadBike();
        RoadBike roadBike3 = new RoadBike();
        Tandem tandem = new Tandem();
        Tandem tandem2 = new Tandem();
        Tandem tandem3 = new Tandem();
        Tandem tandem4 = new Tandem();
        RoadBike roadBike4 = new RoadBike();
        RoadBike roadBike5 = new RoadBike();

        funRide2.accept(roadBike);
        funRide2.accept(tandem);
        funRide2.accept(tandem2);
        funRide2.accept(tandem3);
        funRide2.accept(tandem4);
        funRide2.accept(roadBike4);
        funRide2.accept(roadBike2);
        funRide2.accept(roadBike3);
        funRide2.accept(roadBike5);

        assertEquals(7, funRide2.getCountForType(BicycleType.Tandem), funRide2.getCountForType(BicycleType.RoadBike));
    }
}
