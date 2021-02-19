drop table if exists h_user;

/*==============================================================*/
/* Table: h_user                                                */
/*==============================================================*/
create table h_user
(
    id                   bigint not null auto_increment comment '用户ID
            ',
    name                 varchar(255) not null comment '用户名称',
    age                  int comment '用户年龄',
    email                varchar(50) comment '用户邮箱',
    create_date          datetime comment '创建时间',
    update_date          datetime comment '编辑时间',
    version              int comment '版本号',
    primary key (id)
);

alter table h_user comment '用户表';


INSERT INTO `cloud_demo`.`h_user`(`name`, `age`, `email`, `create_date` , `update_date` , `version` ) VALUES ('凯', 20, 'kai@qq.com', '2020-01-19 00:00:00', '2020-01-19 00:00:00', 1);
INSERT INTO `cloud_demo`.`h_user`(`name`, `age`, `email`, `create_date` , `update_date` , `version` ) VALUES ('百里守约', 22, 'bailishouyue@qq.com', '2020-01-19 00:00:00', '2020-01-19 00:00:00', 1);
INSERT INTO `cloud_demo`.`h_user`(`name`, `age`, `email`, `create_date` , `update_date` , `version` ) VALUES ('虞姬', 25, 'yuji@qq.com', '2020-01-19 00:00:00', '2020-01-19 00:00:00', 1);
INSERT INTO `cloud_demo`.`h_user`(`name`, `age`, `email`, `create_date` , `update_date` , `version` ) VALUES ('东皇太一', 55, 'donghuang@qq.com', '2020-01-19 00:00:00', '2020-01-19 00:00:00', 1);
INSERT INTO `cloud_demo`.`h_user`(`name`, `age`, `email`, `create_date` , `update_date` , `version` ) VALUES ('妲己', 26, 'daji@qq.com', '2020-01-19 00:00:00', '2020-01-19 00:00:00', 1);





