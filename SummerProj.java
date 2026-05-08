import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;   


public class SummerProj {

  public static void main(String[] args) throws java.io.FileNotFoundException {
  
    Scanner firstStation = new Scanner(System.in);
    metro metromap = new metro();
    File timeFile = new File("Metrolink_times_linecolour(in).csv");

    Scanner inputStation = new Scanner(System.in);
    boolean validStation = false;
    
    while (!validStation){ 
      System.out.println("Enter starting train station: ");
      String startStation = inputStation.nextLine();
      if (validStation(metromap, startStation)){
        validStation = true;
      }else {
        System.out.println(startStation + "is not a station");
      }
    System.out.println("Valid station");
    }

    boolean validStation = false;
    
    while (!validStation){ 
      System.out.println("Enter ending train station: ");
      String finalStation = inputStation.nextLine();
      if (validStation(metromap, finalStation)){
        validStation = true;
      }else {
        System.out.println(finalStation + "is not a station");
      }
    System.out.println("Valid end station");
    }


  }
}
