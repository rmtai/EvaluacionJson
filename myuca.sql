-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-03-2023 a las 09:17:02
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `myuca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coordinador`
--

CREATE TABLE `coordinador` (
  `idC` int(11) NOT NULL,
  `nombres` varchar(30) CHARACTER SET utf8mb4 NOT NULL,
  `apeliidos` varchar(30) CHARACTER SET utf8mb4 NOT NULL,
  `fechaNac` date NOT NULL,
  `titulo` varchar(50) CHARACTER SET utf8mb4 NOT NULL,
  `email` varchar(30) CHARACTER SET utf8mb4 NOT NULL,
  `facultad` varchar(50) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `coordinador`
--

INSERT INTO `coordinador` (`idC`, `nombres`, `apeliidos`, `fechaNac`, `titulo`, `email`, `facultad`) VALUES
(1, 'Fernando', 'Ortiz', '2004-07-26', 'Inge', 'cualquiera@gmail.com', 'L'),
(2, 'Zair', 'Zeledon', '1950-07-26', 'Inge', 'cualquiera@gmail.com', 'L'),
(3, 'Primer', 'Segundo', '1950-07-26', 'Inge', 'cualquiera@gmail.com', 'L'),
(4, 'Last', 'Jedi', '2003-07-26', 'Inge', 'cualquiera@gmail.com', 'L'),
(5, 'Fernando', 'Asd', '0000-00-00', 'Inge', 'cualquiera@gmail.com', 'L');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `coordinador`
--
ALTER TABLE `coordinador`
  ADD PRIMARY KEY (`idC`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `coordinador`
--
ALTER TABLE `coordinador`
  MODIFY `idC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
