-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: jdbc
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `beds`
--

DROP TABLE IF EXISTS `beds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `beds` (
  `reg_no` int NOT NULL,
  `bed_no` int NOT NULL,
  `type` varchar(45) NOT NULL,
  `status` varchar(2) NOT NULL,
  `user` varchar(45) NOT NULL,
  KEY `hosp_reg_idx` (`reg_no`),
  CONSTRAINT `hosp_reg` FOREIGN KEY (`reg_no`) REFERENCES `hospital` (`reg_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `beds`
--

LOCK TABLES `beds` WRITE;
/*!40000 ALTER TABLE `beds` DISABLE KEYS */;
INSERT INTO `beds` VALUES (1,101,'NORMAL','A',''),(1,102,'NORMAL','A',''),(1,201,'ICU','A',''),(1,202,'ICU','A',''),(1,301,'COVID','A',''),(1,302,'COVID','A',''),(1,401,'O2','A',''),(1,402,'O2','A',''),(1,501,'NON-O2','A',''),(1,502,'NON-O2','A',''),(2,101,'NORMAL','A',''),(2,102,'NORMAL','A',''),(2,201,'ICU','A',''),(2,202,'ICU','A',''),(2,301,'COVID','A',''),(2,302,'COVID','A',''),(2,401,'O2','A',''),(2,402,'O2','A',''),(2,501,'NON-O2','A',''),(2,502,'NON-O2','A',''),(3,101,'NORMAL','A',''),(3,102,'NORMAL','A',''),(3,201,'ICU','A',''),(3,202,'ICU','A',''),(3,301,'COVID','A',''),(3,302,'COVID','A',''),(3,401,'O2','A',''),(3,402,'O2','A',''),(3,501,'NON-O2','A',''),(3,502,'NON-O2','A',''),(4,101,'NORMAL','A',''),(4,102,'NORMAL','A',''),(4,201,'ICU','A',''),(4,202,'ICU','A',''),(4,301,'COVID','A',''),(4,302,'COVID','A',''),(4,401,'O2','A',''),(4,402,'O2','A',''),(4,501,'NON-O2','A',''),(4,502,'NON-O2','A',''),(5,101,'NORMAL','A',''),(5,102,'NORMAL','A',''),(5,201,'ICU','A',''),(5,202,'ICU','A',''),(5,301,'COVID','A',''),(5,302,'COVID','A',''),(5,401,'O2','A',''),(5,402,'O2','A',''),(5,501,'NON-O2','A',''),(5,502,'NON-O2','A',''),(6,101,'NORMAL','A',''),(6,102,'NORMAL','A',''),(6,201,'ICU','A',''),(6,202,'ICU','A',''),(6,301,'COVID','A',''),(6,302,'COVID','A',''),(6,401,'O2','A',''),(6,402,'O2','A',''),(6,501,'NON-O2','A',''),(6,502,'NON-O2','A',''),(7,101,'NORMAL','A',''),(7,102,'NORMAL','A',''),(7,201,'ICU','A',''),(7,202,'ICU','A',''),(7,301,'COVID','A',''),(7,302,'COVID','A',''),(7,401,'O2','A',''),(7,402,'O2','A',''),(7,501,'NON-O2','A',''),(7,502,'NON-O2','A',''),(8,101,'NORMAL','A',''),(8,102,'NORMAL','A',''),(8,201,'ICU','A',''),(8,202,'ICU','A',''),(8,301,'COVID','A',''),(8,302,'COVID','A',''),(8,401,'O2','A',''),(8,402,'O2','A',''),(8,501,'NON-O2','A',''),(8,502,'NON-O2','A',''),(9,101,'NORMAL','A',''),(9,102,'NORMAL','A',''),(9,201,'ICU','A',''),(9,202,'ICU','A',''),(9,301,'COVID','A',''),(9,302,'COVID','A',''),(9,401,'O2','A',''),(9,402,'O2','A',''),(9,501,'NON-O2','A',''),(9,502,'NON-O2','A',''),(10,101,'NORMAL','A',''),(10,102,'NORMAL','A',''),(10,201,'ICU','A',''),(10,202,'ICU','A',''),(10,301,'COVID','A',''),(10,302,'COVID','A',''),(10,401,'O2','A',''),(10,402,'O2','A',''),(10,501,'NON-O2','A',''),(11,101,'NORMAL','A',''),(11,102,'NORMAL','A',''),(11,201,'ICU','A',''),(11,202,'ICU','A',''),(11,301,'COVID','A',''),(11,302,'COVID','A',''),(11,401,'O2','A',''),(11,402,'O2','A',''),(11,501,'NON-O2','A',''),(11,502,'NON-O2','A',''),(12,101,'NORMAL','A',''),(12,102,'NORMAL','A',''),(12,201,'ICU','A',''),(12,202,'ICU','A',''),(12,301,'COVID','A',''),(12,302,'COVID','A',''),(12,401,'O2','A',''),(12,402,'O2','A',''),(12,501,'NON-O2','A',''),(12,502,'NON-O2','A',''),(13,101,'NORMAL','A',''),(13,102,'O2','A',''),(13,201,'ICU','A',''),(13,202,'COVID','A',''),(14,101,'COVID','A',''),(14,102,'COVID','A',''),(14,201,'NORMAL','A',''),(14,202,'NORMAL','A',''),(15,101,'COVID','A',''),(15,102,'O2','A',''),(15,201,'NON-O2','A',''),(15,202,'COVID','A',''),(16,101,'COVID','A',''),(16,102,'CICU','A',''),(16,201,'NORMAL','A',''),(16,202,'O2','A',''),(17,101,'COVID','A',''),(17,102,'COVID','A',''),(17,201,'NORMAL','A',''),(17,202,'O2','A',''),(18,101,'COVID','A',''),(18,102,'COVID','A',''),(18,201,'COVID','A',''),(18,202,'NORMAL','A',''),(19,101,'COVID','A',''),(19,102,'COVID','A',''),(19,201,'ICU','A',''),(19,202,'NON-O2','A',''),(20,101,'COVID','A',''),(20,102,'COVID','A',''),(20,201,'NORMAL','A',''),(20,202,'ICU','A',''),(21,101,'COVID','A',''),(21,102,'COVID','A',''),(21,201,'COVID','A',''),(21,202,'NORMAL','A',''),(22,101,'NORMAL','A',''),(22,102,'O2','A',''),(22,201,'ICU','A',''),(22,202,'NON-O2','A',''),(10,502,'NON-O2','NA','temp');
/*!40000 ALTER TABLE `beds` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-18 14:34:19
