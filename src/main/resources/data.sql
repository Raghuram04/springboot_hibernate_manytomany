DROP TABLE CUSTOMER;
DROP TABLE PRODUCT;

CREATE TABLE CUSTOMER(customerid int AUTO_INCREMENT primary key,customer_name varchar(100),p_date Date);
CREATE TABLE PRODUCT(productid int AUTO_INCREMENT primary key,product_name varchar(100),price float);