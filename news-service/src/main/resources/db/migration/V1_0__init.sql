
#TODO Добавлять типы поумолчанию при создании БД
use vspc_news_database;

create table if not exists block_type
(
    type_id   bigint auto_increment
        primary key,
    type_name varchar(255) null
)
    engine = MyISAM;

create table if not exists blocks
(
    block_id       varchar(36) default (uuid()) not null
        primary key,
    block_data     longtext    null,
    news_id        varchar(36) null,
    block_position int         null,
    block_type     bigint      null
)
    engine = MyISAM;

create table if not exists image
(
    image_id     varchar(36) default (uuid()) not null
        primary key,
    image_binary longblob                     null,
    image_name   varchar(255)                 null
)
    engine = MyISAM;

create table if not exists news
(
    news_id               varchar(36)  default (uuid())
        not null primary key,
    news_created_at       datetime default (now()) null,
    news_creator          varchar(255)             null,
    news_image_preview_id varchar(36)              null,
    news_sub_title        text                     null,
    news_title            text                     null,
    type                  bigint                   null
)
    engine = MyISAM;

create table if not exists news_type
(
    type_id   bigint auto_increment
        primary key,
    type_name varchar(255) null
)
    engine = MyISAM;


