package application1;

public class Main {
	public static void main(String[] args) {

		String occOrderId = "t609361";
		String subOrder = "t609361DAME01";
		System.out.println("result:" + getHubfromSubOrder(occOrderId, subOrder));

	}

	private static String getHubfromSubOrder(String occOrderId, String subOrder) {
		System.out.println("getHubfromSubOrder() - occOrderId: {" + occOrderId + "}, subOrder: {" + subOrder + "}");
		String identificationLetter = "";
		String hub = "";

		if (occOrderId != null && subOrder != null && !occOrderId.isEmpty() && !subOrder.isEmpty()) {
			identificationLetter = subOrder.replace(occOrderId, "").toLowerCase().substring(0, 1);
		}
		System.out.println("getHubfromSubOrder() - identificationLetter: {" + identificationLetter + "}");
		
		switch (identificationLetter) {
		case "a":
			hub = "AMEX";
			break;
		case "h":
			hub = "LTM";
			break;
		case "v":
			hub = "VIAVAREJO";
			break;
		case "l":
			hub = "LOYALTY";
			break;
		case "b":
			hub = "B2W";
			break;
		}
		System.out.println("getHubfromSubOrder() - hub: {" + hub + "}");
		return hub;
	}
}
