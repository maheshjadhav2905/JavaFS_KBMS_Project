


USE KBMS_PROJECT;
INSERT INTO Customer
(
`Customer_name`, 
`email` , 
`phone` ,
`address` , 
`date_of_birth`, 
`age` ,
`password`,
`identity_proof`,
`preferred_login_id`)
VALUES
("Alexa","al9090@hmail.com", "9090787856", "Street 12, green tower, Jordan", 
    "1989-10-10", 32, "alex123", "visa card", "al9090"),
    
    ("Alexander","polo90@hmail.com", "9898990908", "Street 3, twin tower, tordan", 
    "1978-02-19", 43, "alexander123", "visa card", "polo90"),
    
    ("Marie","al9090@hmail.com", "9898989907", "Street 3, twin tower, Jordan", 
    "2001-10-28", 21, "marie123", "visa card", "al90900"),
    
    ("Jacky","loki0@hmail.com", "9897856489", "Street 2,quad tower, london", 
    "1978-09-23", 44, "jacky123", "visa card", "loki"),
    
    ("Bob","bob@hmail.com", "9898907869", "Street 3, twin tower, Jordan", 
    "2002-09-11",20, "bob123", "visa card", "bob"),
    
    ("Alexa","al9090@hmail.com", "9894523889", "Street 3, twin tower, Jordan", 
    "1999-11-10", 23, "alexa123", "visa card", "alexa9090"),
    
    ("Sonail","sonail@hmail.com", "9897890589", "Street 3, twin tower, Jordan", 
    "1993-12-12", 29, "sonali123", "visa card", "sonail675");
    
ALTER TABLE Customer
DROP COLUMN customer_id;