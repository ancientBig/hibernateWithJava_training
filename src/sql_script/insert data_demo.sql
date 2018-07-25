USE hibernateApp;


insert into administrator(admin_name,admin_lastname,admin_email,admin_password) values('king','throne','admin@accenture.com','12345');

insert into bookCategory(bookCategory_name) values('fiction');
insert into bookCategory(bookCategory_name) values('action');

insert into books(book_title,  book_comment,  book_price,  book_isbn,  bookCategoryid) values('how to get away with murder','good book',55.60,'1234567887',1);
insert into books( book_title,  book_comment,  book_price,  book_isbn,  bookCategoryid) values( 'floating machine',' what happended to john?', 125.90,'2453BAS45',2);
insert into books (  book_title,  book_comment,  book_price,  book_isbn,  bookCategoryid) values('the scotching trials','how can i contact the author',543.70,'209874846bnm',1);


insert into customer(customer_name,  customer_address,  customer_phone,  customer_lastName,  customer_password,  customer_email) values( 'morena','2345 makeneng Str. johannesburg',0788453635,'marabe','12345','morena@accenture.com');
insert into customer(customer_name,  customer_address,  customer_phone,  customer_lastName,  customer_password,  customer_email) values( 'ruan','200 william Str. johannesburg',0788453635,'Xholo','12345','ruan@accenture.com' );
insert into customer(customer_name,  customer_address,  customer_phone,  customer_lastName,  customer_password,  customer_email) values( 'sam','55 plain Str. jermistin',0788453635,'skwalvyk','12345','sam@accenture.com' );


insert into orders(order_price,  order_date,  customerid,  bookid) values( 500, str_to_date('05-11-2004','%m-%d-%Y'),2,1);
insert into orders(order_price,  order_date,  customerid,  bookid) values( 1200,str_to_date('06-22-2009' ,'%m-%d-%Y'),1,1);
insert into orders(order_price,  order_date,  customerid,  bookid) values( 650,str_to_date('05-16-2011' ,'%m-%d-%Y'),2,2);

