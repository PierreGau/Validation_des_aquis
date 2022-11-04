CREATE TABLE  if not exists etudiants(
id varchar(50) NOT NULL primary key,
nom varchar(50) NOT NULL,
moyenne	double,
photo varchar(255)		
);

INSERT INTO etudiants VALUES
('1','Etudiant1',15,'CSS/img1.png'),
('2','Etudiant2',7,'CSS/img2.png'),
('3','Etudiant3',13,'CSS/img3.png'),
('4','Etudiant4',11,'CSS/img4.png'),
('5','Etudiant5',9,'CSS/img5.png');


SELECT * FROM etudiants ORDER BY moyenne
