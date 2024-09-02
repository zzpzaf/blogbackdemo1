
/*
 Blog backend Test schema
 --------------------------
 schema.sql
 ----------------------------------------------------------------------------
 MariaDB/MySQL Tables and Data Objectsc for Jdbc default 
 Requires MariaDB version 10.2.1 or MySQL version 8.0.13 and aftrward. 
 (C)opyright Panos Zafeiropoulos - 2024


 ----------------------------------------------------------------------------
 Last update: 240902 - PZ
 -----------------------------------------------------------------------------
*/


USE `testblog2`;
@
--DELIMITER @

-- ------------------------------------
-- Table structure for testcategories
-- ------------------------------------
BEGIN;
@
DROP TABLE IF EXISTS `testcategories`;
@
CREATE TABLE `testcategories` (
  `categoryId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `categoryTitle` varchar(100) NOT NULL,
  PRIMARY KEY (`categoryId`)
);
@
COMMIT;
@



-- ----------------------------------
-- Table structure for testarticles
-- ----------------------------------
BEGIN;
@
DROP TABLE IF EXISTS `testarticles`;
@
CREATE TABLE `testarticles` (
  `articleId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `categoryId` int(10) unsigned NOT NULL,
  `articleTitle` varchar(100) NOT NULL,
  `articleSubTitle` varchar(100) NOT NULL,
  `articleContent` TEXT,
  PRIMARY KEY (`articleId`)
); 
@
COMMIT;
@







