-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3307
-- Tiempo de generación: 02-08-2021 a las 15:10:11
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mcgrawpeliculas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actor`
--

CREATE TABLE `actor` (
  `idActor` int(11) NOT NULL,
  `nombreActor` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `nacionalidadActor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `actor`
--

INSERT INTO `actor` (`idActor`, `nombreActor`, `nacionalidadActor`) VALUES
(1, 'Mark Hamill', 1),
(2, 'Harrison Ford', 1),
(3, 'Carrie Fisher', 1),
(4, 'Peter Cushing', 2),
(5, 'Alec Guiness', 2),
(6, 'Anthony Daniels', 2),
(7, 'Kenny Baker', 2),
(8, 'Peter Mayhew', 2),
(10, 'David Prowse', 2),
(11, 'Frank Oz', 2),
(12, 'Billy Dee Williams', 1),
(13, 'Sebastian Shaw', 2),
(14, 'Ian McDiarmid', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `director`
--

CREATE TABLE `director` (
  `idDirector` int(11) NOT NULL,
  `nombreDirector` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `edadDirector` tinyint(4) NOT NULL,
  `nacionalidadDirector` int(11) NOT NULL,
  `salarioDirector` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `director`
--

INSERT INTO `director` (`idDirector`, `nombreDirector`, `edadDirector`, `nacionalidadDirector`, `salarioDirector`) VALUES
(1, 'George Lucas', 0, 1, 0),
(2, 'Irving Kershner', 0, 1, 0),
(3, 'Richard Marquand', 0, 3, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE `genero` (
  `idGenero` int(11) NOT NULL,
  `nombreGenero` varchar(25) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`idGenero`, `nombreGenero`) VALUES
(1, 'Ciencia Ficción');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `interpretacion`
--

CREATE TABLE `interpretacion` (
  `idActor` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL,
  `personaje` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `salario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `interpretacion`
--

INSERT INTO `interpretacion` (`idActor`, `idPelicula`, `personaje`, `salario`) VALUES
(1, 2, 'Luke Skywalker', 50000),
(1, 3, 'Luke Skywalker', 100000),
(1, 4, 'Luke Skywalker', 100000),
(2, 2, 'Han Solo', 60000),
(2, 3, 'Han Solo', 100000),
(2, 4, 'Han Solo', 100000),
(3, 2, 'Princesa Leia', 55000),
(3, 3, 'Princesa Leia', 100000),
(3, 4, 'Princesa Leia', 100000),
(4, 2, 'Gobernador Tarkin', 80000),
(5, 2, 'Obi-Wan Kenobi', 90000),
(5, 3, 'Obi-Wan Kenobi', 100000),
(5, 4, 'Obi-Wan Kenobi', 100000),
(6, 2, 'C-3PO', 40000),
(6, 3, 'C-3PO', 40000),
(6, 4, 'C-3PO', 40000),
(7, 2, 'R2-D2', 40000),
(7, 3, 'R2-D2', 50000),
(7, 4, 'R2-D2', 60000),
(8, 2, 'Chewbacca', 35000),
(8, 3, 'Chewbacca', 60000),
(8, 4, 'Chewbacca', 50000),
(10, 2, 'Darth Vader', 54000),
(10, 3, 'Darth Vader', 80000),
(10, 4, 'Darth Vader', 100000),
(11, 3, 'Yoda', 35000),
(11, 4, 'Yoda', 80000),
(12, 3, 'Lando Calrissian', 70000),
(12, 4, 'Lando Calrissian', 80000),
(13, 4, 'Anakin Skywalker', 25000),
(14, 4, 'Emperador', 33000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `idPais` int(11) NOT NULL,
  `nombrePais` varchar(25) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`idPais`, `nombrePais`) VALUES
(1, 'Estados Unidos'),
(2, 'Inglaterra'),
(3, 'Gales'),
(4, 'Escocia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `idPelicula` int(11) NOT NULL,
  `tituloPelicula` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `directorPelicula` int(11) NOT NULL,
  `generoPelicula` int(11) NOT NULL,
  `anyoPelicula` int(11) NOT NULL,
  `duracionPelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`idPelicula`, `tituloPelicula`, `directorPelicula`, `generoPelicula`, `anyoPelicula`, `duracionPelicula`) VALUES
(2, 'Star Wars: Episodio IV - Una nueva esperanza', 1, 1, 1977, 121),
(3, 'Star Wars: Episodio V - El Imperio contraataca', 2, 1, 1980, 124),
(4, 'Star Wars: Episodio VI - El retorno del Jedi', 3, 1, 1983, 131),
(5, 'Star Wars: Episodio I - La amenaza fantasma', 1, 1, 1999, 136),
(6, 'Star Wars: Episodio II - El ataque de los clones', 1, 1, 2002, 142),
(7, 'Star Wars: Episodio III - La venganza de los Sith', 1, 1, 2005, 139);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actor`
--
ALTER TABLE `actor`
  ADD PRIMARY KEY (`idActor`),
  ADD KEY `nacionalidadActor` (`nacionalidadActor`);

--
-- Indices de la tabla `director`
--
ALTER TABLE `director`
  ADD PRIMARY KEY (`idDirector`),
  ADD KEY `nacionalidadDirector` (`nacionalidadDirector`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`idGenero`);

--
-- Indices de la tabla `interpretacion`
--
ALTER TABLE `interpretacion`
  ADD PRIMARY KEY (`idActor`,`idPelicula`),
  ADD KEY `idPelicula` (`idPelicula`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`idPais`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`idPelicula`),
  ADD KEY `directorPelicula` (`directorPelicula`),
  ADD KEY `generoPelicula` (`generoPelicula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actor`
--
ALTER TABLE `actor`
  MODIFY `idActor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `director`
--
ALTER TABLE `director`
  MODIFY `idDirector` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
  MODIFY `idGenero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `idPais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `idPelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actor`
--
ALTER TABLE `actor`
  ADD CONSTRAINT `actor_ibfk_1` FOREIGN KEY (`nacionalidadActor`) REFERENCES `pais` (`idPais`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `director`
--
ALTER TABLE `director`
  ADD CONSTRAINT `director_ibfk_1` FOREIGN KEY (`nacionalidadDirector`) REFERENCES `pais` (`idPais`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `interpretacion`
--
ALTER TABLE `interpretacion`
  ADD CONSTRAINT `interpretacion_ibfk_1` FOREIGN KEY (`idActor`) REFERENCES `actor` (`idActor`) ON UPDATE CASCADE,
  ADD CONSTRAINT `interpretacion_ibfk_2` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD CONSTRAINT `pelicula_ibfk_1` FOREIGN KEY (`directorPelicula`) REFERENCES `director` (`idDirector`) ON UPDATE CASCADE,
  ADD CONSTRAINT `pelicula_ibfk_2` FOREIGN KEY (`generoPelicula`) REFERENCES `genero` (`idGenero`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
