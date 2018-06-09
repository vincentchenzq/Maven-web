-- 创建用户帐号表
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
`createdBy`							  varchar(40)					NOT NULL COMMENT '创建人id',
`createdDate`							DATE						    NOT NULL COMMENT '创建时间',
`updatedBy`							  varchar(40)					NOT NULL COMMENT '更新人id',
`updatedDate`							DATE						    NOT NULL COMMENT '更新时间',
`idUserInfo`              varchar(50)         NOT NULL COMMENT '主键',
`userId`  								varchar(40)					NOT NULL COMMENT '用户账号字母加数字',
`password`								varchar(40)					NOT NULL COMMENT '用户密码',
`isEffective`							varchar(1)					NOT NULL COMMENT '帐号是否有效 0--无效  1--有效',
`userName`								varchar(40)					NOT NULL COMMENT '用户中文名',
PRIMARY KEY (`idUserInfo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';
-- 添加帐号唯一约束
ALTER TABLE user_info ADD UNIQUE (userId);

INSERT INTO user_info values('vincent',NOW(),"vincent",NOW(),UUID(),'vincent','123','1','谌志强');

SELECT * FROM user_info;