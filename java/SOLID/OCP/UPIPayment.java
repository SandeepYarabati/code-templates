package OpenClosedPrinciple;

public class UPIPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("pay through UPI");
	}

}
