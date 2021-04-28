package bicycles;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    int myRides;

    public FunRide(){
      myRides = 5;
        }

        public void FunRide(String BikeType){
           FunRide ride = new FunRide();
           System.out.println(ride.myRides);

        }

    public void getCountForType() {
        List<String> list = new ArrayList<String>();
        list.add("Bike1");
        list.add("Bike2");
        list.add("Bike3");
    }


}
