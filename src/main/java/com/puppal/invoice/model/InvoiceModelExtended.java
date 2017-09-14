package com.puppal.invoice.model;

import java.util.List;

public class InvoiceModelExtended {

	private InvoiceModel invoiceModel;
	private List<InvoiceItemModel> invoiceItems;
	private List<InvoicePaymentModel> invoicePaymentModel;
	
	

	public List<InvoicePaymentModel> getInvoicePaymentModel() {
		return invoicePaymentModel;
	}

	public void setInvoicePaymentModel(List<InvoicePaymentModel> invoicePaymentModel) {
		this.invoicePaymentModel = invoicePaymentModel;
	}

	public InvoiceModel getInvoiceModel() {
		return invoiceModel;
	}

	public void setInvoiceModel(InvoiceModel invoiceModel) {
		this.invoiceModel = invoiceModel;
	}

	public List<InvoiceItemModel> getInvoiceItems() {
		return invoiceItems;
	}

	public void setInvoiceItems(List<InvoiceItemModel> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

}
