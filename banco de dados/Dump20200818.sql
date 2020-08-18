-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: db_os
-- ------------------------------------------------------
-- Server version	5.5.62

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `os2`
--

DROP TABLE IF EXISTS `os2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `os2` (
  `codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dataemissao` date DEFAULT NULL,
  `horaemissao` time DEFAULT NULL,
  `status` varchar(25) DEFAULT 'ABERTA',
  `cliente` int(11) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `tecnico` int(11) DEFAULT NULL,
  `numerodeserie` varchar(30) DEFAULT NULL,
  `placa` varchar(15) DEFAULT NULL,
  `obs` text,
  `datafechamento` date DEFAULT NULL,
  `horafechamento` time DEFAULT NULL,
  `loja` int(10) unsigned DEFAULT NULL,
  `cor` varchar(255) DEFAULT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `fabricante` varchar(100) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `km` varchar(255) DEFAULT NULL,
  `problema_informado` longtext,
  `problema_datectado` longtext,
  `solucao_aplicado` longtext,
  `valortotal_av` decimal(10,2) DEFAULT NULL,
  `valortotal_ap` decimal(10,2) DEFAULT NULL,
  `valorfinal` decimal(10,2) DEFAULT '0.00',
  `quemcancelou` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `datagatantia` date DEFAULT '2001-01-01',
  `condicoesdeservico` longtext CHARACTER SET utf8,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `codigo` (`codigo`),
  KEY `dataemissao` (`dataemissao`),
  KEY `horaemissao` (`horaemissao`),
  KEY `status` (`status`),
  KEY `cliente` (`cliente`),
  KEY `tipo` (`tipo`),
  KEY `tecnico` (`tecnico`),
  KEY `numerodeserie` (`numerodeserie`),
  KEY `placa` (`placa`),
  KEY `datafechamento` (`datafechamento`),
  KEY `horafechamento` (`horafechamento`),
  KEY `loja` (`loja`),
  KEY `datagatantia` (`datagatantia`),
  KEY `quemcancelou` (`quemcancelou`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=87;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `os2`
--

LOCK TABLES `os2` WRITE;
/*!40000 ALTER TABLE `os2` DISABLE KEYS */;
INSERT INTO `os2` VALUES (8,'2020-08-18','00:13:43','Aberta',NULL,NULL,NULL,NULL,'OKK 1719',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(23,'2020-08-18','00:13:29','Aberta',NULL,NULL,NULL,NULL,'OKK 1718',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(27,'2020-08-17','23:47:58','Aberta',NULL,NULL,NULL,NULL,'OKK 1718',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `os2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_os'
--

--
-- Dumping routines for database 'db_os'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-18  0:18:44
