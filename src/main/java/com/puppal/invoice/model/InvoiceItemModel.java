package com.puppal.invoice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "invoiceItemModel")
public class InvoiceItemModel {

	@Id
	private String objectId;
	private String invoiceid;
	private String invoiceitemid;
	private String invoiceitemtype;
	private String invoiceItemDescription;
	private Date invoiceitemcreationdate;
	private float invoiceitemCost;
	private Date invoiceitemduedate;
	private Date invoiceitemmodifydate;
	private float invoiceitemdiscountrate;
	private String invoiceitemstatusid;
	private String invoiceitemnotes;
	private int invoiceitemzip;
	private float invoiceitemtax;
	private String invoiceItemName;
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	
	public String getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(String invoiceid) {
		this.invoiceid = invoiceid;
	}
	public String getInvoiceitemid() {
		return invoiceitemid;
	}
	public void setInvoiceitemid(String invoiceitemid) {
		this.invoiceitemid = invoiceitemid;
	}
	public String getInvoiceitemtype() {
		return invoiceitemtype;
	}
	public void setInvoiceitemtype(String invoiceitemtype) {
		this.invoiceitemtype = invoiceitemtype;
	}
	public String getInvoiceItemDescription() {
		return invoiceItemDescription;
	}
	public void setInvoiceItemDescription(String invoiceItemDescription) {
		this.invoiceItemDescription = invoiceItemDescription;
	}
	public Date getInvoiceitemcreationdate() {
		return invoiceitemcreationdate;
	}
	public void setInvoiceitemcreationdate(Date invoiceitemcreationdate) {
		this.invoiceitemcreationdate = invoiceitemcreationdate;
	}
	public float getInvoiceitemCost() {
		return invoiceitemCost;
	}
	public void setInvoiceitemCost(float invoiceitemCost) {
		this.invoiceitemCost = invoiceitemCost;
	}
	public Date getInvoiceitemduedate() {
		return invoiceitemduedate;
	}
	public void setInvoiceitemduedate(Date invoiceitemduedate) {
		this.invoiceitemduedate = invoiceitemduedate;
	}
	public Date getInvoiceitemmodifydate() {
		return invoiceitemmodifydate;
	}
	public void setInvoiceitemmodifydate(Date invoiceitemmodifydate) {
		this.invoiceitemmodifydate = invoiceitemmodifydate;
	}
	public float getInvoiceitemdiscountrate() {
		return invoiceitemdiscountrate;
	}
	public void setInvoiceitemdiscountrate(float invoiceitemdiscountrate) {
		this.invoiceitemdiscountrate = invoiceitemdiscountrate;
	}
	public String getInvoiceitemstatusid() {
		return invoiceitemstatusid;
	}
	public void setInvoiceitemstatusid(String invoiceitemstatusid) {
		this.invoiceitemstatusid = invoiceitemstatusid;
	}
	public String getInvoiceitemnotes() {
		return invoiceitemnotes;
	}
	public void setInvoiceitemnotes(String invoiceitemnotes) {
		this.invoiceitemnotes = invoiceitemnotes;
	}
	public int getInvoiceitemzip() {
		return invoiceitemzip;
	}
	public void setInvoiceitemzip(int invoiceitemzip) {
		this.invoiceitemzip = invoiceitemzip;
	}
	public float getInvoiceitemtax() {
		return invoiceitemtax;
	}
	public void setInvoiceitemtax(float invoiceitemtax) {
		this.invoiceitemtax = invoiceitemtax;
	}
	public String getInvoiceItemName() {
		return invoiceItemName;
	}
	public void setInvoiceItemName(String invoiceItemName) {
		this.invoiceItemName = invoiceItemName;
	} 
	
	


}
