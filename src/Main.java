import java.util.Scanner;

/*
Question : Problem Description
Given the dimensions of a sphere, find out its surface area and volume.
_____________________________________________________________________________
Problem Solution
The surface area and volume of a sphere can be calculated using the formulas:
Surface Area = 4 * PI * (radius3) /3.
Volume = 4 * PI * (radius2).
____________________________________________________________________________________
Case 1 (Simple Test Case):
Enter the radius of the sphere
4.55
Volume = 394.56885292638566
Surface area = 260.15528764377075
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius,pi = 3.14,SurfaceArea,Volume;
        System.out.println("Enter the radius of sphere :");
        radius = sc.nextDouble();
        System.out.println("Printing the result :");
        SurfaceArea = 4 * pi * (radius * radius * radius) / 3;
        System.out.println("Surface Area : " + SurfaceArea);
        Volume = 4 * pi * radius * radius;
        System.out.println("Volume : " + Volume);
    }
}