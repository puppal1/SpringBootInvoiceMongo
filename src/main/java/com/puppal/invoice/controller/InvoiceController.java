package com.puppal.invoice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puppal.invoice.model.InvoiceItemModel;
import com.puppal.invoice.model.InvoiceModel;
import com.puppal.invoice.model.InvoiceModelExtended;
import com.puppal.invoice.model.InvoicePaymentModel;
import com.puppal.invoice.service.InvoiceService;

@RestController
@RequestMapping(value = "/customer")
public class InvoiceController {
//	// /customers/{customer_account_id}/invoices/{invoice_id}

	@Autowired
	InvoiceService invServ;

//	@RequestMapping(value = "/{customeId}/invoice/", method = RequestMethod.GET)
//	public List<InvoiceModel> getInvoicesByCustomerId(@PathVariable long customeId) {
//		return invServ.getInvoicesByCustomerId(customeId);
//	}
//
//	@RequestMapping(value = "/{customeId}/invoice/{invoiceId}", method = RequestMethod.GET)
//	public InvoiceModelExtended getInvoice(@PathVariable long invoiceId) {
//		return invServ.getInvoice(invoiceId);
//	}
//
//	@RequestMapping(value = "/{customeId}/invoice/{invoiceId}/invoiceItem/{invoice_item_id}", method = RequestMethod.GET)
//	public InvoiceItemModel getInvoiceItem(@PathVariable long invoice_item_id) {
//		return invServ.getInvoiceItem(invoice_item_id);
//	}

	@RequestMapping(value = "/{customeId}/invoice", method = RequestMethod.POST)
	public InvoiceModel createInvoice(@RequestBody InvoiceModel invoiceModel) {
		return invServ.createInvoice(invoiceModel);

	}

//	@RequestMapping(value = "/{customeId}/invoice/{invoiceId}/invoiceItem", method = RequestMethod.POST)
//	public ResponseEntity<String> createInvoiceItem(@RequestBody InvoiceItemModel invoiceItemModel) {
//		invServ.createInvoiceItem(invoiceItemModel);
//		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);
//
//	}
//
//	@RequestMapping(value = "/{customeId}/invoice/{invoiceId}/invoiceItem/{invoiceId}/payment", method = RequestMethod.POST)
//	public ResponseEntity<String> createInvoiceItemPayment(@RequestBody InvoicePaymentModel invoicePaymentModel) {
//		System.out.println(" invoicePaymentModel.getInvoiceId() " + invoicePaymentModel.getInvoiceId());
//		invServ.createInvoiceItemPayment(invoicePaymentModel);
//		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);
//
//	}
////
////	@RequestMapping(value = "/payment/create", method = RequestMethod.POST)
////	public ResponseEntity<String> createInvoicePayment(@RequestBody InvoicePaymentModel invoicePaymentModel) {
////		invServ.createInvoicePayment(invoicePaymentModel);
////		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);
////
////	}
//
//	@RequestMapping(value = "/{customeId}/invoice/{invoiceId}/invoiceItem", method = RequestMethod.PUT)
//	public ResponseEntity<String> updateInvoiceItem(@RequestBody InvoiceItemModel invoiceItemModel) {
//		invServ.updateInvoiceItem(invoiceItemModel);
//		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);
//
//	}
//
//	@RequestMapping(value = "/{customeId}/invoice/", method = RequestMethod.PUT)
//	public ResponseEntity<String> updateInvoice(@RequestBody InvoiceModel invoiceModel) {
//		invServ.updateInvoice(invoiceModel);
//		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);
//
//	}

}
