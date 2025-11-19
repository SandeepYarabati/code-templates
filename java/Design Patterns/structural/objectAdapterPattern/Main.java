package objectAdapterPattern;

public class Main {
	public static void main(String[] args) {
		RayzorPayAPI rpAPI = new RayzorPayAPI();
		PaymentGateway rpA = new RayzorPayAdapter(rpAPI);
		OrderService os = new OrderService(rpA);
		
		os.placeOrder(1000);
	}
}
