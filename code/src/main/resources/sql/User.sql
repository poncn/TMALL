-- auto Generated on 2019-09-23 13:45:43 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE user(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    `password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'user';
