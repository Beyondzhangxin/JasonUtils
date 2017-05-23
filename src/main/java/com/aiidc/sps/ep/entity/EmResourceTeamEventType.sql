-- auto Generated on 2017-05-23 19:49:35 
-- DROP TABLE IF EXISTS em_resource_team_event_type; 
CREATE TABLE em_resource_team_event_type(
    event_type_id NUMBER(5) NOT NULL,
    event_type_name VARCHAR2(50) DEFAULT '' NOT NULL,
    CONSTRAINT em_resource_team_event_type_pk PRIMARY KEY (event_type_id));
create sequence em_resource_team_event_type_seq start with 1 increment by 1 nomaxvalue;
create trigger em_resource_team_event_type_trigger
before insert on em_resource_team_event_type
for each row
   begin
     select em_resource_team_event_type_seq.nextval into :new.event_type_id from dual;
   end;
