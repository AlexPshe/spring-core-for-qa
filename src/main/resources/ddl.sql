create table ACCOUNT (
  ID bigint primary key not null generated always as identity,
  ACCOUNT_TYPE varchar(1) not null,
  AMOUNT double default 0,
  OVERDRAFT double default 0
);
