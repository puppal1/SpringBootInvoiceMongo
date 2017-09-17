package com.puppal.invoice.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invoicePaymentModel")

public class InvoicePaymentModel {

	private String invoiceItempaymentid;
	private String invoiceItemId;
	private String invoiceItempaymentmethod;
	private String invoiceItempaymentccnum;
	private Date invoiceItempaymentccexpdate;
	private String invoiceItempaymentccnameoncard;
	private String invoiceItempaymentcccvv;
	private String invoiceItempaymentcctype;
	private int invoiceItempaymentcclast4;
	private String invoiceItempaymentstatusid;
	private Date invoiceItempaymentdate;
	private float invoiceItempaymentpaidamount;
	private float invoiceItempaymenttotalamount;
	public String getInvoiceItempaymentid() {
		return invoiceItempaymentid;
	}
	public void setInvoiceItempaymentid(String invoiceItempaymentid) {
		this.invoiceItempaymentid = invoiceItempaymentid;
	}
	public String getInvoiceItemId() {
		return invoiceItemId;
	}
	public void setInvoiceItemId(String invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}
	public String getInvoiceItempaymentmethod() {
		return invoiceItempaymentmethod;
	}
	public void setInvoiceItempaymentmethod(String invoiceItempaymentmethod) {
		this.invoiceItempaymentmethod = invoiceItempaymentmethod;
	}
	public String getInvoiceItempaymentccnum() {
		return invoiceItempaymentccnum;
	}
	public void setInvoiceItempaymentccnum(String invoiceItempaymentccnum) {
		this.invoiceItempaymentccnum = invoiceItempaymentccnum;
	}
	public Date getInvoiceItempaymentccexpdate() {
		return invoiceItempaymentccexpdate;
	}
	public void setInvoiceItempaymentccexpdate(Date invoiceItempaymentccexpdate) {
		this.invoiceItempaymentccexpdate = invoiceItempaymentccexpdate;
	}
	public String getInvoiceItempaymentccnameoncard() {
		return invoiceItempaymentccnameoncard;
	}
	public void setInvoiceItempaymentccnameoncard(String invoiceItempaymentccnameoncard) {
		this.invoiceItempaymentccnameoncard = invoiceItempaymentccnameoncard;
	}
	public String getInvoiceItempaymentcccvv() {
		return invoiceItempaymentcccvv;
	}
	public void setInvoiceItempaymentcccvv(String invoiceItempaymentcccvv) {
		this.invoiceItempaymentcccvv = invoiceItempaymentcccvv;
	}
	public String getInvoiceItempaymentcctype() {
		return invoiceItempaymentcctype;
	}
	public void setInvoiceItempaymentcctype(String invoiceItempaymentcctype) {
		this.invoiceItempaymentcctype = invoiceItempaymentcctype;
	}
	public int getInvoiceItempaymentcclast4() {
		return invoiceItempaymentcclast4;
	}
	public void setInvoiceItempaymentcclast4(int invoiceItempaymentcclast4) {
		this.invoiceItempaymentcclast4 = invoiceItempaymentcclast4;
	}
	public String getInvoiceItempaymentstatusid() {
		return invoiceItempaymentstatusid;
	}
	public void setInvoiceItempaymentstatusid(String invoiceItempaymentstatusid) {
		this.invoiceItempaymentstatusid = invoiceItempaymentstatusid;
	}
	public Date getInvoiceItempaymentdate() {
		return invoiceItempaymentdate;
	}
	public void setInvoiceItempaymentdate(Date invoiceItempaymentdate) {
		this.invoiceItempaymentdate = invoiceItempaymentdate;
	}
	public float getInvoiceItempaymentpaidamount() {
		return invoiceItempaymentpaidamount;
	}
	public void setInvoiceItempaymentpaidamount(float invoiceItempaymentpaidamount) {
		this.invoiceItempaymentpaidamount = invoiceItempaymentpaidamount;
	}
	public float getInvoiceItempaymenttotalamount() {
		return invoiceItempaymenttotalamount;
	}
	public void setInvoiceItempaymenttotalamount(float invoiceItempaymenttotalamount) {
		this.invoiceItempaymenttotalamount = invoiceItempaymenttotalamount;
	}

	

}
