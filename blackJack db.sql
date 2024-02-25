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
DELETE FROM joueur WHERE id_Joueur = 1;
SELECT * FROM joueur;
ALTER TABLE Joueur
RENAME COLUMN usename TO username;
INSERT INTO Carte (type, valeur, valeurnom) VALUES
('pique', 11, 'as'),
('pique', 2, 'deux'),
('pique', 3, 'trois'),
('pique', 4, 'quatre'),
('pique', 5, 'cinq'),
('pique', 6, 'six'),
('pique', 7, 'sept'),
('pique', 8, 'huit'),
('pique', 9, 'neuf'),
('pique', 10, 'dix'),
('pique', 10, 'valet'),
('pique', 10, 'dame'),
('pique', 10, 'roi'),
('coeur', 11, 'as'),
('coeur', 2, 'deux'),
('coeur', 3, 'trois'),
('coeur', 4, 'quatre'),
('coeur', 5, 'cinq'),
('coeur', 6, 'six'),
('coeur', 7, 'sept'),
('coeur', 8, 'huit'),
('coeur', 9, 'neuf'),
('coeur', 10, 'dix'),
('coeur', 10, 'valet'),
('coeur', 10, 'dame'),
('coeur', 10, 'roi'),
('carreau', 11, 'as'),
('carreau', 2, 'deux'),
('carreau', 3, 'trois'),
('carreau', 4, 'quatre'),
('carreau', 5, 'cinq'),
('carreau', 6, 'six'),
('carreau', 7, 'sept'),
('carreau', 8, 'huit'),
('carreau', 9, 'neuf'),
('carreau', 10, 'dix'),
('carreau', 10, 'valet'),
('carreau', 10, 'dame'),
('carreau', 10, 'roi'),
('trefle', 11, 'as'),
('trefle', 2, 'deux'),
('trefle', 3, 'trois'),
('trefle', 4, 'quatre'),
('trefle', 5, 'cinq'),
('trefle', 6, 'six'),
('trefle', 7, 'sept'),
('trefle', 8, 'huit'),
('trefle', 9, 'neuf'),
('trefle', 10, 'dix'),
('trefle', 10, 'valet'),
('trefle', 10, 'dame'),
('trefle', 10, 'roi');
