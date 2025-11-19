package objectAdapterPattern;

import java.math.BigDecimal;

public class RayzorPayAdapter implements PaymentGateway{
	private RayzorPayAPI rpay;
	
	public RayzorPayAdapter(RayzorPayAPI rp) {
		this.rpay=rp;
	}

	@Override
	public void pay(int amount) {
		rpay.makeTransaction(BigDecimal.valueOf(amount), "INR");
	}

}
