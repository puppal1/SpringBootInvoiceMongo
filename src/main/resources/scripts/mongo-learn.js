show dbs;
db.invoiceModelCollcetion.insert({
    "invoiceId": 5,
    "invoiceName": "invoice5",
    "amountDue": 23.2,
    "invoiceItems": ["frier", "soap", "brush", "labour"]
});


db.invoiceModelCollcetion.find();

db.invoiceModelCollcetion.find({
"invoiceId": 7}).pretty();

db.invoiceModelCollcetion.find({
    "invoiceItems": 
	["frier", "soap", "brush", "labour"]

}).pretty();


db.invoiceModelCollcetion.find(
{   "amountDue": 33.2 , 
    "invoiceName": "invoice2"
 
	}
);


db.invoiceModelCollcetion.find(
{
 "invoiceId": 5,
 
$or : 
[{  "amountDue": 23.2}  
  ,  {"invoiceName": "invoice6"}
 ]
}	
);



db.invoiceModelCollcetion.find(
{"invoiceId": 5.0 },
 {$set : {"invoiceName": "invoice6" }}
);