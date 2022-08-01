-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220729.9c9ae5069e
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2022 at 06:03 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `algodomaintask_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer_registration`
--

CREATE TABLE `customer_registration` (
  `cid` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_no` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_registration`
--

INSERT INTO `customer_registration` (`cid`, `address`, `contact_no`, `email`, `gender`, `name`, `password`, `user_name`) VALUES
(1, 'Pune', 7896543201, 'shubham@gmail.com', 'Male', 'Shubham', 'shuhbam123', 'shubham123'),
(2, 'Pune', 9878654552, 'sourabh@gmail.com', 'Male', 'Squrabh', 'saurabh321', 'saurabh321'),
(3, 'Pune', 9854763210, 'aditya@gmail.com', 'Male', 'Aditya', 'aditya321', 'aditya321');

-- --------------------------------------------------------

--
-- Table structure for table `product_details`
--

CREATE TABLE `product_details` (
  `pid` int(11) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `is_active` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_details`
--

INSERT INTO `product_details` (`pid`, `category`, `name`, `price`, `type`, `id`, `is_active`) VALUES
(1, 'Clothing', 'Zara', 1500, 'Shirt', 2, 'Y'),
(2, 'Electronics', 'Realme 3 Pro', 14000, 'Mobile', 1, 'Y'),
(3, 'Clothing', 'Raymond', 2000, 'Shirt', 2, 'Y'),
(4, 'Clothing', 'Nike', 3500, 'Jacket', 2, 'Y'),
(5, 'Footware', 'Bata', 1500, 'Loafers', 3, 'Y'),
(6, 'Footware', 'Sparx', 1800, 'Sneakers', 3, 'Y'),
(7, 'Footware', 'Nike', 5000, 'Sports', 3, 'Y'),
(8, 'Electronics', 'Lenovo T14', 98000, 'Laptop', 1, 'Y'),
(9, 'Electronics', 'Acer E15', 58000, 'Laptop', 1, 'Y'),
(10, 'Clothing', 'Petter England', 5000, 'Shirt', 2, 'Y'),
(11, 'Electronics', 'Oppo Reno 8', 40000, 'Mobile', 1, 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `seller_registration`
--

CREATE TABLE `seller_registration` (
  `sid` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_no` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller_registration`
--

INSERT INTO `seller_registration` (`sid`, `address`, `contact_no`, `email`, `gender`, `name`, `password`, `user_name`) VALUES
(1, 'Pune', 9865741230, 'pranay@gmail.com', 'Male', 'Pranay', 'pranay123', 'pranay123'),
(2, 'Pune', 8795463201, 'omkar@gmail.com', 'Male', 'Omkar', 'omkar456', 'omkar456'),
(3, 'Pune', 7889654410, 'akash@gmail.com', 'Male', 'Akash', 'akash456', 'akash456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_registration`
--
ALTER TABLE `customer_registration`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `product_details`
--
ALTER TABLE `product_details`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `FKqnwhe0o085mr3d2ro4vjbkr7o` (`id`);

--
-- Indexes for table `seller_registration`
--
ALTER TABLE `seller_registration`
  ADD PRIMARY KEY (`sid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer_registration`
--
ALTER TABLE `customer_registration`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `product_details`
--
ALTER TABLE `product_details`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `seller_registration`
--
ALTER TABLE `seller_registration`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product_details`
--
ALTER TABLE `product_details`
  ADD CONSTRAINT `FKqnwhe0o085mr3d2ro4vjbkr7o` FOREIGN KEY (`id`) REFERENCES `seller_registration` (`sid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
