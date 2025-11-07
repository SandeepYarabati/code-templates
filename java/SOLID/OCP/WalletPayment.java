package OpenClosedPrinciple;

public class WalletPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("Pay through Wallet");
	}

}
