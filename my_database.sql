-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2020 at 02:01 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `my_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `evolution_list`
--

CREATE TABLE `evolution_list` (
  `EVOLUTION_ID` int(11) UNSIGNED NOT NULL,
  `EVOLUTION` varchar(50) NOT NULL,
  `EVOLUTION_LEVEL` int(11) NOT NULL,
  `POKEMON_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `evolution_list`
--

INSERT INTO `evolution_list` (`EVOLUTION_ID`, `EVOLUTION`, `EVOLUTION_LEVEL`, `POKEMON_ID`) VALUES
(1, 'ivysaur', 18, 1),
(2, 'venasaur', 32, 1),
(3, 'charmeleon', 16, 2);

-- --------------------------------------------------------

--
-- Table structure for table `my_pokemons`
--

CREATE TABLE `my_pokemons` (
  `MY_POKEMON_NO` int(11) UNSIGNED NOT NULL,
  `MY_POKEMON` varchar(50) NOT NULL,
  `SPECIE` varchar(50) NOT NULL,
  `LEVEL` int(11) NOT NULL,
  `POKEMON_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `my_pokemons`
--

INSERT INTO `my_pokemons` (`MY_POKEMON_NO`, `MY_POKEMON`, `SPECIE`, `LEVEL`, `POKEMON_ID`) VALUES
(1, 'venasaur', 'mingming', 100, 1);

-- --------------------------------------------------------

--
-- Table structure for table `pokemon_list`
--

CREATE TABLE `pokemon_list` (
  `POKEMON_ID` int(11) UNSIGNED NOT NULL,
  `POKEMON` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pokemon_list`
--

INSERT INTO `pokemon_list` (`POKEMON_ID`, `POKEMON`) VALUES
(1, 'bulbasaur'),
(2, 'charmander');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `evolution_list`
--
ALTER TABLE `evolution_list`
  ADD PRIMARY KEY (`EVOLUTION_ID`);

--
-- Indexes for table `my_pokemons`
--
ALTER TABLE `my_pokemons`
  ADD PRIMARY KEY (`MY_POKEMON_NO`);

--
-- Indexes for table `pokemon_list`
--
ALTER TABLE `pokemon_list`
  ADD PRIMARY KEY (`POKEMON_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
