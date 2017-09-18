package com.puppal.invoice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.puppal.invoice.model.InvoiceItemModel;

public interface InvoiceItemRepository extends MongoRepository<InvoiceItemModel, String> {

	public InvoiceItemModel findByInvoiceitemid(String invoiceitemid);

	public List<InvoiceItemModel> findByInvoiceid(String invoiceid);

	@SuppressWarnings("unchecked")
	public InvoiceItemModel save(InvoiceItemModel invoiceItemModel);
	

}
