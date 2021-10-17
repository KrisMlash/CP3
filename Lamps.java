

public class Lamps {
    
    boolean lampStatus;

     void Switch(){
        lampStatus = !lampStatus;
     }
     void displayLamp(){
         System.out.println(lampStatus);
     }
}