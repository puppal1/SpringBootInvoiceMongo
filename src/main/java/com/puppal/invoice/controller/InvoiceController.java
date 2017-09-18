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

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/customer")
public class InvoiceController {

	@Autowired
	InvoiceService invServ;

	@RequestMapping(value = "/{customeId}/invoice/", method = RequestMethod.GET)
	public List<InvoiceModel> getInvoicesByCustomerId(@PathVariable long customeId) {
		return invServ.getInvoicesByCustomerId(customeId);
	}

	@RequestMapping(value = "/invoice/{invoiceId}", method = RequestMethod.GET)
	public InvoiceModel getInvoice(@PathVariable String invoiceId) {
		return invServ.getInvoice(invoiceId);
	}

	@RequestMapping(value = "/invoice/invoiceItem/{invoice_item_id}", method = RequestMethod.GET)
	public InvoiceItemModel getInvoiceItem(@PathVariable String invoice_item_id) {
		return invServ.getInvoiceItem(invoice_item_id);
	}

	 @ApiOperation(value = "Post Invoice", nickname = "Create Invoice")
	 @ApiImplicitParams({
	        @ApiImplicitParam(name = "Customer ID", value = "Nueric cust it", required = true, dataType = "number", paramType = "query", defaultValue="123")
	        
	      })
	@RequestMapping(value = "/invoice", method = RequestMethod.POST)
	public InvoiceModel createInvoice(@RequestBody InvoiceModel invoiceModel) {
		return invServ.createInvoice(invoiceModel);

	}
	 //@PathVariable String invoiceId,
	@RequestMapping(value = "/invoice/invoiceItem", method = RequestMethod.POST)
	public InvoiceItemModel createInvoiceItem( @RequestBody InvoiceItemModel invoiceItemModel) {
		return invServ.createInvoiceItem(invoiceItemModel);
		//return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);

	}

	@RequestMapping(value = "/invoice/invoiceItem/{invoiceItemId}/payment", method = RequestMethod.POST)
	public InvoicePaymentModel createInvoiceItemPayment(@PathVariable String invoiceItemId,@RequestBody InvoicePaymentModel invoicePaymentModel) {
		invoicePaymentModel.setInvoiceItemId(invoiceItemId);
		return invServ.createInvoiceItemPayment(invoicePaymentModel);

	}


	@RequestMapping(value = "/invoice/invoiceItem", method = RequestMethod.PUT)
	public ResponseEntity<String> updateInvoiceItem(@RequestBody InvoiceItemModel invoiceItemModel) {
		invServ.updateInvoiceItem(invoiceItemModel);
		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);

	}

	@RequestMapping(value = "/invoice/", method = RequestMethod.PUT)
	public ResponseEntity<String> updateInvoice(@RequestBody InvoiceModel invoiceModel) {
		invServ.updateInvoice(invoiceModel);
		return new ResponseEntity<String>("Invoice saved successfully", HttpStatus.OK);

	}

}
