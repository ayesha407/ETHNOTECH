
use aisha2;
CREATE TABLE transactions (
    t_id INT PRIMARY KEY,
    t_amount INT,
    c_id INT NOT NULL UNIQUE
);
INSERT INTO transactions VALUES
(1, 10000, 101),
(2, 25000, 102),
(3, 41000, 103),
(4, 12000, 104),
(5, 30000, 105);

CREATE TABLE customers (
    T_id INT PRIMARY KEY,
    name VARCHAR(20),
    t_amount INT,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES transactions(c_id)
);

INSERT INTO customers VALUES
(1, 'Asha', 15000, 101),
(2, 'Rohit', 22000, 102),
(3, 'Priya', 18000, 103),
(4, 'Vikram', 25000, 104),
(5, 'Neha', 30000, 105);

SELECT * FROM transactions;
SELECT * FROM customers;

-- INNER JOIN
SELECT
    customers.customer_id,
    customers.name,
    customers.t_amount
FROM customers
INNER JOIN transactions
ON customers.customer_id = transactions.c_id;

-- LEFT JOIN
SELECT
    customers.customer_id,
    customers.name,
    customers.t_amount
FROM customers
LEFT JOIN transactions
ON customers.customer_id = transactions.c_id;

-- RIGHT JOIN
SELECT
    transactions.c_id,
    customers.name,
    transactions.t_amount
FROM transactions
RIGHT JOIN customers
ON transactions.c_id = customers.customer_id;

-- VIEW
CREATE VIEW customer_transaction_view AS
SELECT
    customers.customer_id,
    customers.name,
    customers.t_amount AS customer_amount,
    transactions.t_amount AS transaction_amount
FROM customers
INNER JOIN transactions
ON customers.customer_id = transactions.c_id;

SELECT * FROM customer_transaction_view;

-- PROCEDURE
DELIMITER //

CREATE PROCEDURE get_customer_transactions()
BEGIN
    SELECT
        c.customer_id,
        c.name,
        t.t_id,
        t.t_amount
    FROM customers c
    INNER JOIN transactions t
    ON c.customer_id = t.c_id;
END //

DELIMITER ;

CALL get_customer_transactions();

-- TRIGGER
DELIMITER //

CREATE TRIGGER check_amount
BEFORE INSERT
ON transactions
FOR EACH ROW
BEGIN
    IF NEW.t_amount < 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Amount cannot be negative';
    END IF;
END //

DELIMITER ;