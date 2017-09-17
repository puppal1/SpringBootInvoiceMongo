package com.puppal.invoice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.puppal.invoice.model.InvoicePaymentModel;

public interface InvoicePaymentRepository extends MongoRepository<InvoicePaymentModel, String>{

	public InvoicePaymentModel findByInvoiceItemId(String invoiceItemId);
	
	@SuppressWarnings("unchecked")
	public InvoicePaymentModel save(InvoicePaymentModel invoicePaymentModel);
}
