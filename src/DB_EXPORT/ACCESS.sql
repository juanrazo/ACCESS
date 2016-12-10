-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 10, 2016 at 12:01 AM
-- Server version: 5.7.16-0ubuntu0.16.04.1
-- PHP Version: 7.0.8-0ubuntu0.16.04.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ACCESS`
--

-- --------------------------------------------------------

--
-- Table structure for table `Activity`
--

CREATE TABLE `Activity` (
  `AID` int(11) NOT NULL,
  `Title` varchar(2000) NOT NULL,
  `Description` varchar(2000) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `Classification` varchar(2000) NOT NULL,
  `Semester` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Activity`
--

INSERT INTO `Activity` (`AID`, `Title`, `Description`, `StartDate`, `EndDate`, `Classification`, `Semester`) VALUES
(1, 'Linux Workshop', 'Teaching students why sudo rm -rf / is bad', '2016-12-09', '2016-12-10', 'All', 'Fall 2016');

-- --------------------------------------------------------

--
-- Table structure for table `FundedProjectCoPI`
--

CREATE TABLE `FundedProjectCoPI` (
  `PID` int(11) DEFAULT NULL,
  `ORSPID` int(11) DEFAULT NULL,
  `CoPIName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `FundedProjectPI`
--

CREATE TABLE `FundedProjectPI` (
  `PID` int(11) DEFAULT NULL,
  `ORSPID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Initiative`
--

CREATE TABLE `Initiative` (
  `IID` int(11) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `Category` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `Purpose` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Initiative`
--

INSERT INTO `Initiative` (`IID`, `Title`, `Category`, `Description`, `StartDate`, `EndDate`, `Purpose`) VALUES
(1, 'First Initiative', 'Category 1', 'This is a test, creating an Initiative to associate with Project', '2016-12-01', '2017-02-16', 'To test an initiative'),
(2, 'Initiative 2', 'Category 2', 'Second initiative:::::: ::::::::::::::', '2016-12-03', '2017-05-31', 'Purpose of initiative'),
(3, 'Third Initiative', 'Category 3', 'Description of Initiative :::::::::::::', '2016-12-01', '2016-12-25', 'Initiative Purpose'),
(4, 'semper', 'Lorem ipsum dolor sit amet, consectetuer adipiscing', 'nibh', '2016-04-08', '2017-09-23', 'metus. In nec orci. Donec nibh.'),
(5, 'urna. Vivamus molestie dapibus ligula.', 'Lorem ipsum dolor sit amet, consectetuer', 'Nulla facilisis. Suspendisse commodo tincidunt nibh. Phasellus nulla.', '2016-10-17', '2016-10-22', 'mauris'),
(6, 'ligula. Aliquam erat volutpat. Nulla dignissim. Maecenas ornare egestas ligula.', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Curabitur', 'Nunc pulvinar arcu', '2017-05-18', '2017-03-17', 'ante. Nunc'),
(7, 'libero dui', 'Lorem ipsum dolor', 'tincidunt pede ac urna.', '2016-08-05', '2017-10-27', 'non, bibendum'),
(8, 'Fusce mi lorem, vehicula et, rutrum eu,', 'Lorem ipsum dolor sit', 'Lorem', '2017-02-17', '2017-05-05', 'et ultrices'),
(9, 'augue ut lacus. Nulla tincidunt,', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Curabitur sed', 'eu, euismod ac, fermentum vel, mauris.', '2017-10-01', '2016-11-03', 'dictum ultricies ligula. Nullam enim. Sed nulla ante, iaculis nec,'),
(10, 'fermentum vel, mauris. Integer sem elit, pharetra ut,', 'Lorem ipsum dolor sit amet, consectetuer adipiscing', 'quis massa. Mauris vestibulum, neque sed', '2017-07-25', '2017-03-30', 'aliquam eros turpis non'),
(11, 'sagittis. Nullam vitae diam. Proin dolor. Nulla semper tellus', 'Lorem ipsum dolor sit amet, consectetuer', 'egestas ligula. Nullam feugiat', '2016-04-02', '2015-12-06', 'Suspendisse commodo tincidunt nibh. Phasellus nulla. Integer vulputate,'),
(12, 'nec, diam. Duis mi enim, condimentum', 'Lorem ipsum dolor sit amet, consectetuer', 'ac mattis ornare, lectus ante dictum mi, ac mattis', '2016-08-12', '2016-02-09', 'Nullam enim. Sed nulla ante, iaculis'),
(13, 'Phasellus fermentum convallis ligula. Donec', 'Lorem ipsum dolor sit amet, consectetuer adipiscing', 'nunc sed pede. Cum sociis natoque', '2016-09-29', '2016-07-13', 'ipsum.');

-- --------------------------------------------------------

--
-- Table structure for table `InitiativeAssociatedActivity`
--

CREATE TABLE `InitiativeAssociatedActivity` (
  `IID` int(11) NOT NULL,
  `AID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `InitiativeAssociatedActivity`
--

INSERT INTO `InitiativeAssociatedActivity` (`IID`, `AID`) VALUES
(12, 1);

-- --------------------------------------------------------

--
-- Table structure for table `NonFundedProjectMembership`
--

CREATE TABLE `NonFundedProjectMembership` (
  `PID` int(11) DEFAULT NULL,
  `UID` int(11) NOT NULL,
  `FName` varchar(250) NOT NULL,
  `LName` varchar(250) NOT NULL,
  `Email` varchar(2000) NOT NULL,
  `Role` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `NonFundedProjectMembership`
--

INSERT INTO `NonFundedProjectMembership` (`PID`, `UID`, `FName`, `LName`, `Email`, `Role`) VALUES
(1, 1, 'JUAN', 'Razo', 'jr@intellij.net', 'Owner'),
(9, 2, 'Peter', 'Estrada', 'pej@eclipse.net', 'Owner'),
(10, 1, 'JUAN', 'Razo', 'jr@intellij.net', 'Owner'),
(5, 1, 'JUAN', 'Razo', 'jr@intellij.net', 'Manager'),
(3, 1, 'JUAN', 'Razo', 'jr@intellij.net', 'Manager');

-- --------------------------------------------------------

--
-- Table structure for table `Project`
--

CREATE TABLE `Project` (
  `PID` int(11) NOT NULL,
  `ORSPID` int(11) DEFAULT NULL,
  `FundedProject` tinyint(1) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `Description` varchar(2000) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `Goal` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Project`
--

INSERT INTO `Project` (`PID`, `ORSPID`, `FundedProject`, `Title`, `Description`, `StartDate`, `EndDate`, `Goal`) VALUES
(1, NULL, 0, 'ACCESS is Awesome', 'Intruiging students into research', '2014-10-02', '2020-12-12', 'Measure student research involvement'),
(2, NULL, 0, 'Student Success in Geography', 'Survey student success in Geography field', '2014-10-02', '2020-12-12', 'Measure student demographics'),
(3, NULL, 0, 'Graduate retention rates in Liberal Arts', 'Research focused on graduate retention rates in underwater basket weaving', '2001-09-01', '2026-10-01', 'Increase retention rates of basket weavers'),
(4, NULL, 0, 'This is a test', 'Juan said we dont need the colons', '2016-12-06', '2017-05-04', 'Test the insertion'),
(5, NULL, 0, 'Pyle early learning capabilities', 'This project is intended to teach students about audio applications in Computer Science', '2014-12-07', '2019-12-07', 'Create new and exciting opportunities in audio and computer science applications. '),
(6, NULL, 0, 'Cross communication into interdisciplinary courses', 'This project is intended to teach students about policy for interdisciplinary studies', '2014-12-09', '2019-12-06', 'Create new and exciting opportunities in policy writing. '),
(7, NULL, 0, 'Cross communication into interdisciplinary courses', 'This project is intended to teach students about policy for interdisciplinary studies', '2014-12-09', '2019-12-06', 'Create new and exciting opportunities in policy writing. '),
(8, NULL, 0, 'Cross communication into interdisciplinary courses', 'This project is intended to teach students about policy for interdisciplinary studies', '2014-12-09', '2019-12-06', 'Create new and exciting opportunities in policy writing. '),
(9, NULL, 0, 'Same old two step', 'Teaching new tricks to old people on a daily basis to determine retention rates. ', '2010-10-12', '2020-11-11', 'Teach old dogs how to do new tricks'),
(10, NULL, 0, 'GIT', 'asdfasdf', '2016-12-22', '2016-12-15', 'asdfasdfasdf');

-- --------------------------------------------------------

--
-- Table structure for table `ProjectAssociatedInitiative`
--

CREATE TABLE `ProjectAssociatedInitiative` (
  `PID` int(11) DEFAULT NULL,
  `IID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ProjectAssociatedInitiative`
--

INSERT INTO `ProjectAssociatedInitiative` (`PID`, `IID`) VALUES
(2, 1),
(3, 2),
(1, 1),
(1, 8),
(2, 7),
(3, 5),
(2, 13),
(1, 6),
(2, 10),
(3, 13);

-- --------------------------------------------------------

--
-- Table structure for table `ProjectDocument`
--

CREATE TABLE `ProjectDocument` (
  `PID` int(11) DEFAULT NULL,
  `DOC_TYPE` varchar(255) NOT NULL,
  `DOC_PATH` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ProjectKeywordTable`
--

CREATE TABLE `ProjectKeywordTable` (
  `PID` int(11) DEFAULT NULL,
  `Keyword` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ProjectKeywordTable`
--

INSERT INTO `ProjectKeywordTable` (`PID`, `Keyword`) VALUES
(9, 'Awesome'),
(9, 'Work Hard'),
(9, 'www.cnn.com/test.html'),
(9, 'www.yahoo.com/index.html'),
(9, 'www.yahoo.com/index.html'),
(9, 'www.yahoo.com/index.html');

-- --------------------------------------------------------

--
-- Table structure for table `ProjectObjectiveTable`
--

CREATE TABLE `ProjectObjectiveTable` (
  `PID` int(11) DEFAULT NULL,
  `Objective` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ProjectWebsite`
--

CREATE TABLE `ProjectWebsite` (
  `PID` int(11) DEFAULT NULL,
  `W_URL` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Activity`
--
ALTER TABLE `Activity`
  ADD PRIMARY KEY (`AID`);

--
-- Indexes for table `FundedProjectCoPI`
--
ALTER TABLE `FundedProjectCoPI`
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `FundedProjectPI`
--
ALTER TABLE `FundedProjectPI`
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `Initiative`
--
ALTER TABLE `Initiative`
  ADD PRIMARY KEY (`IID`),
  ADD UNIQUE KEY `IID` (`IID`);

--
-- Indexes for table `InitiativeAssociatedActivity`
--
ALTER TABLE `InitiativeAssociatedActivity`
  ADD KEY `IID` (`IID`),
  ADD KEY `AID` (`AID`);

--
-- Indexes for table `NonFundedProjectMembership`
--
ALTER TABLE `NonFundedProjectMembership`
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `Project`
--
ALTER TABLE `Project`
  ADD PRIMARY KEY (`PID`),
  ADD UNIQUE KEY `PID` (`PID`);
ALTER TABLE `Project` ADD FULLTEXT KEY `Title` (`Title`,`Description`,`Goal`);

--
-- Indexes for table `ProjectAssociatedInitiative`
--
ALTER TABLE `ProjectAssociatedInitiative`
  ADD KEY `PID` (`PID`),
  ADD KEY `IID` (`IID`);

--
-- Indexes for table `ProjectDocument`
--
ALTER TABLE `ProjectDocument`
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `ProjectKeywordTable`
--
ALTER TABLE `ProjectKeywordTable`
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `ProjectObjectiveTable`
--
ALTER TABLE `ProjectObjectiveTable`
  ADD UNIQUE KEY `Objective` (`Objective`),
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `ProjectWebsite`
--
ALTER TABLE `ProjectWebsite`
  ADD KEY `PID` (`PID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Activity`
--
ALTER TABLE `Activity`
  MODIFY `AID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `Initiative`
--
ALTER TABLE `Initiative`
  MODIFY `IID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `Project`
--
ALTER TABLE `Project`
  MODIFY `PID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `FundedProjectCoPI`
--
ALTER TABLE `FundedProjectCoPI`
  ADD CONSTRAINT `FundedProjectCoPI_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

--
-- Constraints for table `FundedProjectPI`
--
ALTER TABLE `FundedProjectPI`
  ADD CONSTRAINT `FundedProjectPI_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

--
-- Constraints for table `InitiativeAssociatedActivity`
--
ALTER TABLE `InitiativeAssociatedActivity`
  ADD CONSTRAINT `InitiativeAssociatedActivity_ibfk_1` FOREIGN KEY (`IID`) REFERENCES `Initiative` (`IID`),
  ADD CONSTRAINT `InitiativeAssociatedActivity_ibfk_2` FOREIGN KEY (`AID`) REFERENCES `Activity` (`AID`);

--
-- Constraints for table `NonFundedProjectMembership`
--
ALTER TABLE `NonFundedProjectMembership`
  ADD CONSTRAINT `NonFundedProjectMembership_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

--
-- Constraints for table `ProjectAssociatedInitiative`
--
ALTER TABLE `ProjectAssociatedInitiative`
  ADD CONSTRAINT `ProjectAssociatedInitiative_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`),
  ADD CONSTRAINT `ProjectAssociatedInitiative_ibfk_2` FOREIGN KEY (`IID`) REFERENCES `Initiative` (`IID`);

--
-- Constraints for table `ProjectDocument`
--
ALTER TABLE `ProjectDocument`
  ADD CONSTRAINT `ProjectDocument_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

--
-- Constraints for table `ProjectKeywordTable`
--
ALTER TABLE `ProjectKeywordTable`
  ADD CONSTRAINT `ProjectKeywordTable_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

--
-- Constraints for table `ProjectObjectiveTable`
--
ALTER TABLE `ProjectObjectiveTable`
  ADD CONSTRAINT `ProjectObjectiveTable_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

--
-- Constraints for table `ProjectWebsite`
--
ALTER TABLE `ProjectWebsite`
  ADD CONSTRAINT `ProjectWebsite_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `Project` (`PID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
