package com.puppal.invoice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.puppal.invoice.model.InvoiceItemModel;
import com.puppal.invoice.model.InvoiceModel;
import com.puppal.invoice.model.InvoiceModelExtended;
import com.puppal.invoice.model.InvoicePaymentModel;
import com.puppal.invoice.repo.InvoiceItemRepository;
import com.puppal.invoice.repo.InvoicePaymentRepository;
import com.puppal.invoice.repo.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	@Autowired
	private InvoiceItemRepository invoiceItemRepository;
	@Autowired
	private InvoicePaymentRepository invoicePaymentRepository;

	@Autowired
	MongoTemplate mongoTemplate;

	public InvoiceModel getInvoice(String id) {
		InvoiceModel mm = invoiceRepository.findByInvoiceId(id);
		List<InvoiceItemModel> list = invoiceItemRepository.findByInvoiceid(id);
		mm.setInvoiceItems(list);
		return mm;
	}

	public List<InvoiceModel> getInvoicesByCustomerId(long customer_account_id) {
		
		List<InvoiceModel> invModelList = invoiceRepository.findByCustomerId(customer_account_id);
		for (InvoiceModel invoiceModel : invModelList) {
			List<InvoiceItemModel> list = invoiceItemRepository.findByInvoiceid(invoiceModel.getInvoiceId());
			invoiceModel.setInvoiceItems(list);
		}
		return invModelList;
	}

	public InvoiceItemModel getInvoiceItem(String invoiceitemid) {
		return invoiceItemRepository.findByInvoiceitemid(invoiceitemid);
	}

	public InvoiceModel createInvoice(InvoiceModel invoiceModel) {
		invoiceModel.setInvoiceId(InvoiceServiceHelper.getSaltString());
		List <InvoiceItemModel> modelList =  invoiceModel.getInvoiceItems();
		for (InvoiceItemModel invoiceItemModel : modelList) {
			invoiceItemModel.setInvoiceid(invoiceModel.getInvoiceId());
			invoiceItemModel = createInvoiceItem(invoiceItemModel);
		}
		invoiceModel.setInvoiceItems(null);
		invoiceModel = invoiceRepository.save(invoiceModel);
		invoiceModel.setInvoiceItems(modelList);
		return invoiceModel;

	}

	public InvoiceItemModel createInvoiceItem(InvoiceItemModel invoiceItemModel) {
		invoiceItemModel.setInvoiceitemid(InvoiceServiceHelper.getSaltString());
		return invoiceItemRepository.save(invoiceItemModel);
	}

	public InvoicePaymentModel createInvoiceItemPayment(InvoicePaymentModel invoicePaymentModel) {
		invoicePaymentModel.setInvoiceItempaymentid(InvoiceServiceHelper.getSaltString());
		return invoicePaymentRepository.save(invoicePaymentModel);
	}

	public int updateInvoiceItem(InvoiceItemModel invoiceItemModel) {
		Query query = new Query(Criteria.where("invoiceitemid").is(invoiceItemModel.getInvoiceitemid()));
		Update update = new Update();
		update.set("invoiceitemCost", invoiceItemModel.getInvoiceitemCost());

		WriteResult result = mongoTemplate.updateFirst(query, update, InvoiceItemModel.class);

		if (result != null)
			return result.getN();
		else
			return 0;

	}

	public int updateInvoice(InvoiceModel invoiceModel) {
		Query query = new Query(Criteria.where("invoiceId").is(invoiceModel.getInvoiceId()));
		Update update = new Update();
		update.set("totalCost", invoiceModel.getTotalCost());

		WriteResult result = mongoTemplate.updateFirst(query, update, InvoiceModel.class);

		if (result != null)
			return result.getN();
		else
			return 0;
	}

}
