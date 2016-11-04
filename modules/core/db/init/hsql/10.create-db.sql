-- begin SAMPLE_DEPARTMENT
create table SAMPLE_DEPARTMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLE_DEPARTMENT
-- begin SEC_USER
alter table SEC_USER add column DEPARTMENT_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'sample$ExtUser' where DTYPE is null ^
-- end SEC_USER
