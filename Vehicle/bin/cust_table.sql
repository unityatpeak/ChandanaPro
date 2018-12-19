create table customer(
cust_id number(4),
custname varchar2(20),
address varchar2(20),
phonenumber varchar2(10),
dateofbooking date);

 CREATE SEQUENCE custId_sequence
     start with 1000;
-------------------------------------
Queries for Car Table
create table Car(
brand varchar2(20),
price number(10),
service_time number(2),
CC varchar2(10));

insert into car values('BMW',500000,5,'200CC');
insert into car values('BMW',500000,5,'200CC');
insert into car values('BMW',500000,5,'200CC');
insert into car values('BMW',500000,5,'200CC');
insert into car values('Benz',900000,6,'250CC');
insert into car values('Benz',900000,6,'250CC');
insert into car values('Benz',900000,6,'250CC');
insert into car values('Benz',900000,6,'250CC');
insert into car values('Audi',100000,6,'350CC');
insert into car values('Audi',100000,6,'350CC');
insert into car values('Audi',100000,6,'350CC');
insert into car values('Audi',100000,6,'350CC');


-----------------------------------------------------------------------
Queries for Car Table
create table Bike(
brand varchar2(20),
price number(10),
service_time number(2),
CC varchar2(10));


insert into Bike values('Royal Enfield',100000,6,'220CC');
insert into Bike values('Royal Enfield',100000,6,'220CC');
insert into Bike values('Royal Enfield',100000,6,'220CC');
insert into Bike values('Royal Enfield',100000,6,'220CC');
insert into Bike values('Harley Davidson',1500000,6,'320CC');