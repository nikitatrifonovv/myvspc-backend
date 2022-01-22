use vspc_schedule_db;

create table if not exists _groups
(
    id   int auto_increment
    primary key,
    name varchar(255) null
    )
    engine = MyISAM;

create table if not exists call_schedule
(
    lesson_number int          not null
    primary key,
    break         varchar(255) null,
    end           varchar(255) null,
    start         varchar(255) null
    )
    engine = MyISAM;

create table if not exists day_of_week
(
    id   int auto_increment
    primary key,
    name varchar(255) null
    )
    engine = MyISAM;

create table if not exists lesson
(
    id          bigint auto_increment
    primary key,
    audience    varchar(255) null,
    day_of_week int          null,
    group_id    int          null,
    name        text         null,
    number      int          null,
    semester    int          null,
    subgroup    int          null,
    teacher     text         null,
    type        int          null
    )
    engine = MyISAM;

create table if not exists lesson_type
(
    id   int auto_increment
    primary key,
    name varchar(255) null
    )
    engine = MyISAM;


