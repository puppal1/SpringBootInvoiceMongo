package com.puppal.invoice.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.WriteResult;
import com.mongodb.annotations.Beta;
import com.puppal.invoice.model.InvoiceItemModel;
@Beta
public class InvoiceItemCustomRepositoryImpl implements InvoiceItemCustomRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public int update(InvoiceItemModel invoiceItemModel) {
		Query query = new Query(Criteria.where("invoiceitemid").is(invoiceItemModel.getInvoiceitemid()));
		Update update = new Update();
		update.set("invoiceitemstatusid", invoiceItemModel.getInvoiceitemstatusid());

		WriteResult result = mongoTemplate.updateFirst(query, update, InvoiceItemModel.class);

		if (result != null)
			return result.getN();
		else
			return 0;
	}

}
