-- auto Generated on 2019-09-23 13:45:43 
-- DROP TABLE IF EXISTS `property_value`; 
CREATE TABLE property_value(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `pid` BIGINT NOT NULL DEFAULT -1 COMMENT 'pid',
    `ptid` BIGINT NOT NULL DEFAULT -1 COMMENT 'ptid',
    `value` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'value',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'property_value';
