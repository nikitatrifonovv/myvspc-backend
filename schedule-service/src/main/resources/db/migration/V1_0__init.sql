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

INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (1, '5', '9:15', '8:30');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (2, '5', '10:05', '9:20');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (3, '5', '10:55', '10:10');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (4, '10', '11:45', '11:00');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (5, '15', '12:40', '11:55');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (6, '5', '13:40', '12:55');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (7, '5', '14:30', '13:45');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (8, '10', '15:20', '14:35');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (9, '5', '16:15', '15:30');
INSERT INTO call_schedule (lesson_number, break, end, start) VALUES (10, '5', '17:05', '16:20');

