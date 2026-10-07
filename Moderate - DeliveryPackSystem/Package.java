public class Package {
	private String trackingNumber, receiverName;
	private double packageWeight;

	public Package(String trackingNumber, String receiverName, double packageWeight) {
		this.trackingNumber = trackingNumber;
		this.receiverName = receiverName;
		this.packageWeight = packageWeight;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public double getPackageWeight() {
		return packageWeight;
	}
}
