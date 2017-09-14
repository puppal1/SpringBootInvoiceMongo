package com.puppal.invoice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.puppal.invoice.model.InvoicePaymentModel;

public interface InvoicePaymentRepository extends MongoRepository<InvoicePaymentModel, String>{

	public InvoicePaymentModel findByInvoiceItemId(long invoiceItemId);
	public  List <InvoicePaymentModel>  findByInvoiceId(long invoiceId);
	@SuppressWarnings("unchecked")
	public InvoicePaymentModel save(InvoicePaymentModel invoicePaymentModel);
}
