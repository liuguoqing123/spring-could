/*
SQLyog v10.2 
MySQL - 5.5.37 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_sex` enum('男','女','其他') DEFAULT NULL,
  `user_tel` varchar(20) DEFAULT NULL,
  `user_addr` varchar(20) DEFAULT NULL,
  `user_remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`user_name`,`user_sex`,`user_tel`,`user_addr`,`user_remark`) values (6,'lewis345','男','546','666666666','南京1'),(8,'lewis3','男','546','男','南京3'),(9,'lewis5','男','546','男','南京5'),(10,'lewis5','男','546','男','南京10'),(12,'lewis5','男','546','男','南京11'),(13,'lewis8','女','124','仍无法','去玩儿'),(14,'Lewis14','其他','4645','第三方','得分表'),(15,'lewis5','男','546','男','南京11'),(16,'lewis5','男','546','男','南京11'),(17,'12','女','32342',NULL,NULL),(19,'19','其他','dwa','qweq','qwe'),(20,'二手房','男','12',NULL,NULL),(21,'二手房','女','12',NULL,NULL),(22,'二手房','男','12','7','u'),(23,'123','男','32342','1','1'),(24,'奇热网群','男','1231','2','1'),(25,'刘德华','男','153','先',NULL),(26,'哈哈','女','655',NULL,NULL),(27,'发放','其他','454636','丰富','去玩儿群若'),(28,'人请热无','男','242','然后他已经','体检人员'),(29,'二手房','男','12',NULL,NULL),(30,'宏观经济控股','女','3234212',NULL,NULL),(31,'二手房','男','22525','666666666','352'),(32,'liuguoqing','男','42934928','666666666','1231'),(33,'奇热网群','男','12','666666666','南京1'),(34,'二手房','其他','12',NULL,NULL),(35,'二手房','男','546',NULL,NULL),(36,'二手房','女','12',NULL,NULL),(37,'二手房','女','546',NULL,NULL),(38,'二手房','女','546',NULL,NULL),(39,'奇热网群','女','546',NULL,NULL),(40,'二手房','女','546',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
