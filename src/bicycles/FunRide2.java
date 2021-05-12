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

       public void accept(Bicycles bicycles){
            if((!bicycleTypesList.contains(bicycles)) && (this.max > bicycleTypesList.size())){
               bicycleTypesList.add(bicycles);
              //  allBikeCount++;
            }else{
                System.out.println("We can't accept rides anymore.");
            }

       }

       public int  getCountForType(BicycleType bicycleType){

           for (Bicycles bicycles:bicycleTypesList) {
                if (bicycles.getBicycleType() == bicycleType){
                     allBikeCount++;
                }
           }
            return allBikeCount;
       }

    public int getEnteredCount(){
           return  bicycleTypesList.size();

    }
}
