--
--DROP TABLE ttransaction;
CREATE SCHEMA TEST;

    CREATE TABLE ttransaction
    (   id INT PRIMARY KEY,
        tr_num VARCHAR(20),
        tr_name VARCHAR(20),
        tr_value_date date,
        tr_currency VARCHAR(10),
        tr_debit_amount decimal(10,2),
        tr_credit_amount decimal(10,2),
        tr_debit_credit VARCHAR(10),
        tr_narrative VARCHAR(200)
    )
    ;
