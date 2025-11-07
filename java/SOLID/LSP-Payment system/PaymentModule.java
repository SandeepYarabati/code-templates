package paymentSystem;

public class PaymentModule {
    public static void main(String[] args) {
        
        Payable cashPayment = new Cash();
        Payable cardPayment = new CreditCard();

        doPayment(cashPayment);
        doPayment(cardPayment);

        issueRefund(cashPayment);
        issueRefund(cardPayment);
    }

    static void doPayment(Payable payment) {
        payment.pay();
        if (payment instanceof Confirmable) {
            ((Confirmable) payment).confirmPayment();
        }
    }

    static void issueRefund(Payable payment) {
        if (payment instanceof Refundable) {
            ((Refundable) payment).refund();
        } else {
            System.out.println(payment.getClass().getSimpleName() + " does not support refunds");
        }
    }
}
