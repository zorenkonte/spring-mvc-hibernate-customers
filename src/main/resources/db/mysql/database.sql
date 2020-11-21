CREATE DATABASE  IF NOT EXISTS `customer_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `customer_db`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: customer_db
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `customer_email_uindex` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Mike','Lasseter','mlasseter0@bizjournals.com'),(2,'Valentia','Straker','vstraker1@theguardian.com'),(3,'Brandea','Portis','bportis2@cdbaby.com'),(4,'Gilbert','Garthland','ggarthland3@devhub.com'),(5,'Olivia','Matuskiewicz','omatuskiewicz4@state.tx.us'),(6,'Kienan','Emburey','kemburey5@google.co.jp'),(7,'Rickard','Delatour','rdelatour6@cargocollective.com'),(8,'Nahum','Tabert','ntabert7@cisco.com'),(9,'Rickie','Belderfield','rbelderfield8@cbsnews.com'),(10,'Gottfried','Clery','gclery9@meetup.com'),(11,'Mariquilla','Ghilardini','mghilardinia@usatoday.com'),(12,'Lacee','Ponton','lpontonb@symantec.com'),(13,'Rolland','Itzhayek','ritzhayekc@reverbnation.com'),(14,'Obed','Gutridge','ogutridged@un.org'),(15,'Griffin','Lenahan','glenahane@mail.ru'),(16,'Sissy','Whittuck','swhittuckf@yellowbook.com'),(17,'Wrennie','Courtier','wcourtierg@moonfruit.com'),(18,'Darda','Wroath','dwroathh@answers.com'),(19,'Fayre','Sachno','fsachnoi@gizmodo.com'),(20,'Murry','Oxbury','moxburyj@ibm.com'),(21,'Peta','Gillbey','pgillbeyk@prweb.com'),(22,'Terrance','Broxton','tbroxtonl@istockphoto.com'),(23,'Filberte','Agiolfinger','fagiolfingerm@zdnet.com'),(24,'Tersina','Howden','thowdenn@artisteer.com'),(25,'Hilary','Gauge','hgaugeo@cdbaby.com'),(26,'Colet','Gratland','cgratlandp@facebook.com'),(27,'Kassia','Scartifield','kscartifieldq@themeforest.net'),(28,'Hayyim','Duerden','hduerdenr@phoca.cz'),(29,'Cal','Masham','cmashams@marriott.com'),(30,'Elvis','Boumphrey','eboumphreyt@hp.com'),(31,'Nicoli','Tilburn','ntilburnu@themeforest.net'),(32,'Mirella','Clews','mclewsv@spotify.com'),(33,'Tiffanie','Millis','tmillisw@hostgator.com'),(34,'Phineas','Whatling','pwhatlingx@google.it'),(35,'Ariadne','Klesse','aklessey@nsw.gov.au'),(36,'Finn','Gostick','fgostickz@creativecommons.org'),(37,'Hadrian','Sleite','hsleite10@bloomberg.com'),(38,'Duke','Cawthorn','dcawthorn11@photobucket.com'),(39,'Cross','Norwood','cnorwood12@jugem.jp'),(40,'Ruprecht','Etienne','retienne0@comcast.net'),(41,'Aile','McGrann','amcgrann1@cnet.com'),(42,'Inigo','Hannibal','ihannibal2@mlb.com'),(43,'Umeko','Waldock','uwaldock3@altervista.org'),(44,'Belinda','Blasgen','bblasgen4@phoca.cz'),(45,'Chaim','von Nassau','cvonnassau5@mac.com'),(46,'Rhody','Howse','rhowse6@mtv.com'),(47,'Francklyn','Darkott','fdarkott7@dell.com'),(48,'Shir','Longson','slongson8@earthlink.net'),(49,'Alayne','Petto','apetto9@netlog.com'),(50,'Bing','Maffey','bmaffeya@addthis.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-18 17:28:32