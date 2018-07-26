CREATE DATABASE IF NOT EXISTS hibernateApp;
 
USE hibernateApp;


create table administrator
(
adminid int not null auto_increment primary key,
admin_name varchar(255),
admin_lastname varchar(255),
admin_email varchar(255),
admin_password varchar(255)
);

create table bookCategory
(
bookCategoryid   int not null auto_increment primary key,
bookCategory_name varchar(255)
);

create TABLE books
(
bookid int not null auto_increment primary key,
book_title varchar(255),
book_comment text,
book_isbn text,
book_price double,
bookCategoryid int,


foreign key(bookCategoryid) references bookCategory(bookCategoryid)

);

create table customer
(
customerid int not null auto_increment primary key,
customer_name varchar(255),
customer_address text,
customer_phone varchar(255),
customer_lastName varchar(255),
customer_password varchar(255),
customer_email varchar(255)
);

create table orders
(
order_number  int not null auto_increment primary key ,
order_price double,
order_date date,
customerid int not null,
bookid  int not null,

foreign key (bookid) references books(bookid),
foreign key (customerid) references customer(customerid)

);