-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : Dim 16 jan. 2022 à 16:51
-- Version du serveur :  10.4.17-MariaDB
-- Version de PHP : 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `location`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` int(20) NOT NULL,
  `nom` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenom` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nss` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adresse` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tel` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `permis` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `etat` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `nom`, `prenom`, `nss`, `adresse`, `tel`, `permis`, `etat`) VALUES
(1, 'nizar', 'ayadi', '123456', '15789', 'mourouj', '25897654', 'servis'),
(5, 'salma', 'yk', '78965421', '87887878', 'mourouj', '25897654', 'reserve');

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE `facture` (
  `id` int(11) NOT NULL,
  `nom` varchar(64) DEFAULT NULL,
  `prenom` varchar(64) DEFAULT NULL,
  `nss` varchar(64) DEFAULT NULL,
  `adresse` varchar(64) DEFAULT NULL,
  `tel` varchar(64) DEFAULT NULL,
  `permis` varchar(64) DEFAULT NULL,
  `etat` varchar(64) DEFAULT NULL,
  `marque` varchar(64) DEFAULT NULL,
  `modele` varchar(64) DEFAULT NULL,
  `numero_meneralogique` varchar(64) DEFAULT NULL,
  `kilometrage` varchar(64) DEFAULT NULL,
  `prix` varchar(64) DEFAULT NULL,
  `statut` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `facture`
--

INSERT INTO `facture` (`id`, `nom`, `prenom`, `nss`, `adresse`, `tel`, `permis`, `etat`, `marque`, `modele`, `numero_meneralogique`, `kilometrage`, `prix`, `statut`) VALUES
(1, 'nizar', 'ayadi', '123456', '15789', 'mourouj', '25897654', 'servis', 'bmw', '2015', '152 tunis 2017', '10020', '250', 'sortie'),
(5, 'salma', 'yk', '78965421', '87887878', 'mourouj', '25897654', 'reserve', 'volkswagen', 'polo', '125 tn 789', '78956', '65', 'attente');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

CREATE TABLE `utilisateurs` (
  `id` int(11) NOT NULL,
  `log` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `passe` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ip` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `statut` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`id`, `log`, `passe`, `ip`, `statut`) VALUES
(1, 'nizar', '', '12121212', 'jjkjkk');

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

CREATE TABLE `vehicule` (
  `id` int(11) NOT NULL,
  `marque` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `modele` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numero_meneralogique` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kilometrage` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prix` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `statut` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `vehicule`
--

INSERT INTO `vehicule` (`id`, `marque`, `modele`, `numero_meneralogique`, `kilometrage`, `prix`, `statut`) VALUES
(1, 'bmw', '2015', '152 tunis 2017', '10020', '250', 'sortie'),
(2, 'volkswagen', 'polo', '125 tn 789', '78956', '65', 'reserve'),
(3, 'Kia', 'Ceratto', '152 tn 897', '45620', '90', 'disponible');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD UNIQUE KEY `id` (`id`);

--
-- Index pour la table `facture`
--
ALTER TABLE `facture`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `facture`
--
ALTER TABLE `facture`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `vehicule`
--
ALTER TABLE `vehicule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
