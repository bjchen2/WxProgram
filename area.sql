CREATE TABLE `area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `priority` int(11) NOT NULL DEFAULT '0' COMMENT '权值',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间戳',
  `last_edit_time` bigint(20) DEFAULT NULL COMMENT '最后修改时间戳',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8
