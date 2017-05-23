-- auto Generated on 2017-05-23 19:49:48 
-- DROP TABLE IF EXISTS em_resource_team_level; 
CREATE TABLE em_resource_team_level(
    level_id VARCHAR2(50) NOT NULL,
    level_name VARCHAR2(50) DEFAULT '' NOT NULL,
    CONSTRAINT em_resource_team_level_pk PRIMARY KEY (level_id));
create sequence em_resource_team_level_seq start with 1 increment by 1 nomaxvalue;
create trigger em_resource_team_level_trigger
before insert on em_resource_team_level
for each row
   begin
     select em_resource_team_level_seq.nextval into :new.level_id from dual;
   end;
