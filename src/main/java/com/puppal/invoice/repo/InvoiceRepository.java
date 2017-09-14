package com.puppal.invoice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.puppal.invoice.model.InvoiceModel;

public interface InvoiceRepository extends MongoRepository<InvoiceModel, String> {

	public List <InvoiceModel> findByCustomerAccountId(long customerAccountId);
	public  InvoiceModel findByInvoiceId(long invoiceId);
	public InvoiceModel save(InvoiceModel invoiceModel);
}
