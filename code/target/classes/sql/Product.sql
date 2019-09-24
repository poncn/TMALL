-- auto Generated on 2019-09-23 13:45:43 
-- DROP TABLE IF EXISTS `product`; 
CREATE TABLE product(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    `sub_title` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'subTitle',
    `original_price` DECIMAL(14,4) NOT NULL DEFAULT -1 COMMENT 'originalPrice',
    `promote_price` DECIMAL(14,4) NOT NULL DEFAULT -1 COMMENT 'promotePrice',
    `stock` BIGINT NOT NULL DEFAULT -1 COMMENT 'stock',
    `cid` BIGINT NOT NULL DEFAULT -1 COMMENT 'cid',
    `create_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'product';
