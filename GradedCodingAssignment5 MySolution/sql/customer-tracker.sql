CREATE DATABASE  IF NOT EXISTS `web_customer_trackersss` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `web_customer_tracker`;

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `customer` VALUES 
	(1,'David','Adams','David@gl.com'),
	(2,'Maxwell','Dixon','Maxwell@gl.com'),
	(3,'John','Doe','John@gl.com'),
	(4,'Mary','Public','Mary@gl.com'),
	(5,'Ajay','Rao','Ajay@gl.com');


