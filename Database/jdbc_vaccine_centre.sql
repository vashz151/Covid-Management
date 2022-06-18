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
-- Table structure for table `vaccine_centre`
--

DROP TABLE IF EXISTS `vaccine_centre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaccine_centre` (
  `centre_id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(15) NOT NULL,
  `cname` varchar(45) NOT NULL,
  `address` varchar(100) NOT NULL,
  `pincode` int NOT NULL,
  `d_count` int DEFAULT NULL,
  PRIMARY KEY (`centre_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccine_centre`
--

LOCK TABLES `vaccine_centre` WRITE;
/*!40000 ALTER TABLE `vaccine_centre` DISABLE KEYS */;
INSERT INTO `vaccine_centre` VALUES (1,'covishield','SRV Hospital','179, Kamal Charan Building, 180, Rd Number 2, Jawahar Nagar, Goregaon West',400062,200),(2,'covaxin','Suvidha Hospital & Polyclinic','275, Rd Number 3, Jawahar Nagar, Goregaon West',400104,200),(3,'covishield','Dr. Rane Hospital','Station Rd, Sanjay Gandhi Nagar, Gandhi Nagar Society, Janata Colony, Jogeshwari East',400060,200),(4,'covaxin','Aditya Nursing Home Andheri west','Aditya nursing home Barda wadi, Andheri West',400058,200),(5,'covishield','Kokilaben Dhirubhai Ambani Hospital',' Rao Saheb, Achutrao Patwardhan Marg, Four Bungalows, Andheri West',400053,200),(6,'covaxin','Lion Kartar Singh Hospital','1st Floor, 6- B, Dadabhai Cross Rd, near Navrang Talkies, Gilbert Hill, Andheri West',400009,200),(7,'covishield','S.K. Patil Mahanagarpalika General Hospital','Daftary Road, Malkani Estate, Pushpa Park, Malad East',400097,199),(8,'covaxin','DNA Multispeciality Hospital','2, Whispering Palms Shopping Complex Akurli Road Opp.Mahindra Gate, Lokhandwala Twp, Kandivali East',400101,200),(9,'covishield','Thunga Hospital','Opp. Nirman Hitech Diagnostics, Goraswadi Lane, Near PVR Milap theatre, Off, SV Rd, Malad',400064,200),(10,'covaxin','Shree Naminath Jain Foundation','Mahavir Nagar, Borivali',400066,200),(11,'covishield','BKC JUMBO COVID FACILITY 1','MMRDA GROUND BKC MUMBAI, Mumbai',400051,200),(12,'covaxin','SOMAIYA JUMBO CENTRE SION','Sion Somaiya Jumbo Covid Centre Somaiya Ground Sion Mumbai',400022,200),(13,'covishield','AMEYA SURGICAL AND GENERAL NHF','23 Ajit Nagar J.B. Nagar Andheri East',400059,200),(14,'covaxin','WELLSPRING HEALTHCARE CENTRE','WELLNESS HEALTHSPRING CENTRE SHOP NO. 1 GROUND FLOOR SAIDEEP 17 OLD CUFFE PARADE COLABA, Mumbai',400005,200),(15,'covishield','DR ALVAS DIAGNOSTIC CENTRE','113 Prabhadevi Industrial Estate Next To Kohinoor Park Hotel',400025,200),(16,'covaxin','JASLOK HOSPITAL 1','15 Dr G Deshmukh Marg Peddar Road Mumbai, Mumbai, Maharashtra',400026,200),(17,'covishield','BALAJI HEART HOSPITAL','BYCULLA Cross Lane III Victoria Road Byculla East',400027,200),(18,'covaxin','HOLY SPIRIT HOSPITAL 1','Mahakali Caves Rd Sher E Punjab Colony Andheri East Mumbai Maharashtra',400093,200),(19,'covishield','MY AAROGYA CENTER','Building No 53 Radheshyam Soc. Opp. MIG. Crikcet Ground Gandhi Nagar Bandra (E)',400061,200),(20,'covaxin','AXON HOSPITAL','Pranik Chamber Building 5 Th Floor A Wing Sakivihar Road Sakinka Junction Andheri East',400072,200);
/*!40000 ALTER TABLE `vaccine_centre` ENABLE KEYS */;
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
