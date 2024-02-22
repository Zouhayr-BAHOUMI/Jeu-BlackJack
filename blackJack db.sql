create table Main (
    id_Main  SERIAL PRIMARY KEY,
	valeurTotal INT NOT NULL,
	nbCartes INT NOT NULL,
	id_joueur INT,
	id_croupier INT,
	FOREIGN KEY (id_joueur) REFERENCES Joueur(id_joueur),
    FOREIGN KEY (id_croupier) REFERENCES Croupier(id_croupier)
);

create table Carte (
	id_Carte  SERIAL PRIMARY KEY,
	type VARCHAR(55) NOT NULL,
	valeur INT NOT NULL,
	valeurnom  VARCHAR(55) NOT NULL
);

create table Croupier (
	id_Carte  SERIAL PRIMARY KEY,
	valeurTotallimit NOT NULL
);

create table Joueur (
	id_Joueur SERIAL PRIMARY KEY,
	usename VARCHAR(50),
	solde REAL NOT NULL
);

create table PaquetCarte(
	id_PaquetCarte SERIAL PRIMARY KEY,
	size INT NOT NULL
);