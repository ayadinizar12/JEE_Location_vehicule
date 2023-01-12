
CREATE TABLE client
(
  id serial NOT NULL,
  nom character varying(64),
  prenom character varying(64),
  nss character varying(64),
  adresse character varying(64),
  tel character varying(64),
  permis character varying(64),
  etat character varying(64)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;




CREATE TABLE facture
(
  id integer NOT NULL ,
  nom character varying(64),
  prenom character varying(64),
  nss character varying(64),
  adresse character varying(64),
  tel character varying(64),
  permis character varying(64),
  etat character varying(64),
  marque character varying(64),
  modele character varying(64),
  numero_meneralogique character varying(64),
  kilometrage character varying(64),
  prix character varying(64),
  statut character varying
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;





CREATE TABLE utilisateurs
(
  id integer NOT NULL ,
  log character varying(64),
  passe character varying(64),
  ip character varying(64),
  statut character varying(64)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;





CREATE TABLE vehicule
(
  id integer NOT NULL ,
  marque character varying(64),
  modele character varying(64),
  numero_meneralogique character varying(64),
  kilometrage character varying(64),
  prix character varying(64),
  statut character varying
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


