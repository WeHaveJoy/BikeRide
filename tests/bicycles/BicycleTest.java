package bicycles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccellerate() {
        Bicycles bicycles = new RoadBike();
        bicycles.AccelerateSpeed();
        assertEquals(11, bicycles.CurrentSpeed());
    }

    @Test
    public void shouldBrake() {
        Bicycles bicycles = new MountainBike();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        assertEquals(5, bicycles.CurrentSpeed());
    }
    @Test
    public void shouldShowCurrentSpeed() {
        Bicycles bicycles = new RoadBike();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.CurrentSpeed();
        assertEquals(-4, bicycles.CurrentSpeed());
    }
    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        Bicycles bicycles = new RoadBike();
        bicycles.AccelerateSpeed();
        bicycles.AccelerateSpeed();
        assertEquals(11, bicycles.CurrentSpeed());

    }
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        Bicycles bicycles = new MountainBike();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.BrakeSpeed();
        assertEquals(-3, bicycles.CurrentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        Bicycles bicycles = new RoadBike();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.stop();
        assertEquals(0, bicycles.CurrentSpeed());

    }

    @Test
    public void TandemshouldAccellerate() {
        Bicycles bicycles = new Tandem();
        bicycles.AccelerateSpeed();
        assertEquals(12, bicycles.CurrentSpeed());
    }

    @Test
    public void TandemshouldBrake() {
        Bicycles bicycles = new Tandem();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        assertEquals(-2, bicycles.CurrentSpeed());
    }

    @Test
    public void TandemshouldBeAbleToStop() {

        Bicycles bicycles = new Tandem();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.stop();
        assertEquals(0, bicycles.CurrentSpeed());

    }

    @Test
    public void TandemshouldDoMultipleAccelerateAndBrakesCorrectly() {

        Bicycles bicycles = new Tandem();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.BrakeSpeed();
        assertEquals(3, bicycles.CurrentSpeed());

    }

}
