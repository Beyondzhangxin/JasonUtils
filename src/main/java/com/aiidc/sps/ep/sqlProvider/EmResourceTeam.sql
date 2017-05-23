-- auto Generated on 2017-05-22 17:21:43 
-- DROP TABLE IF EXISTS em_resource_team; 
CREATE TABLE em_resource_team(
    team_id VARCHAR2(50) NOT NULL,
    company_id VARCHAR2(50) DEFAULT '' NOT NULL,
    team_name VARCHAR2(50) DEFAULT '' NOT NULL,
    team_addr VARCHAR2(50) DEFAULT '' NOT NULL,
    area_id VARCHAR2(50) DEFAULT '' NOT NULL,
    team_type_id VARCHAR2(50) DEFAULT '' NOT NULL,
    team_level_id VARCHAR2(50) DEFAULT '' NOT NULL,
    event_type_id NUMBER(5) DEFAULT -1 NOT NULL,
    create_time DATE DEFAULT SYSDATE NOT NULL,
    qualifications VARCHAR2(50) DEFAULT '' NOT NULL,
    qualifications_num VARCHAR2(50) DEFAULT '' NOT NULL,
    people_num NUMBER(5) DEFAULT -1 NOT NULL,
    funding_sources VARCHAR2(50) DEFAULT '' NOT NULL,
    squadron_num NUMBER(5) DEFAULT -1 NOT NULL,
    team_num NUMBER(5) DEFAULT -1 NOT NULL,
    expertise VARCHAR2(50) DEFAULT '' NOT NULL,
    main_material VARCHAR2(50) DEFAULT '' NOT NULL,
    team_head VARCHAR2(50) DEFAULT '' NOT NULL,
    leader VARCHAR2(50) DEFAULT '' NOT NULL,
    head_tel VARCHAR2(50) DEFAULT '' NOT NULL,
    leader_tel VARCHAR2(50) DEFAULT '' NOT NULL,
    head_mobile VARCHAR2(50) DEFAULT '' NOT NULL,
    leader_mobile VARCHAR2(50) DEFAULT '' NOT NULL,
    duty_tel VARCHAR2(50) DEFAULT '' NOT NULL,
    duty_fax VARCHAR2(50) DEFAULT '' NOT NULL,
    CONSTRAINT em_resource_team_pk PRIMARY KEY (team_id));
create sequence em_resource_team_seq start with 1 increment by 1 nomaxvalue;
create trigger em_resource_team_trigger
before insert on em_resource_team
for each row
   begin
     select em_resource_team_seq.nextval into :new.team_id from dual;
   end;
