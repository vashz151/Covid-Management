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
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital` (
  `reg_no` int NOT NULL,
  `hname` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `pincode` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `available_beds` int DEFAULT NULL,
  PRIMARY KEY (`reg_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` VALUES (1,'Breach Candy Hospital','60-A Bhulabhai Desai Road',400026,'info@breachcandyhospital.org',10),(2,'Cumballa Hill Hospital & Heart Institute','93/95 August Kranti Marg',400036,'chh@vsnl.com',10),(3,'Dr. L H Hiranandani Hospital','Hiranandani Gardens, Powai',400076,'wecare@hiranandanihospital.org',10),(4,'IPC Heart Care Centre','Raghuvanshi Mill Compound, Lower Parel',400013,'pratiksha@ipc-india.com',10),(5,'Jaslok Hospital','Dr. Deshmukh Marg, Pedder Road',400026,'info@jaslokhospital.net',10),(6,'King Edward Memorial Hospital','Acharya Donde Marg, Parel',400012,'websitecontact@kem.edu',10),(7,'Asian Heart Institute','Bandra Kurla Complex, Bandra (E)',400051,'info@ahirc.com',10),(8,'Aditya Jyot Eye Care Hospital','Major Parmeshwaran Road, Wadala',400031,'ajeh@vsnl.com',10),(9,'P. D. Hinduja National Hospital','Veer Savarkar Marg, Mahim',400016,'info@hindujahospital.com',10),(10,'My Aarogya Medical Center','Raheja Rugnalaya Marg, Mahim',400016,'info@amc.in',9),(11,'R G Stone Urology Centre','Valiji Ladha Road, Mulund (W)',400080,'info@rgsuc.in',10),(12,'Tata Memorial Hospital','Dr. E Borges Road, Parel',400012,'tmcit1@vsnl.com',10),(13,'Wockhardt Hospital','Mulund Goregaon Link Road',400011,'help@whosp.com',4),(14,'Kokilaben Dhirubhai Ambani Hospital','Four Bunglows, Andheri (W)',400053,'info@kdah.com',4),(15,'Nanavati Hospital ','Vile Parle (W)',400056,'marketing@nanavatihospital.org',4),(16,'Fortis Hospital','Mulund (W)',400078,'fortis@mumbai.in',4),(17,'Seven Hill Hospital','Andheri (E)',400059,'response@sevenhillshospital.com',4),(18,'SL Raheja Hospital','Mahim (W)',400016,'info@rahejhospital.com',4),(19,'Global Hospital','Parel',400012,'info@globalhospital.in',4),(20,'Kohinoor Hospital','Kurla (W)',400070,'info@kohinoorhospitals.in',4),(21,'Shroff Eye Hospital','S. V. Road, Bandra (W)',400050,'safalashroff@lasikindia.in',4),(22,'Lilavati Hospital','Bandra Reclamation',400050,'info@lilavatihospital.com',4);
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-18 14:34:18
