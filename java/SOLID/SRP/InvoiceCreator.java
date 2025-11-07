package SingleResponsibilityPrinciple;

public class InvoiceCreator {

    public Invoice createInvoice() {
        System.out.println("Invoice Created");
        return new Invoice("INV001", 5000.00);
    }
}
