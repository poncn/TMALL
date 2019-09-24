-- auto Generated on 2019-09-23 13:45:43 
-- DROP TABLE IF EXISTS `product_image`; 
CREATE TABLE product_image(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `pid` BIGINT NOT NULL DEFAULT -1 COMMENT 'pid',
    `type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'type',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'product_image';
