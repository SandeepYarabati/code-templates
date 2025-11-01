package test;

public interface PaymentGateway {
	
	default void pay() {
		System.out.println("paid the amount");
	}
	
	void refund();

}
