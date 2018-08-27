/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/21 11:58:51                           */
/*==============================================================*/


drop table if exists admin;

drop table if exists attendant;

drop table if exists computer;

drop table if exists computerDetails;

drop table if exists lightningrecord;

drop table if exists requirement;

drop table if exists user;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   adminID              int not null,
   adminName            varchar(20) not null,
   adminPwd             varchar(20) not null,
   primary key (adminID)
);

/*==============================================================*/
/* Table: attendant                                             */
/*==============================================================*/
create table attendant
(
   aID                  int not null,
   uID                  int,
   aName                varchar(20) not null,
   aTrueName            varchar(20) not null,
   aPwd                 varchar(20) not null,
   aTel                 int not null,
   aAdress              varchar(30) not null,
   aEmail               varchar(30) not null,
   aCredit              int not null,
   primary key (aID)
);

/*==============================================================*/
/* Table: computer                                              */
/*==============================================================*/
create table computer
(
   dID                  int not null,
   dBrand               varchar(20),
   dModel               varchar(20),
   primary key (dID)
);

/*==============================================================*/
/* Table: computerDetails                                       */
/*==============================================================*/
create table computerDetails
(
   cID                  int not null,
   dID                  int,
   dType                varchar(20),
   dCPU                 varchar(10),
   dGraphicsCard        varchar(30),
   dHardDisk            varchar(20),
   dMemory              varchar(20),
   primary key (cID)
);

/*==============================================================*/
/* Table: lightningrecord                                       */
/*==============================================================*/
create table lightningrecord
(
   lID                  int not null,
   adminID              int,
   aID                  int,
   rID                  int not null,
   lTime                timestamp,
   lCheakTime           timestamp,
   lCheakTakeTime       timestamp,
   lCheakRemarks        varchar(20),
   lUserCharge          varchar(20),
   lAttendantCharge     varchar(20),
   primary key (lID)
);

/*==============================================================*/
/* Table: requirement                                           */
/*==============================================================*/
create table requirement
(
   cID                  int not null,
   uID                  int not null,
   rID                  int not null,
   lID                  int not null,
   adminID              int,
   rTime                timestamp,
   rRemarks             varchar(20),
   rType                varchar(20),
   primary key (rID)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   uID                  int not null,
   aID                  int,
   uName                varchar(20) not null,
   uTrueName            varchar(20) not null,
   uPwd                 varchar(20) not null,
   uTel                 numeric(8,0) not null,
   uAdress              varchar(30) not null,
   uEmail               varchar(30) not null,
   uCredit              int not null,
   primary key (uID)
);

alter table attendant add constraint FK_Appraise2 foreign key (uID)
      references user (uID) on delete restrict on update restrict;

alter table computerDetails add constraint FK_belong foreign key (dID)
      references computer (dID) on delete restrict on update restrict;

alter table lightningrecord add constraint FK_Relationship_10 foreign key (aID)
      references attendant (aID) on delete restrict on update restrict;

alter table lightningrecord add constraint FK_Relationship_11 foreign key (rID)
      references requirement (rID) on delete restrict on update restrict;

alter table lightningrecord add constraint FK_Relationship_8 foreign key (adminID)
      references admin (adminID) on delete restrict on update restrict;

alter table requirement add constraint FK_Relationship_12 foreign key (lID)
      references lightningrecord (lID) on delete restrict on update restrict;

alter table requirement add constraint FK_Relationship_9 foreign key (adminID)
      references admin (adminID) on delete restrict on update restrict;

alter table requirement add constraint FK_requirement foreign key (cID)
      references computerDetails (cID) on delete restrict on update restrict;

alter table requirement add constraint FK_requirement2 foreign key (uID)
      references user (uID) on delete restrict on update restrict;

alter table user add constraint FK_Appraise foreign key (aID)
      references attendant (aID) on delete restrict on update restrict;

