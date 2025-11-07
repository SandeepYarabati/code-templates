package SingleResponsibilityPrinciple;

public class InvoiceService {
    public static void main(String[] args) {

        InvoiceCreator creator = new InvoiceCreator();
        InvoiceRepository repository = new InvoiceRepository();
        InvoiceEmailService emailService = new InvoiceEmailService();

        Invoice invoice = creator.createInvoice();
        repository.save(invoice);
        emailService.sendEmail(invoice);
    }
}
