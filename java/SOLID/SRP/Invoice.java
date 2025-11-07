package SingleResponsibilityPrinciple;

public class Invoice {
	public String invoiceId;
	public double amount;
	public String getInvoiceId() {
		return invoiceId;
	}
	
	public double getAmount() {
		return amount;
	}

	public Invoice(String invoiceId, double amount) {
		this.invoiceId = invoiceId;
		this.amount = amount;
	}
	
	
	
}
