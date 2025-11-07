package SingleResponsibilityPrinciple;

public class InvoiceRepository {

    public void save(Invoice invoice) {
        System.out.println("Invoice " + invoice.getInvoiceId() + " saved successfully");
    }
}
