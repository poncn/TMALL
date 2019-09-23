-- auto Generated on 2019-09-23 13:45:43 
-- DROP TABLE IF EXISTS `order`; 
CREATE TABLE order(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `order_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'orderCode',
    `address` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'address',
    `post` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'post',
    `receiver` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'receiver',
    `mobile` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'mobile',
    `user_message` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'userMessage',
    `create_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    `pay_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'payDate',
    `delivery_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'deliveryDate',
    `confirm_date` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'confirmDate',
    `uid` BIGINT NOT NULL DEFAULT -1 COMMENT 'uid',
    `status` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'status',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'order';
