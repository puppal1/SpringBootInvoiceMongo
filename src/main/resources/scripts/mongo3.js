use invoice;
db.getCollectionNames();

db.invoiceModel.find({
});
db.invoiceItemModel.find({
});


db.invoiceModel.remove({});
db.invoiceItemModel.remove({});


db.invoiceModel.save({
    "customerAccountId": 10,
    "invoiceId": 22,
    "invoiceCustomerId": 2345,
    "invoiceCreateDate": "2017-08-29T16:58:35.350Z",
    "invoiceLast_updateDate": "2017-08-29T16:58:35.350Z",
    "invoiceTotalCost": 50.5,
    "invoicePendingCost": 50.5,
    "invoiceName": "bill from amazon",
    "invoiceStatusId": "PENDING",
    "invoiceBillToAddress": "549 E bronx NY",
    "invoiceBillToZip": 1234,
    "invoiceNotes": " pay your bill",
    "invoiceItems": [
        {
            "invoiceid": 5,
            "invoiceitemid": 5,
            "invoiceitemtype": "GOODS",
            "invoiceitemdescription": " toy cart",
            "invoiceitemcreationdate": "2017-08-29T17:28:50.556Z",
            "invoiceitemcost": 10.0,
            "invoiceitemmodifydate": "2017-08-29T17:28:50.556Z",
            "invoiceitemdiscountrate": 0.0,
            "invoiceitemstatusid": "PENDING",
            "invoiceitemnotes": "none",
            "invoiceitemzip": 1234.0,
            "invoiceitemtax": 10.0,
            "invoiceitempaymentid": 0
},
        {
            "invoiceid": 5,
            "invoiceitemid": 6,
            "invoiceitemtype": "GOODS",
            "invoiceitemdescription": " toy cart",
            "invoiceitemcreationdate": "2017-08-29T17:28:50.556Z",
            "invoiceitemcost": 10.0,
            "invoiceitemmodifydate": "2017-08-29T17:28:50.556Z",
            "invoiceitemdiscountrate": 0.0,
            "invoiceitemstatusid": "PENDING",
            "invoiceitemnotes": "none",
            "invoiceitemzip": 1234.0,
            "invoiceitemtax": 10.0,
            "invoiceitempaymentid": 0
}
    	]
});
