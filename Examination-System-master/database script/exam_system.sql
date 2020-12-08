-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: exam
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `answers`
--

DROP TABLE IF EXISTS `answers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answers` (
  `answer_id` int NOT NULL AUTO_INCREMENT,
  `exam_id` int NOT NULL,
  `question` varchar(45) NOT NULL,
  `answer` varchar(45) NOT NULL,
  `correct_answer` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`answer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answers`
--

LOCK TABLES `answers` WRITE;
/*!40000 ALTER TABLE `answers` DISABLE KEYS */;
/*!40000 ALTER TABLE `answers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `course_name` varchar(25) NOT NULL,
  `total_marks` int NOT NULL,
  `time` varchar(45) NOT NULL,
  PRIMARY KEY (`course_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES ('CompilerDesign',20,'180'),('DBMS',20,'180'),('JAVA',20,'120'),('OOPS',20,'120'),('Programining in CPP',20,'120');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_reg`
--

DROP TABLE IF EXISTS `exam_reg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam_reg` (
  `Name` varchar(30) NOT NULL,
  `EnrollmentNo` varchar(45) NOT NULL,
  `Sem` varchar(45) DEFAULT NULL,
  `Branch` varchar(45) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `DOB` varchar(45) DEFAULT NULL,
  `Mobile` int DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  `PIN` int DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `FName` varchar(45) DEFAULT NULL,
  `FMobile` varchar(45) DEFAULT NULL,
  `F_Occ` varchar(45) DEFAULT NULL,
  `MName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EnrollmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_reg`
--

LOCK TABLES `exam_reg` WRITE;
/*!40000 ALTER TABLE `exam_reg` DISABLE KEYS */;
INSERT INTO `exam_reg` VALUES ('thtrb','bt','V','IT','Female','5663',564454564,'gfdget4t4evee','gbfff','dgdgtr',54544,'gdgdv','gdd','dgrg','fdhrg','gbb'),('bt','btr','III','IT','Female','3434',342424,'3vdadwrss','scscs','csev',434334,'vdvdcvds','dscsdvs','343','dfvdf','cscs'),('daad','dzdfd','I','IT','Male','fwefwe',34355,'df','sdd','dd',3456,'fgfgd','dgd','xdv','dfdf','fsdf');
/*!40000 ALTER TABLE `exam_reg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exams`
--

DROP TABLE IF EXISTS `exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exams` (
  `exam_id` int NOT NULL AUTO_INCREMENT,
  `std_id` varchar(45) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `total_marks` varchar(45) NOT NULL,
  `obt_marks` varchar(45) DEFAULT NULL,
  `date` varchar(45) NOT NULL,
  `start_time` varchar(45) NOT NULL,
  `end_time` varchar(45) DEFAULT NULL,
  `exam_time` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams`
--

LOCK TABLES `exams` WRITE;
/*!40000 ALTER TABLE `exams` DISABLE KEYS */;
INSERT INTO `exams` VALUES (1,'2','DBMS','20','0','18-11-2020','00:23:58.483','00:23:59.981','180','Fail'),(2,'2','JAVA','20','20','18-11-2020','00:24:10.201','00:24:15.027','120','Pass'),(3,'2','DBMS','20',NULL,'18-11-2020','00:27:11.346',NULL,'180',NULL),(4,'2','C++','20',NULL,'18-11-2020','00:29:08.205',NULL,'120',NULL),(5,'2','DBMS','20','20','18-11-2020','00:29:18.848','00:29:24.839','180','Pass'),(6,'2','JAVA','20','20','18-11-2020','00:29:30.295','00:29:35.118','120','Pass'),(7,'2','C++','20',NULL,'18-11-2020','00:29:57.101',NULL,'120',NULL),(8,'2','CPP','20',NULL,'18-11-2020','00:32:02.120',NULL,'120',NULL),(9,'2','CPP','20',NULL,'18-11-2020','00:32:44.335',NULL,'120',NULL),(10,'2','DBMS','20',NULL,'18-11-2020','00:32:49.633',NULL,'180',NULL),(11,'2','JAVA','20',NULL,'18-11-2020','00:32:55.163',NULL,'120',NULL),(12,'2','OOPS','20','20','18-11-2020','00:35:19.946','00:35:33.422','120','Pass'),(13,'2','Programining in CPP','20','0','18-11-2020','13:58:12.407','13:58:18.785','120','Fail'),(14,'2','Programining in CPP','20','0','18-11-2020','13:58:26.136','13:58:29.082','120','Fail'),(15,'2','CPP','20','0','18-11-2020','13:58:32.329','13:58:33.669','120','Fail'),(16,'2','Programining in CPP','20',NULL,'18-11-2020','13:58:38.278',NULL,'120',NULL),(17,'3','JAVA','20','10','03-12-2020','11:13:21.683','11:13:50.119','120','Pass'),(18,'3','JAVA','20','20','06-12-2020','16:58:43.492','16:58:48.090','120','Pass');
/*!40000 ALTER TABLE `exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `question_id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(45) NOT NULL,
  `question` varchar(255) NOT NULL,
  `opt1` varchar(85) NOT NULL,
  `opt2` varchar(85) NOT NULL,
  `opt3` varchar(85) NOT NULL,
  `opt4` varchar(85) NOT NULL,
  `correct` varchar(85) NOT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'C++','Which of the following in OOP concept','Ecapsulation','Constructor','Inheritance','Polymorphism','Constructor'),(2,'C++','which of the following is not a header file in C++?','iostream','scanner','conio','string','scanner'),(3,'C++','Which is a type of inheritance in  C++?','Hybrid','Homogeneous','Hertogenous','None of the Above','Hybrid'),(4,'JAVA','Java is ____','Platform Independent','Portable','Secure','All of the Above','All of the Above'),(5,'JAVA','Latest version of JDK is___?','14','15','8','9','15'),(6,'DBMS','SQL is____','Structured Query Language','Structure Queued Langauge','Similar Query Language','Syntax Query Language','Structured Query Language'),(7,'C++','Which of the following is not an OOP concept in C++?','Inheritance','Constructors','Polymorphism','Encapsulation','Constructors'),(8,'OOPS','Which of the following is not an OOP concept?','Inheritance','Constructors','Polymorphism','Encapsulation','Constructors'),(9,'Programining in CPP','Which operator is used to get the size of the primitive data types?','instanceOf()','sizeOf()','sizeof()','size()','sizeof()');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `user_type` varchar(45) NOT NULL,
  `contact_no` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Surinder','Singh','SSingh','singh@gmail.com','123456','admin','123456789','Indore','Indore'),(2,'Nitin','N','NitinN','n@gmail.com','123456','student','123456789','Khandwa','Khandwa'),(3,'Nirmal','K','NK','nk@gmail.com','123456','student','764626','Indore','Indore');
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

-- Dump completed on 2020-12-06 17:34:06
