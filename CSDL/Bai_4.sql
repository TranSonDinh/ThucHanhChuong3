-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: do_an
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `de_tai`
--

DROP TABLE IF EXISTS `de_tai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `de_tai` (
  `MaDT` varchar(10) NOT NULL,
  `TenDT` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaDT`),
  UNIQUE KEY `MaDT_UNIQUE` (`MaDT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `de_tai`
--

LOCK TABLES `de_tai` WRITE;
/*!40000 ALTER TABLE `de_tai` DISABLE KEYS */;
/*!40000 ALTER TABLE `de_tai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giao_vien`
--

DROP TABLE IF EXISTS `giao_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giao_vien` (
  `MaGV` varchar(10) NOT NULL,
  `HoTen` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `MaHV` varchar(10) NOT NULL,
  PRIMARY KEY (`MaGV`),
  UNIQUE KEY `MaGV_UNIQUE` (`MaGV`),
  KEY `fk_MaHV_gv_idx` (`MaHV`),
  CONSTRAINT `fk_MaHV_gv` FOREIGN KEY (`MaHV`) REFERENCES `hoc_vi` (`MaHV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giao_vien`
--

LOCK TABLES `giao_vien` WRITE;
/*!40000 ALTER TABLE `giao_vien` DISABLE KEYS */;
/*!40000 ALTER TABLE `giao_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giao_vien_de_tai`
--

DROP TABLE IF EXISTS `giao_vien_de_tai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giao_vien_de_tai` (
  `MaGV` varchar(10) NOT NULL,
  `MaDT` varchar(10) NOT NULL,
  KEY `fk_MaDT_gvdt_idx` (`MaDT`),
  KEY `fk_MaGV_gvdt_idx` (`MaGV`),
  CONSTRAINT `fk_MaDT_gvdt` FOREIGN KEY (`MaDT`) REFERENCES `de_tai` (`MaDT`),
  CONSTRAINT `fk_MaGV_gvdt` FOREIGN KEY (`MaGV`) REFERENCES `giao_vien` (`MaGV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giao_vien_de_tai`
--

LOCK TABLES `giao_vien_de_tai` WRITE;
/*!40000 ALTER TABLE `giao_vien_de_tai` DISABLE KEYS */;
/*!40000 ALTER TABLE `giao_vien_de_tai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoc_vi`
--

DROP TABLE IF EXISTS `hoc_vi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoc_vi` (
  `MaHV` varchar(10) NOT NULL,
  `TenHV` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaHV`),
  UNIQUE KEY `MaHV_UNIQUE` (`MaHV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoc_vi`
--

LOCK TABLES `hoc_vi` WRITE;
/*!40000 ALTER TABLE `hoc_vi` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoc_vi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ket_qua`
--

DROP TABLE IF EXISTS `ket_qua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ket_qua` (
  `MaSV` varchar(10) NOT NULL,
  `MaDT` varchar(10) NOT NULL,
  `Diem` int DEFAULT NULL,
  KEY `fk_MaSV_kq_idx` (`MaSV`),
  KEY `fk_MaDT_idx` (`MaDT`),
  CONSTRAINT `fk_MaDT` FOREIGN KEY (`MaDT`) REFERENCES `de_tai` (`MaDT`),
  CONSTRAINT `fk_MaSV_kq` FOREIGN KEY (`MaSV`) REFERENCES `sinh_vien` (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ket_qua`
--

LOCK TABLES `ket_qua` WRITE;
/*!40000 ALTER TABLE `ket_qua` DISABLE KEYS */;
/*!40000 ALTER TABLE `ket_qua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinh_vien`
--

DROP TABLE IF EXISTS `sinh_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinh_vien` (
  `MaSV` varchar(10) NOT NULL,
  `HoTen` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `Lop` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaSV`),
  UNIQUE KEY `MaSV_UNIQUE` (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinh_vien`
--

LOCK TABLES `sinh_vien` WRITE;
/*!40000 ALTER TABLE `sinh_vien` DISABLE KEYS */;
/*!40000 ALTER TABLE `sinh_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinh_vien_de_tai`
--

DROP TABLE IF EXISTS `sinh_vien_de_tai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinh_vien_de_tai` (
  `MaSV` varchar(10) NOT NULL,
  `MaDT` varchar(10) NOT NULL,
  UNIQUE KEY `MaSV_UNIQUE` (`MaSV`),
  KEY `fk_MaSV_svdt_idx` (`MaSV`),
  KEY `fk_MaDT_svdt_idx` (`MaDT`),
  CONSTRAINT `fk_MaDT_svdt` FOREIGN KEY (`MaDT`) REFERENCES `de_tai` (`MaDT`),
  CONSTRAINT `fk_MaSV_svdt` FOREIGN KEY (`MaSV`) REFERENCES `sinh_vien` (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinh_vien_de_tai`
--

LOCK TABLES `sinh_vien_de_tai` WRITE;
/*!40000 ALTER TABLE `sinh_vien_de_tai` DISABLE KEYS */;
/*!40000 ALTER TABLE `sinh_vien_de_tai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'do_an'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-15 17:20:14
