package bicycles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunRide {

    static Scanner d = new Scanner(System.in);

    static int maxCap;
    private static List bicycleTypesList = new ArrayList();
    static int numOfBikes;

    public static void main(String[] args) {

        maxCap = 9;

        while (true) {
            System.out.println("Welcome to the Sino funRide, what would you like to do?");
            System.out.println("1. Register \n2. See number of registrations with a specific bike \n3. See number of registered bikes");
            int si = d.nextInt();

            if (si == 1) {
                accept(maxCap);
            }
            if (si == 2) {
                getCountForType("Mountain Bike");
            }
            if (si == 3) {
                getEnteredCount(bicycleTypesList);
            }
        }

    }

    static void accept(int capacity) {
        // bicycleTypesList.add("Mountain Bike"); //not sure if these should be added from the start or they should all be added by the user
        // bicycleTypesList.add("Road Bike");
        // bicycleTypesList.add("Tandem");

//        numOfBikes = 0;

//        System.out.println("There are " +(capacity-numOfBikes) + " spots left, enter 'yes' to register and 'no' to quit.");
//        String enterBike = d.nextLine();

//        if (enterBike.toLowerCase().equals("yes")) {

        if (numOfBikes < capacity) {
            System.out.println("Please pick a number corresponding to your bicycle type");
            System.out.println("1. Mountain Bike \n2. Road Bike \n3. Tandem");
//            System.out.println(numOfBikes);
            // System.out.println("Please pick a number corresponding to your bicycle type between 1 and 3 \n1. Mountain Bike \n2. Road Bike \n3. Tandem");
            int bikeType = d.nextInt();
            switch (bikeType) {
                case 1:
                    bicycleTypesList.add("Mountain Bike");
                    break;
                case 2:
                    bicycleTypesList.add("Road Bike");
                    break;
                case 3:
                    bicycleTypesList.add("Tandem");
                    break;
            }

//            if (bikeType == 1) {
//                bicycleTypesList.add("Mountain Bike");
//            }
//            if (bikeType == 2) {
//                bicycleTypesList.add("Road Bike");
//            }
//            if (bikeType == 3) {
//                bicycleTypesList.add("Tandem");
//            }
            numOfBikes++;
            System.out.println("Your " + bicycleTypesList.get(bicycleTypesList.size() - 1) + " bicycle has been entered for the run. Have fun!");
        } else {
            System.out.println("Registered bikes has reached the maximum capacity of " + capacity + ", we look forward to seeing you next time. Thank you.");
        }
    }


    static int getCountForType(String mountain_bike) {

        String BikeTyper = "";

        System.out.println("Please choose your interest between 1 and 3 \n1. Mountain Bike \n2. Road Bike \n3. Tandem");

        int BikeType = d.nextInt();
        switch (BikeType) {
            case 1:
                BikeTyper = "Mountain Bike";
                break;
            case 2:
                BikeTyper = "Road Bike";
                break;
            case 3:
                BikeTyper = "Tandem";
                break;
        }

        int bikeCount = 0;

        for (int s = 0; s < bicycleTypesList.size(); s++) {
            if (bicycleTypesList.get(s) == BikeTyper) {
                bikeCount++;
            }
        }
        if (bikeCount > 1) {
            System.out.println("The " + BikeTyper + " has been registered " + bikeCount + " times for the run.");
        } else if (bikeCount == 0) {
            System.out.println("That bike type has not been registered yet");
        } else {
            System.out.println("There is only " + bikeCount + " registered " + BikeTyper + " for the run.");
        }
        return BikeType;
    }


    static void getEnteredCount(List themBikes) {
        if (themBikes.size() == 1) {
            System.out.println("There is only 1 bike registered so far.");
        } else {
            System.out.println("There are " + themBikes.size() + " bikes entered so far.");
        }
    }

   // static abstract void accept();


    //public static void accept() {

    }
//}
