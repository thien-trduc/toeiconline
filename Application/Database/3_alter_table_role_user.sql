use toeiconline;
alter table userEntity add column roleid bigint;
alter table userEntity add constraint fk_user_role foreign key (roleid) references roleEntity(roleid);
alter table comment add constraint fk_user_comment foreign key (userid) references userEntity(userid);
alter table comment add constraint fk_listenguideline_comment foreign key (listenguidelineid) references listenguideline(listenguidelineid);