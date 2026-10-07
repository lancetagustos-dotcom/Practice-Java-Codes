import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner jw = new Scanner(System.in);
        System.out.println("Problem Set 3: Delivery Package System\n");

        System.out.print("Enter Tracking Number: ");
        String trackingNumber = jw.nextLine();

        System.out.print("Enter Receiver Name: ");
        String receiverName = jw.nextLine();

        System.out.print("Enter Package Weight: ");
        double packageWeight = jw.nextDouble();

        System.out.print("Enter Delivery Distance: ");
        double deliveryDistance = jw.nextDouble();

        ExpressPackage myPackage = new ExpressPackage(trackingNumber, receiverName, packageWeight, deliveryDistance);

        myPackage.displayPackageInfo();
    }
}
