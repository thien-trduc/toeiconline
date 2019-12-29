use toeiconline;
create table userEntity (
                      userid bigint not null primary key auto_increment,
                      name varchar(255) null,
                      password varchar(255) null,
                      fullname varchar(255) null,
                      createdate timestamp null

);
create table roleEntity (
                      roleid bigint not null primary key ,
                      name varchar(255) null
);
create table listenguideline (
                                 listenguidelineid bigint not null primary key  auto_increment ,
                                 title varchar(512) null,
                                 image varchar(255) null,
                                 content text null,
                                 createddate timestamp null,
                                 modifieddate timestamp null
);
create table comment (
                        commonid bigint not null primary key auto_increment,
                        content text null,
                        userid BIGINT null,
                        listenguidelineid BIGINT null,
                        createddate timestamp null
);