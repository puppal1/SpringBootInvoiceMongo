package com.puppal.invoice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.puppal.invoice.model.InvoiceModel;

public interface InvoiceRepository extends MongoRepository<InvoiceModel, String> {

	public List <InvoiceModel> findByCustomerId(long customerId);
	public  InvoiceModel findByInvoiceId(String invoiceId);
	public InvoiceModel save(InvoiceModel invoiceModel);
}
