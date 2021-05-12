package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccellerate() {
        RoadBike roadBike = new RoadBike();

        roadBike.accelerate();
        assertEquals(11, roadBike.CurrentSpeed());
    }

    @Test
    public void shouldBrake() {
        MountainBike mountainBike = new MountainBike();

        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.accelerate();
        assertEquals(5, mountainBike.CurrentSpeed());
    }

    @Test
    public void shouldShowCurrentSpeed() {
        RoadBike roadBike = new RoadBike() {

        };
        roadBike.accelerate();
        roadBike.CurrentSpeed();
        assertEquals(11, roadBike.CurrentSpeed());
    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        RoadBike roadBike = new RoadBike() {

        };
        roadBike.accelerate();
        roadBike.accelerate();
        assertEquals(11, roadBike.CurrentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        MountainBike mountainBike = new MountainBike() {

        };
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.accelerate();
        assertEquals(5, mountainBike.CurrentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        RoadBike roadBike = new RoadBike() {

        };
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        roadBike.stop();
        assertEquals(0, roadBike.CurrentSpeed());

    }

    @Test
    public void TandemshouldAccellerate() {
        Tandem tandem = new Tandem() {

        };
        tandem.accelerate();
        assertEquals(12, tandem.CurrentSpeed());
    }

    @Test
    public void TandemshouldBrake() {
        Tandem tandem = new Tandem() {

        };
        tandem.accelerate();
        tandem.brake();
        assertEquals(5, tandem.CurrentSpeed());
    }

    @Test
    public void TandemshouldBeAbleToStop() {

        Tandem tandem = new Tandem() {

        };
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.stop();
        assertEquals(0, tandem.CurrentSpeed());

    }

    @org.testng.annotations.Test
    public void TandemshouldDoMultipleAccelerateAndBrakesCorrectly() {

        Tandem tandem = new Tandem() {

        };
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.brake();
        tandem.brake();
        assertEquals(3, tandem.CurrentSpeed());

    }

}