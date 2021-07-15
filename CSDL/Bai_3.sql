-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: qlsach
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
-- Table structure for table `tblchitietsach`
--

DROP TABLE IF EXISTS `tblchitietsach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblchitietsach` (
  `MaCaBiet` varchar(10) NOT NULL,
  `MaSach` varchar(10) DEFAULT NULL,
  `TinhTrangSach` tinyint DEFAULT NULL,
  `TinhTrangPhucVu` tinyint DEFAULT NULL,
  PRIMARY KEY (`MaCaBiet`),
  UNIQUE KEY `MaCaBiet_UNIQUE` (`MaCaBiet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblchitietsach`
--

LOCK TABLES `tblchitietsach` WRITE;
/*!40000 ALTER TABLE `tblchitietsach` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblchitietsach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldocgia`
--

DROP TABLE IF EXISTS `tbldocgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldocgia` (
  `SoThe` varchar(10) NOT NULL,
  `HoTen` varchar(45) NOT NULL,
  `DVCT` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SoThe`),
  UNIQUE KEY `SoThe_UNIQUE` (`SoThe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldocgia`
--

LOCK TABLES `tbldocgia` WRITE;
/*!40000 ALTER TABLE `tbldocgia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbldocgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsach`
--

DROP TABLE IF EXISTS `tblsach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsach` (
  `MaSach` varchar(10) NOT NULL,
  `TuSach` varchar(45) DEFAULT NULL,
  `SoTrang` smallint DEFAULT NULL,
  `MaTG` varchar(10) DEFAULT NULL,
  `NamXB` int DEFAULT NULL,
  `TuKhoa` varchar(45) DEFAULT NULL,
  `NXB` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaSach`),
  UNIQUE KEY `MaSach_UNIQUE` (`MaSach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsach`
--

LOCK TABLES `tblsach` WRITE;
/*!40000 ALTER TABLE `tblsach` DISABLE KEYS */;
INSERT INTO `tblsach` VALUES ('S01','Khoa học',120,'TG02',2000,'Khoa học, tự nhiên','Tiên Phong'),('S02','Toán',200,'TG01',1998,'Hình học, toán','Nhà nước');
/*!40000 ALTER TABLE `tblsach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsachmuon`
--

DROP TABLE IF EXISTS `tblsachmuon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsachmuon` (
  `SoThe` varchar(10) NOT NULL,
  `MaCaBiet` varchar(45) DEFAULT NULL,
  `NgayMuon` date DEFAULT NULL,
  `NgayPhaiTra` date DEFAULT NULL,
  `NgayTra` date DEFAULT NULL,
  PRIMARY KEY (`SoThe`),
  UNIQUE KEY `SoThe_UNIQUE` (`SoThe`),
  UNIQUE KEY `MaCaBiet_UNIQUE` (`MaCaBiet`),
  KEY `fk_MaCaBiet_idx` (`MaCaBiet`),
  CONSTRAINT `fk_MaCaBiet` FOREIGN KEY (`MaCaBiet`) REFERENCES `tblchitietsach` (`MaCaBiet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsachmuon`
--

LOCK TABLES `tblsachmuon` WRITE;
/*!40000 ALTER TABLE `tblsachmuon` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblsachmuon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsachtg`
--

DROP TABLE IF EXISTS `tblsachtg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsachtg` (
  `MaSach` varchar(10) NOT NULL,
  `MaTG` varchar(10) DEFAULT NULL,
  UNIQUE KEY `MaSach_UNIQUE` (`MaSach`),
  KEY `fk_matg_idx` (`MaTG`),
  KEY `fk_masach_idx` (`MaSach`),
  CONSTRAINT `fk_masach` FOREIGN KEY (`MaSach`) REFERENCES `tblsach` (`MaSach`),
  CONSTRAINT `fk_matg` FOREIGN KEY (`MaTG`) REFERENCES `tbltacgia` (`MaTG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsachtg`
--

LOCK TABLES `tblsachtg` WRITE;
/*!40000 ALTER TABLE `tblsachtg` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblsachtg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbltacgia`
--

DROP TABLE IF EXISTS `tbltacgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbltacgia` (
  `MaTG` varchar(10) NOT NULL,
  `TenTG` varchar(45) DEFAULT NULL,
  `DCLienHe` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaTG`),
  UNIQUE KEY `MaTG_UNIQUE` (`MaTG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltacgia`
--

LOCK TABLES `tbltacgia` WRITE;
/*!40000 ALTER TABLE `tbltacgia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbltacgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'qlsach'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-15 17:20:51
