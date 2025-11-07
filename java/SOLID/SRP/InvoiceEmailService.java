package SingleResponsibilityPrinciple;

public class InvoiceEmailService {

    public void sendEmail(Invoice invoice) {
        System.out.println("Invoice Email sent for " + invoice.getInvoiceId());
    }
}
