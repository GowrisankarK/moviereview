-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 11, 2020 at 03:30 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moviereview`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(25),
(25);

-- --------------------------------------------------------

--
-- Table structure for table `moviedetails`
--

CREATE TABLE `moviedetails` (
  `id` bigint(20) NOT NULL,
  `movie_name` varchar(1000) NOT NULL,
  `movie_synopsis` varchar(10000) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moviedetails`
--

INSERT INTO `moviedetails` (`id`, `movie_name`, `movie_synopsis`, `user_name`) VALUES
(2, 'matran', '2012 movie', 'admin'),
(4, 'mudhalvan', 'xxxx', NULL),
(5, 'aniyan', '2008 released', NULL),
(11, 'mariyan', '2018 movie', NULL),
(20, 'davinci code', 'released in 2017', NULL),
(22, 'Avengers', 'Super hero movie', NULL),
(24, 'EndGame', 'Demo', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `reviewdetails`
--

CREATE TABLE `reviewdetails` (
  `id` bigint(20) NOT NULL,
  `movie_id` bigint(20) NOT NULL,
  `movie_review` varchar(10000) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reviewdetails`
--

INSERT INTO `reviewdetails` (`id`, `movie_id`, `movie_review`, `user_name`) VALUES
(1, 1, 'check1', 'user1'),
(3, 2, 'sample revie', 'user1'),
(6, 1, 'demo', 'xxx'),
(7, 1, 'xyz', NULL),
(8, 1, 'demon', NULL),
(9, 1, 'hello', 'demoUser'),
(10, 5, 'xx', 'demoUser'),
(12, 11, 'very goood', 'demoUser'),
(13, 11, 'very good movie', 'gowri'),
(14, 4, 'very good movie', 'gowri'),
(15, 2, '5 star', 'gowri'),
(16, 2, 'very good movie', 'sankar'),
(17, 4, 'wonderful movie', 'sankar'),
(18, 5, 'worst movie I have ever seen', 'sankar'),
(19, 11, 'ar rahman music was good', 'sankar'),
(21, 2, 'nice movie', 'sudarsan'),
(23, 22, 'haha', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `moviedetails`
--
ALTER TABLE `moviedetails`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reviewdetails`
--
ALTER TABLE `reviewdetails`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
