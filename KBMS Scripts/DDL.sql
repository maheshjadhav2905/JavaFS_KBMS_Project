/*  
	Author Mahesh Jadhav
    Database Creation
*/

# Creating customer table with cusomer_id as primary key
CREATE DATABASE KBMS_PROJECT;
USE KBMS_PROJECT;

CREATE TABLE Customer(
Customer_name varchar(50), 
email VARCHAR(50), 
phone VARCHAR(20),
address TEXT, 
date_of_birth varchar(30), 
age INT,
password varchar(15),
identity_proof varchar(25),
preferred_login_id varchar(50),

constraint primary key (preferred_login_id)
);
drop table customer;

desc customer;
commit;
select * from Customer;
SELECT * FROM Customer WHERE preferred_login_id = "loki";
truncate Customer;



