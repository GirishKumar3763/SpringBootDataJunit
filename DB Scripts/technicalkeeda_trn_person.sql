-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: technicalkeeda
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `trn_person`
--

DROP TABLE IF EXISTS `trn_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trn_person` (
  `person_id` int NOT NULL,
  `age` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trn_person`
--

LOCK TABLES `trn_person` WRITE;
/*!40000 ALTER TABLE `trn_person` DISABLE KEYS */;
INSERT INTO `trn_person` VALUES (1,35,'girish','kumar'),(2,45,'mahesh009','kumar009'),(3,1,'hari','prasad'),(4,1,'nagamani','mangapuram'),(5,8,'sujju','karanam'),(6,8,'mannu','karanam'),(8,80,'test','test'),(9,8,'test1','test1'),(10,8,'test1','test1'),(11,50,'tulasi','ram'),(12,19,'chaitu','shakti'),(13,32,'geetha','anjali'),(14,18,'test2','test2'),(15,50,'tulasi','ram'),(16,19,'chaitu','shakti'),(17,32,'geetha','anjali'),(18,50,'tulasi','ram'),(19,19,'chaitu','shakti'),(20,32,'geetha','anjali'),(21,50,'tulasi','ram'),(22,19,'chaitu','shakti'),(23,32,'geetha','anjali'),(24,50,'tulasi','ram'),(25,19,'chaitu','shakti'),(26,32,'geetha','anjali'),(27,50,'tulasi','ram'),(28,19,'chaitu','shakti'),(29,32,'geetha','anjali'),(30,50,'tulasi','ram'),(31,19,'chaitu','shakti'),(32,32,'geetha','anjali'),(33,50,'tulasi','ram'),(34,19,'chaitu','shakti'),(35,32,'geetha','anjali'),(36,50,'tulasi','ram'),(37,19,'chaitu','shakti'),(38,32,'geetha','anjali'),(39,50,'tulasi','ram'),(40,19,'chaitu','shakti'),(41,32,'geetha','anjali'),(42,50,'tulasi','ram'),(43,19,'chaitu','shakti'),(44,32,'geetha','anjali'),(45,50,'tulasi','ram'),(46,19,'chaitu','shakti'),(47,32,'geetha','anjali'),(48,50,'tulasi','ram'),(49,19,'chaitu','shakti'),(50,32,'geetha','anjali'),(51,50,'tulasi','ram'),(52,19,'chaitu','shakti'),(53,32,'geetha','anjali'),(54,50,'tulasi','ram'),(55,19,'chaitu','shakti'),(56,32,'geetha','anjali'),(57,50,'tulasi','ram'),(58,19,'chaitu','shakti'),(59,32,'geetha','anjali'),(60,50,'tulasi','ram'),(61,19,'chaitu','shakti'),(62,32,'geetha','anjali');
/*!40000 ALTER TABLE `trn_person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-01 11:56:38
