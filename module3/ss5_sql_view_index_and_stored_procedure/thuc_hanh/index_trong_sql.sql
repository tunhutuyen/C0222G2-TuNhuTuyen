use classicmodels;
SELECT * FROM customers;
select * FROM customers WHERE customerName = 'Land of Toys Inc.';
-- kiểm tra luồng chạy
explain select * FROM customers WHERE customerName = 'Land of Toys Inc.';

alter table customers add index idx_customerName(customerName);
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
-- thêm chỉ mục có nhiều tham số-- 
ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);
EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

-- xóa chỉ mục
ALTER TABLE customers DROP INDEX idx_full_name;
