/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     19/8/2020 12:34:53                           */
/*==============================================================*/
/*==============================================================*/
/* Table: C_MAP                                                 */
/*==============================================================*/
create table C_MAP (
   COD_MAP              VARCHAR(100)         not null,
   UBICATION            INT4                 not null,
   DESTINY              INT4                 not null,
   constraint PK_C_MAP primary key (COD_MAP)
);

/*==============================================================*/
/* Table: "GROUP"                                               */
/*==============================================================*/
create table "GROUP" (
   IDG                  INT8                 not null,
   COD_CLS              VARCHAR(10)          null,
   TEACHER              VARCHAR(70)          not null,
   GRUPO                VARCHAR(4)           not null,
   constraint PK_GROUP primary key (IDG)
);

/*==============================================================*/
/* Table: PERIOD                                                */
/*==============================================================*/
create table PERIOD (
   COD_TI               INT8                 not null,
   STARTS               TIME                 not null,
   ENDS                 TIME                 not null,
   constraint PK_PERIOD primary key (COD_TI)
);

/*==============================================================*/
/* Table: SCHEDULE                                              */
/*==============================================================*/
create table SCHEDULE (
   IDS                  INT8                 not null,
   IDG                  INT8                 null,
   COD_TI               INT8                 null,
   CLASSROOM            VARCHAR(5)           not null,
   DAY                  VARCHAR(2)           not null,
   constraint PK_SCHEDULE primary key (IDS)
);

/*==============================================================*/
/* Table: STUDENT                                               */
/*==============================================================*/
create table STUDENT (
   CORREO               VARCHAR(30)          not null,
   USERNAME             VARCHAR(30)          not null,
   PASSWORD             VARCHAR(20)          not null,
   constraint PK_STUDENT primary key (CORREO, USERNAME)
);

/*==============================================================*/
/* Table: STUDENTGROUP                                          */
/*==============================================================*/
create table STUDENTGROUP (
   IDSG                 INT8                 not null,
   CORREO               VARCHAR(30)          null,
   USERNAME             VARCHAR(30)          null,
   IDG                  INT8                 null,
   constraint PK_STUDENTGROUP primary key (IDSG)
);

/*==============================================================*/
/* Table: SUBJECT                                               */
/*==============================================================*/
create table SUBJECT (
   COD_CLS              VARCHAR(10)          not null,
   NAME                 VARCHAR(30)          not null,
   SEMESTER             VARCHAR(2)           not null,
   constraint PK_SUBJECT primary key (COD_CLS)
);

alter table "GROUP"
   add constraint FK_GROUP_REFERENCE_SUBJECT foreign key (COD_CLS)
      references SUBJECT (COD_CLS)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_REFERENCE_GROUP foreign key (IDG)
      references "GROUP" (IDG)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_REFERENCE_PERIOD foreign key (COD_TI)
      references PERIOD (COD_TI)
      on delete restrict on update restrict;

alter table STUDENTGROUP
   add constraint FK_STUDENTG_REFERENCE_STUDENT foreign key (CORREO, USERNAME)
      references STUDENT (CORREO, USERNAME)
      on delete restrict on update restrict;

alter table STUDENTGROUP
   add constraint FK_STUDENTG_REFERENCE_GROUP foreign key (IDG)
      references "GROUP" (IDG)
      on delete restrict on update restrict;

