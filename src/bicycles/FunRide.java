package bicycles;

import java.util.ArrayList;
import java.util.List;


public class FunRide {
   int max;
   int allBikeCount = 0;
    private List <Bicycle> bicycleTypesList = new ArrayList<Bicycle>() ;

       FunRide(int max){
          this.max=max;
       }

       public void accept(Bicycle bicycle){
            if((!bicycleTypesList.contains(bicycle)) && (this.max > bicycleTypesList.size())){
               bicycleTypesList.add(bicycle);
              //  allBikeCount++;
            }else{
                System.out.println("We can't accept rides anymore.");
            }

       }

       public int  getCountForType(BicycleType bicycleType){

           for (Bicycle bicycle:bicycleTypesList) {
                if (bicycle.getBicycleType() == bicycleType){
                     allBikeCount++;
                }
           }
            return allBikeCount;
       }

    public int getEnteredCount(){
           return  bicycleTypesList.size();

    }
}
