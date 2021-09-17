import java.util.Scanner;

public class SphereVolume {

    public static void main(String[] args) 
    { 
        //Scanner
       Scanner scanner = new Scanner(System.in);
      
       double diam;
       double volume;
      
       System.out.println("Enter diam of sphere : ");
            diam = scanner.nextDouble();
      
       //find radius of sphere
       double radius = diam/2;
      
        //volume of the sphere
       volume = (4/3.0) * Math.PI * Math.pow(radius, 3.0);
       
        //print volume
       System.out.println("Volume of the sphere : "+volume);
    }
} 
