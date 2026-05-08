import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;   
          


public class SummerProj {
  public static void main(String[] args) throws java.io.FileNotFoundException {
    
  
    Scanner firstStation = new Scanner(System.in);

    System.out.println("Enter starting train station: ");
    String startStation = firstStation.nextLine();

    
    File timeFile = new File("Metrolink_times_linecolour(in).csv");
    try (Scanner myReader = new Scanner(timeFile)) {
      int count=0;
      while (count == 0){
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          if (data.contains(startStation) == true) {
            count++;
            break;
          }
        }
        System.out.println("Enter a valid station:");
        startStation = firstStation.nextLine();

      }
    }
  }
}
