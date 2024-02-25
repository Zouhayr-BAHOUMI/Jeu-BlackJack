create table Main (
    id_Main  SERIAL PRIMARY KEY,
	valeurTotal INT NOT NULL,
	nbCartes INT NOT NULL,
	id_Joueur INT,
	id_Croupier INT,
	id_Carte INT,
	FOREIGN KEY (id_Carte) REFERENCES Carte(id_Carte),
	FOREIGN KEY (id_Joueur) REFERENCES Joueur(id_Joueur),
    FOREIGN KEY (id_Croupier) REFERENCES Croupier(id_Croupier)
);

create table Carte (
	id_Carte  SERIAL PRIMARY KEY,
	type VARCHAR(55) NOT NULL,
	valeur INT NOT NULL,
	valeurnom  VARCHAR(55) NOT NULL
);

create table Croupier (
	id_Croupier  SERIAL PRIMARY KEY,
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
