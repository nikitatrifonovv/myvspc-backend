
use vspc_news_database;

create table if not exists block_types
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
)
    engine = MyISAM;

create table if not exists blocks
(
    id       bigint auto_increment
        primary key,
    data     longtext null,
    news     bigint   null,
    position int      null,
    type     bigint   null
)
    engine = MyISAM;

create table if not exists images
(
    id    bigint auto_increment
        primary key,
    image longblob     null,
    name  varchar(255) null
)
    engine = MyISAM;

create table if not exists meta_data
(
    id      bigint auto_increment
        primary key,
    creator varchar(255) null,
    date    datetime     null,
    type    bigint       null
)
    engine = MyISAM;

create table if not exists meta_data_types
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
)
    engine = MyISAM;

create table if not exists news
(
    id        bigint auto_increment
        primary key,
    image     text   null,
    meta_data bigint null,
    sub_title text   null,
    title     text   null
)
    engine = MyISAM;

