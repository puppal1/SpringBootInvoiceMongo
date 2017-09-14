package com.puppal.invoice.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "invoiceModel")

public class InvoiceModel {
	@Id
	private String objectId; 
	private long customerAccountId;
	
	private String invoiceId;
	private long customerId;
	private Date invoiceCreateDate;
	private Date invoiceLast_updateDate;
	private Date invoiceDueDate;
	private float totalCost;
	private float invoicePendingCost;
	private String invoiceName;
	private String customerEmail;
	private String invoiceStatusId;
	private String invoiceAddress;
	private int invoiceZip;
	private String invoiceNotes;
	private List <InvoiceItemModel> invoiceItems;
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public long getCustomerAccountId() {
		return customerAccountId;
	}
	public void setCustomerAccountId(long customerAccountId) {
		this.customerAccountId = customerAccountId;
	}


	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Date getInvoiceCreateDate() {
		return invoiceCreateDate;
	}
	public void setInvoiceCreateDate(Date invoiceCreateDate) {
		this.invoiceCreateDate = invoiceCreateDate;
	}
	public Date getInvoiceLast_updateDate() {
		return invoiceLast_updateDate;
	}
	public void setInvoiceLast_updateDate(Date invoiceLast_updateDate) {
		this.invoiceLast_updateDate = invoiceLast_updateDate;
	}
	public Date getInvoiceDueDate() {
		return invoiceDueDate;
	}
	public void setInvoiceDueDate(Date invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public float getInvoicePendingCost() {
		return invoicePendingCost;
	}
	public void setInvoicePendingCost(float invoicePendingCost) {
		this.invoicePendingCost = invoicePendingCost;
	}
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getInvoiceStatusId() {
		return invoiceStatusId;
	}
	public void setInvoiceStatusId(String invoiceStatusId) {
		this.invoiceStatusId = invoiceStatusId;
	}
	public String getInvoiceAddress() {
		return invoiceAddress;
	}
	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}
	public int getInvoiceZip() {
		return invoiceZip;
	}
	public void setInvoiceZip(int invoiceZip) {
		this.invoiceZip = invoiceZip;
	}
	public String getInvoiceNotes() {
		return invoiceNotes;
	}
	public void setInvoiceNotes(String invoiceNotes) {
		this.invoiceNotes = invoiceNotes;
	}
	public List<InvoiceItemModel> getInvoiceItems() {
		return invoiceItems;
	}
	public void setInvoiceItems(List<InvoiceItemModel> invoiceItems) {
		this.invoiceItems = invoiceItems;
	} 


	
	

}
