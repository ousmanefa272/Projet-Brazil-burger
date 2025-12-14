CREATE DATABASE BRAZIL_BURGER_DB;
GO

USE DATABASE BRAZIL_BURGER_DB;
GO

CREATE TABLE Burger(
    id INT identity(1,1) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prix DECIMAL(10,2) NOT NULL,
    image VARCHAR(255)
);

CREATE TABLE Client (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prenom VARCHAR(100),
    telephone VARCHAR(20),
    email VARCHAR(150)
);

CREATE TABLE Commande (
    id INT IDENTITY(1,1) PRIMARY KEY,
    date_commande DATETIME DEFAULT GETDATE(),
    statut VARCHAR(50),
    client_id INT NOT NULL,

    FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Paiement (
    id INT IDENTITY(1,1) PRIMARY KEY,
    date_paiement DATETIME DEFAULT GETDATE(),
    montant DECIMAL(10,2) NOT NULL,
    mode_paiement VARCHAR(50),
    commande_id INT UNIQUE,

    FOREIGN KEY (commande_id) REFERENCES Commande(id)
);

CREATE TABLE Commande_Burger (
    commande_id INT NOT NULL,
    burger_id INT NOT NULL,
    quantite INT NOT NULL,

    PRIMARY KEY (commande_id, burger_id),
    FOREIGN KEY (commande_id) REFERENCES Commande(id),
    FOREIGN KEY (burger_id) REFERENCES Burger(id)
);

CREATE TABLE Menu (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    prix DECIMAL(10,2) NOT NULL,
    image VARCHAR(255)
);

CREATE TABLE Menu_Burger (
    menu_id INT NOT NULL,
    burger_id INT NOT NULL,

    PRIMARY KEY (menu_id, burger_id),
    FOREIGN KEY (menu_id) REFERENCES Menu(id),
    FOREIGN KEY (burger_id) REFERENCES Burger(id)
);












































