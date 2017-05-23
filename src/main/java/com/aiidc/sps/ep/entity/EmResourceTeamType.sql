-- auto Generated on 2017-05-23 19:49:59 
-- DROP TABLE IF EXISTS em_resource_team_type; 
CREATE TABLE em_resource_team_type(
    team_type_id VARCHAR2(50) NOT NULL,
    team_type_name VARCHAR2(50) DEFAULT '' NOT NULL,
    CONSTRAINT em_resource_team_type_pk PRIMARY KEY (team_type_id));
create sequence em_resource_team_type_seq start with 1 increment by 1 nomaxvalue;
create trigger em_resource_team_type_trigger
before insert on em_resource_team_type
for each row
   begin
     select em_resource_team_type_seq.nextval into :new.team_type_id from dual;
   end;
