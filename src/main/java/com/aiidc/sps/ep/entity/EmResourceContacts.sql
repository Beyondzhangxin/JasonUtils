-- auto Generated on 2017-05-23 19:50:16 
-- DROP TABLE IF EXISTS em_resource_contacts; 
CREATE TABLE em_resource_contacts(
    company_id VARCHAR2(50) NOT NULL,
    company_name VARCHAR2(50) DEFAULT '' NOT NULL,
    department VARCHAR2(50) DEFAULT '' NOT NULL,
    department_duty VARCHAR2(50) DEFAULT '' NOT NULL,
    header VARCHAR2(50) DEFAULT '' NOT NULL,
    post VARCHAR2(50) DEFAULT '' NOT NULL,
    telephone VARCHAR2(50) DEFAULT '' NOT NULL,
    mobile_phone VARCHAR2(50) DEFAULT '' NOT NULL,
    fax VARCHAR2(50) DEFAULT '' NOT NULL,
    email VARCHAR2(50) DEFAULT '' NOT NULL,
    wechat VARCHAR2(50) DEFAULT '' NOT NULL,
    qq VARCHAR2(50) DEFAULT '' NOT NULL,
    edit_time DATE DEFAULT SYSDATE NOT NULL,
    CONSTRAINT em_resource_contacts_pk PRIMARY KEY (company_id));
create sequence em_resource_contacts_seq start with 1 increment by 1 nomaxvalue;
create trigger em_resource_contacts_trigger
before insert on em_resource_contacts
for each row
   begin
     select em_resource_contacts_seq.nextval into :new.company_id from dual;
   end;
