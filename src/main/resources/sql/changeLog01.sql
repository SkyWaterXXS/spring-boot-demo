create table invitation_config
(
	id bigint auto_increment comment '自增主键'
		primary key,
	config_key varchar(50) null comment '配置名称',
	config_value varchar(200) null comment '配置值',
	config_comment varchar(200) null comment '配置说明',
	creator varchar(60) null comment '创建人',
	modifier varchar(60) null comment '修改人',
	created_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
	updated_time timestamp default CURRENT_TIMESTAMP not null comment '修改时间',
	constraint uniq_configKey
		unique (config_key)
)
comment '通用配置表'
;

create table inventory
(
	id bigint auto_increment comment '自增主键'
		primary key,
	num int null comment '库存数量'
)
comment '库存表'
;

INSERT INTO invitation_config (config_key, config_value, config_comment, creator, modifier, created_time, updated_time) VALUES ('INVITATION_USER_HANDLED_ID', '1558177', null, null, null, '2017-09-14 11:20:16', '2017-10-10 16:33:19');
INSERT INTO invitation_config (config_key, config_value, config_comment, creator, modifier, created_time, updated_time) VALUES ('AN_taskStartTime', '10:00:00', '任务开始时间', null, null, '2017-10-18 11:22:45', '2017-10-18 18:19:17');