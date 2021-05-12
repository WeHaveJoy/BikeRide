package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldBeAbleToAcceptOnly3Rides() {

        FunRide funRide = new FunRide(3) {

        };
        Tandem tandem = new Tandem();

        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);
        assertEquals(1, funRide.getCountForType(BicycleType.Tandem));
    }


    @Test
    public void shouldBeAbleToAcceptOnly6MountainBikeRides() {

        FunRide funRide = new FunRide(6);

        MountainBike mountainBike = new MountainBike();
        MountainBike mountainBike2 = new MountainBike();
        MountainBike mountainBike3 = new MountainBike();

        funRide.accept(mountainBike2);
        funRide.accept(mountainBike3);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        assertEquals(3, funRide.getCountForType(BicycleType.MountainBike));
    }


    @Test
    public void shouldBeAbleToAcceptOnly1RoadBikeRide() {

        FunRide funRide = new FunRide(1) {

        };
        RoadBike roadBike = new RoadBike();
        funRide.accept(roadBike);
        assertEquals(1, funRide.getCountForType(BicycleType.RoadBike));
    }


    @Test
    public void shouldBeAbleToAcceptOnly7RidesFromAnyBikeType() {

        FunRide funRide = new FunRide(7);
        RoadBike roadBike = new RoadBike();
        RoadBike roadBike2 = new RoadBike();
        RoadBike roadBike3 = new RoadBike();
        Tandem tandem = new Tandem();
        Tandem tandem2 = new Tandem();
        Tandem tandem3 = new Tandem();
        Tandem tandem4 = new Tandem();
        RoadBike roadBike4 = new RoadBike();
        RoadBike roadBike5 = new RoadBike();

        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(tandem2);
        funRide.accept(tandem3);
        funRide.accept(tandem4);
        funRide.accept(roadBike4);
        funRide.accept(roadBike2);
        funRide.accept(roadBike3);
        funRide.accept(roadBike5);

        assertEquals(7, funRide.getCountForType(BicycleType.Tandem), funRide.getCountForType(BicycleType.RoadBike));
    }
}
