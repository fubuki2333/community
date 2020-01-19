create table notification
(
    id bigint auto_increment,
    notifier bigint not null,
    receiver bigint null,
    outerId bigint null,
    type int null,
    gmt_create bigint null,
    status int default 0 null,
    constraint notification_pk
        primary key (id)
);
