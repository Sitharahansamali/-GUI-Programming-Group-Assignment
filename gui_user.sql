-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: userdb
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `gender` enum('Male','Female') NOT NULL,
  `birthday` date NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Sithara','sithara@gmail.com','Female','2001-02-23','password123'),(2,'John Doe','john@example.com','Male','1992-08-20','securepass456'),(3,'sithara','hsithara69@gmail.com','Female','2000-01-01','20015562'),(4,'sithara','h@gmail.com','Female','1900-01-01','12536'),(5,'hansamali','hansa@gmail.co','Male','1900-01-01',''),(6,'hansamali','hsith@gmail.com','Male','1900-01-01',''),(7,'sitha','h@gamail.com','Female','1900-01-01',''),(8,'sitha','hsithara@gmail.com','Female','1900-01-01','12'),(11,'ishuu','isu@gmail.com','Male','1900-01-01','152'),(13,'ishuu','isur@gmail.com','Male','1900-01-01',''),(14,'nafra','naf@gmail.com','Female','1900-01-01','1524'),(15,'hasidu','hasi@gmail.com','Male','1900-01-01','1258'),(16,'chamoo','chao@gmail.com','Female','1900-01-01','14526'),(17,'kln','kln@gmail.com','Female','1900-01-01','14opuhn'),(18,'ghy','ghy@gmail.com','Male','1900-01-01','254lku'),(19,'frt','frt@gmail.com','Female','1900-01-01','1457pou'),(20,'wrt','wrt@gmail.com','Female','1900-01-01','1458'),(21,'sitha','sitha@gmail.com','Male','1900-01-01','2568'),(24,'sithar','dgt@gmail.com','Female','1900-01-01','1524'),(25,'wrty','wrty@gmail.com','Female','1900-01-01','34rty'),(26,'drt','drt@gmail.com','Female','1900-01-01','456'),(27,'klmn','klmn@gmail.com','Female','1900-01-01','fgtyhu'),(28,'dft','fty@gmail.com','Male','1900-01-01','458po'),(29,'dfg','dfg@gmail.com','Female','1900-01-01','5214'),(30,'pouy','iohn@gmail.com','Female','1900-01-01','fgtry'),(31,'adrtg','adrty@gmail.com','Female','1900-01-01','wtyuf'),(32,'sdf','adf@gmail.com','Female','1900-01-01','ght45'),(33,'gpkjnm','plm@gmail.com','Female','1900-01-01','hn256');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-03 23:57:09
