-- auto Generated on 2019-09-23 13:45:43 
-- DROP TABLE IF EXISTS `property`; 
CREATE TABLE property(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `cid` BIGINT NOT NULL DEFAULT -1 COMMENT 'cid',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'property';
