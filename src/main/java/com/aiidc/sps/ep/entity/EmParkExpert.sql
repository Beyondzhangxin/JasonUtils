-- auto Generated on 2017-05-23 19:50:37 
-- DROP TABLE IF EXISTS em_park_expert; 
CREATE TABLE em_park_expert(
    expert_id VARCHAR2(50) NOT NULL,
    expert_type NUMBER(5) DEFAULT -1 NOT NULL,
    name VARCHAR2(50) DEFAULT '' NOT NULL,
    sex VARCHAR2(50) DEFAULT '' NOT NULL,
    birthday DATE DEFAULT SYSDATE NOT NULL,
    nation_code VARCHAR2(50) DEFAULT '' NOT NULL,
    area_id VARCHAR2(50) DEFAULT '' NOT NULL,
    event_type_id NUMBER(5) DEFAULT -1 NOT NULL,
    political_outlook VARCHAR2(50) DEFAULT '' NOT NULL,
    place_of_origin VARCHAR2(50) DEFAULT '' NOT NULL,
    domicile VARCHAR2(50) DEFAULT '' NOT NULL,
    major VARCHAR2(50) DEFAULT '' NOT NULL,
    highest_education VARCHAR2(50) DEFAULT '' NOT NULL,
    work_unit VARCHAR2(50) DEFAULT '' NOT NULL,
    unit_addr VARCHAR2(50) DEFAULT '' NOT NULL,
    university VARCHAR2(50) DEFAULT '' NOT NULL,
    working_time DATE DEFAULT SYSDATE NOT NULL,
    post VARCHAR2(50) DEFAULT '' NOT NULL,
    title VARCHAR2(50) DEFAULT '' NOT NULL,
    specialty VARCHAR2(50) DEFAULT '' NOT NULL,
    office_phone VARCHAR2(50) DEFAULT '' NOT NULL,
    email VARCHAR2(50) DEFAULT '' NOT NULL,
    fax VARCHAR2(50) DEFAULT '' NOT NULL,
    mobile_phone VARCHAR2(50) DEFAULT '' NOT NULL,
    home_phone VARCHAR2(50) DEFAULT '' NOT NULL,
    home_addr VARCHAR2(50) DEFAULT '' NOT NULL,
    change_date DATE DEFAULT SYSDATE NOT NULL,
    part_in_inci_handling VARCHAR2(50) DEFAULT '' NOT NULL,
    CONSTRAINT em_park_expert_pk PRIMARY KEY (expert_id));
create sequence em_park_expert_seq start with 1 increment by 1 nomaxvalue;
create trigger em_park_expert_trigger
before insert on em_park_expert
for each row
   begin
     select em_park_expert_seq.nextval into :new.expert_id from dual;
   end;
