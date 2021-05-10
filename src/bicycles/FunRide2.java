package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide2 {
   int max;
   int allBikeCount = 0;
    private List <Bicycles> bicycleTypesList = new ArrayList<Bicycles>() ;

       FunRide2(int max){
          this.max=max;

       }
       public void accept(BicycleType bicycles){
            if((!bicycleTypesList.contains(bicycles)) && (this.max > bicycleTypesList.size())){
               allBikeCount++;
              // bicycleTypesList.add(bicycles);
            }else{
                System.out.println("We can't accept rides anymore.");
            }

       }

       public BicycleType getCountForType(BicycleType bicycleType){

           for (Bicycles bicycles:bicycleTypesList) {
                if (bicycles.getBicycleType() == bicycleType){
                     allBikeCount++;

                }
           }
            return bicycleType;
       }

    public int getEnteredCount(){
           return  bicycleTypesList.size();

    }
}
