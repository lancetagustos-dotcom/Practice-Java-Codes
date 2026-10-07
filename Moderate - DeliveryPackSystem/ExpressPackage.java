public class ExpressPackage extends Package {
	private double deliveryDistance;

	public ExpressPackage(String trackingNumber, String receiverName, double packageWeight, double deliveryDistance) {
		super(trackingNumber, receiverName, packageWeight);
		this.deliveryDistance = deliveryDistance;
	}
	
	public double getDeliveryDistance() {
		return deliveryDistance;
	}
	
	public double calculateDeliveryFee() {
		double totalFee = 50;

		if (getPackageWeight() <= 5) {
			totalFee += 20;
		} else {
			totalFee += 20 + ((getPackageWeight() - 5) * 10);
		}
		
		if (getDeliveryDistance() > 20) {
			totalFee += 100;
		}

		return totalFee;
	}

	public void displayPackageInfo() {
		System.out.println("\nPACKAGE INFORMATION");
		System.out.println("Tracking Number: " + getTrackingNumber());
		System.out.println("Name: " + getReceiverName());
		System.out.println("Package Weight: " + getPackageWeight());
		System.out.println("Distance: " + getDeliveryDistance());
		System.out.println();

		System.out.println("\nCALCULATED DELIVERY FEE");

		System.out.printf("Package Fee: PHP %.2f\n", calculateDeliveryFee());

	}

}
