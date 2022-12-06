use class;
create table Bank(Acc_no integer unique,Acc_holder varchar(20),ifsc_code varchar(20),branch varchar(10),
Acc_type varchar(10),balance numeric(12,2),pin numeric(4)unique);