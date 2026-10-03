package hackathon_phase_1;
import java.util.Scanner;

public class WasteManagement {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Vehicle Details ");
        int vehicleNumber = sc.nextInt();
        double wasteCollected = 125.75;
        int collectionPoints = sc.nextInt();
        char vehicleStatus = 'A';

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        System.out.print("Enter waste collected in kg: ");
        double collectedWaste = sc.nextDouble();

        if (collectedWaste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        
        System.out.print("Enter waste collected at Point 1 : ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2 : ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        sc.close();
    }
}