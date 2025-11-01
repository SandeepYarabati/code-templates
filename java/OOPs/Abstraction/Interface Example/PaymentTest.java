package test;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentGateway gpay = new GooglePay();
        PaymentGateway cc = new CreditCard();

        gpay.pay();
        gpay.refund();

        cc.pay();
        cc.refund();
    }
}
