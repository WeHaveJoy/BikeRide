package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccellerate() {
        Bicycles bicycles = new RoadBike() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        assertEquals(11, bicycles.CurrentSpeed());
    }

    @Test
    public void shouldBrake() {
        Bicycles bicycles = new MountainBike() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        assertEquals(5, bicycles.CurrentSpeed());
    }

    @Test
    public void shouldShowCurrentSpeed() {
        Bicycles bicycles = new RoadBike() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.CurrentSpeed();
        assertEquals(-4, bicycles.CurrentSpeed());
    }

    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        Bicycles bicycles = new RoadBike() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.AccelerateSpeed();
        assertEquals(11, bicycles.CurrentSpeed());

    }

    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        Bicycles bicycles = new MountainBike() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.BrakeSpeed();
        assertEquals(-3, bicycles.CurrentSpeed());

    }

    @Test
    public void shouldBeAbleToStop() {

        Bicycles bicycles = new RoadBike() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.stop();
        assertEquals(0, bicycles.CurrentSpeed());

    }

    @Test
    public void TandemshouldAccellerate() {
        Bicycles bicycles = new Tandem() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        assertEquals(12, bicycles.CurrentSpeed());
    }

    @Test
    public void TandemshouldBrake() {
        Bicycles bicycles = new Tandem() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        assertEquals(-2, bicycles.CurrentSpeed());
    }

    @Test
    public void TandemshouldBeAbleToStop() {

        Bicycles bicycles = new Tandem() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.stop();
        assertEquals(0, bicycles.CurrentSpeed());

    }

    @org.testng.annotations.Test
    public void TandemshouldDoMultipleAccelerateAndBrakesCorrectly() {

        Bicycles bicycles = new Tandem() {
            @Override
            public void accelerate() {

            }

            @Override
            public void brake() {

            }
        };
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.AccelerateSpeed();
        bicycles.BrakeSpeed();
        bicycles.BrakeSpeed();
        assertEquals(3, bicycles.CurrentSpeed());

    }


//    @Test
//    public void shouldBeAbleToGetCountForType() {
//
//        FunRide bicycles = new FunRide() {
//             @Override
//            () {
//
//                return 2;
//            }
//        };
//
//        FunRide.getCountForType("Mountain Bike");
//        FunRide.getCountForType("Mountain Bike");
//        assertEquals( 2, FunRide.getCountForType("Mountain Bike"));
//
//    }
}