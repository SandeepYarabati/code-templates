package OpenClosedPrinciple;

public class PayApp {
    public static void main(String[] args) {

        // choose a payment strategy dynamically
        Payment payment = new UPIPayment();

        PaymentService service = new PaymentService(payment);
        service.payAmount();

        // Now without changing PaymentService,
        // switching strategy:
        service = new PaymentService(new WalletPayment());
        service.payAmount();

        service = new PaymentService(new CashPayment());
        service.payAmount();
    }
}
