import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class SoulmateFinder {
    public static Scanner input = new Scanner(System.in);
    public static boolean overlappingJourneys(int start_journey1, int end_journey1, int start_journey2, int end_journey2){
        boolean a = false;
        if (start_journey2<end_journey1){
             return a = true;
        }
        return a;
    }
    public static int getTravellers(int start_journey, int end_journey){
        System.out.println("Enter the overall number of travellers on the train: ");
        int num_travellers= input.nextInt();
        int potential_soulmate =0;
        for(int i = 0; i < num_travellers; i+=1) {
            System.out.println("Enter the traveller's name: ");

            String traveller_name = input.next();

            System.out.println("Enter the boarding station: ");
            int boarding_station = input.nextInt();

            System.out.println("Enter the exit station: ");
            int exit_station = input.nextInt();
            if (overlappingJourneys(start_journey, end_journey, boarding_station, exit_station)) {
                potential_soulmate += 1;
                System.out.println(traveller_name + " might be the soulmate.");
            } else {
                System.out.println(traveller_name + " is not the soulmate.");
            }
        }return potential_soulmate;

    }
    public static boolean overlappingLongJourneys(int start_journey1, int end_journey1, int start_journey2, int end_journey2, int n){
        int num_stops = end_journey1-start_journey2;
        boolean a = false;
        if (num_stops>=n){
            a=true;
        } return a;
    }
    public static void main(String []args){


        try {
            if (args.length==0){
                System.out.println("Where did your journey start? ");
                int start_journey= input.nextInt();
                System.out.println("Where did your journey end? ");
                int end_journey= input.nextInt();
                int potential_soulmates=getTravellers(start_journey,end_journey);
                System.out.println("Number of potential soulmates: "+ potential_soulmates);


            } else {
                for (int j =0; j<args.length; j++ ){
                    File arg = new File(args[j]);
                    Scanner reader= new Scanner(arg);
                    
                    System.out.println("Where did your journey start? ");
                    int start_journey= input.nextInt();
                    System.out.println("Where did your journey end? ");
                    while (reader.hasNext()) {
                        int end_journey = input.nextInt();
                        String travellersName = reader.next();
                        int boarding_station = reader.nextInt();
                        int exit_station = reader.nextInt();
                    }
                }

            }


        }catch (FileNotFoundException e) {
            System.err.println("Warning: " + e +" not found.");
        }
    }
}


