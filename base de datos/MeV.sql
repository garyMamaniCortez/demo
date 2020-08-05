/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     7/7/2020 10:57:41                            */
/*==============================================================*/
/*==============================================================*/
/* Table: SUBJECTS                                              */
/*==============================================================*/
create table SUBJECTS (
   COD_CLS              VARCHAR(30)          not null,
   GROUP_OF             VARCHAR(2)           not null,
   NAME                 VARCHAR(50)          not null,
   SEMESTER             VARCHAR(1)           not null,
   constraint PK_SUBJECTS primary key (COD_CLS, GROUP_OF)
);

/*==============================================================*/
/* Index: SUBJECTS_PK                                           */
/*==============================================================*/
create unique index SUBJECTS_PK on SUBJECTS (
COD_CLS,
GROUP_OF
);

/*==============================================================*/
/* Table: CLASSROOM                                             */
/*==============================================================*/
create table CLASSROOM (
   COD_CL               VARCHAR(4)           not null,
   UBICATION            VARCHAR(10)         not null,
   constraint PK_CLASSROOM primary key (COD_CL)
);

/*==============================================================*/
/* Index: CLASSROOM_PK                                          */
/*==============================================================*/
create unique index CLASSROOM_PK on CLASSROOM (
COD_CL
);

CREATE table C_MAP (
   UBICATION              VARCHAR(10)        NOT NULL,
   DESTINY                VARCHAR(10)        NOT NULL,
   COD_MAP                VARCHAR(500)       NOT NULL,
   constraint PK_MAP primary key (COD_MAP)
);
/*==============================================================*/
/* Table: DAY                                                   */
/*==============================================================*/
create table DAY (
   DAY                  VARCHAR(2)           not null,
   constraint PK_DAY primary key (DAY)
);

/*==============================================================*/
/* Index: DAY_PK                                                */
/*==============================================================*/
create unique index DAY_PK on DAY (
DAY
);

/*==============================================================*/
/* Table: FAVORITE                                              */
/*==============================================================*/
create table FAVORITE (
   USERNAME             VARCHAR(30)          not null,
   COD_CL               VARCHAR(4)           not null
);

/*==============================================================*/
/* Table: SCHEDULE                                              */
/*==============================================================*/
create table SCHEDULE (
   COD_CLS              VARCHAR(30)          not null,
   GROUP_OF             VARCHAR(2)           not null,
   DAY                  VARCHAR(2)           not null,
   FULL_NAME            VARCHAR(50)          not null,
   COD_TI               INT4                 not null,
   COD_CL               VARCHAR(4)           not null
);

/*==============================================================*/
/* Index: SCHEDULE_PK                                           */
/*==============================================================*/
create  index SCHEDULE_FK on SCHEDULE (
COD_CLS,
GROUP_OF
);

/*==============================================================*/
/* Index: SCHEDULE2_FK                                          */
/*==============================================================*/
create  index SCHEDULE2_FK on SCHEDULE (
DAY
);

/*==============================================================*/
/* Table: STUDENT                                               */
/*==============================================================*/
create table STUDENT (
   CORREO               VARCHAR(60)          not null,
   PASSWORD             VARCHAR(200)         not null,
   USERNAME             VARCHAR(30)          not null,
   constraint PK_STUDENT primary key (USERNAME, CORREO)
);

/*==============================================================*/
/* Index: STUDENT_PK                                            */
/*==============================================================*/
create unique index STUDENT_PK on STUDENT (
USERNAME);
create unique index STUDENT_PK2 on STUDENT(
CORREO
);

/*==============================================================*/
/* Table: STUDENT_SUBJECTS                                      */
/*==============================================================*/
create table STUDENT_SUBJECTS (
   USERNAME             VARCHAR(30)          not null,
   COD_CLS              VARCHAR(30)          not null,
   GROUP_OF             VARCHAR(2)           not null
);

/*==============================================================*/
/* Index: STUDENT_SUBJECTS_FK                                   */
/*==============================================================*/
create  index STUDENT_SUBJECTS_FK on STUDENT_SUBJECTS (
USERNAME
);

/*==============================================================*/
/* Index: STUDENT_SUBJECTS2_FK                                     */
/*==============================================================*/
create  index STUDENT_SUBJECTS2_FK on STUDENT_SUBJECTS (
COD_CLS,
GROUP_OF
);

/*==============================================================*/
/* Table: TEACHER                                               */
/*==============================================================*/
create table TEACHER (
   FULL_NAME            VARCHAR(50)          not null,
   DEGREES              VARCHAR(10)          not null,
   constraint PK_TEACHER primary key (FULL_NAME)
);

/*==============================================================*/
/* Index: TEACHER_PK                                            */
/*==============================================================*/
create unique index TEACHER_PK on TEACHER (
FULL_NAME
);

/*==============================================================*/
/* Table: TIME_OF                                               */
/*==============================================================*/
create table TIME_OF (
   COD_TI               INT4                 not null,
   STARTS               TIME                 not null,
   ENDS                TIME                 not null,
   constraint PK_TIME primary key (COD_TI)
);

/*==============================================================*/
/* Index: TIME_OF_PK                                            */
/*==============================================================*/
create unique index TIME_OF_PK on TIME_OF (
COD_TI
);

alter table FAVORITE
   add constraint FK_FAVORITE_REFERENCE_CLASSROO foreign key (COD_CL)
      references CLASSROOM (COD_CL)
      on delete restrict on update restrict;

alter table FAVORITE
   add constraint FK_FAVORITE_REFERENCE_STUDENT foreign key (USERNAME, USERNAME)
      references STUDENT (USERNAME, CORREO)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_REFERENCE_TIME_OF foreign key (COD_TI)
      references TIME_OF (COD_TI)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_REFERENCE_CLASSROO foreign key (COD_CL)
      references CLASSROOM (COD_CL)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_REFERENCE_TEACHER foreign key (FULL_NAME)
      references TEACHER (FULL_NAME)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_SCHEDULE_SUBJECTS foreign key (COD_CLS, GROUP_OF)
      references SUBJECTS (COD_CLS, GROUP_OF)
      on delete restrict on update restrict;

alter table SCHEDULE
   add constraint FK_SCHEDULE_SCHEDULE2_DAY foreign key (DAY)
      references DAY (DAY)
      on delete restrict on update restrict;

alter table STUDENT_SUBJECTS
   add constraint FK_STUDENT__STUDENT_C_STUDENT foreign key (USERNAME)
      references STUDENT (USERNAME)
      on delete restrict on update restrict;

alter table STUDENT_SUBJECTS
   add constraint FK_STUDENT__STUDENT_C_SUBJECTS foreign key (COD_CLS, GROUP_OF)
      references SUBJECTS (COD_CLS, GROUP_OF)
      on delete restrict on update restrict;