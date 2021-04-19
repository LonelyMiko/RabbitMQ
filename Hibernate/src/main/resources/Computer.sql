create database hibernate;
use hibernate;
CREATE TABLE `user` (
        id INT NOT NULL AUTO_INCREMENT,
        USERNAME VARCHAR(30) NOT NULL,
        PASS VARCHAR(30),
        PRIMARY KEY (ID)
);

CREATE TABLE `computer` (
        ID_COMPUTER INT NOT NULL AUTO_INCREMENT,
        SERIE_COMPUTER INT NOT NULL,
        DESCRIPTION VARCHAR(30) NOT NULL,
        ASSEMBLY_DATE DATE NOT NULL,
        PRIMARY KEY (ID_COMPUTER)
);


CREATE TABLE `detail_parts` (
        ID_PIECE_DETAIL INT NOT NULL AUTO_INCREMENT,
        ID_PIECE INT NOT NULL,
        ID_COMPUTER INT NOT NULL,
        PIECE VARCHAR(30) NOT NULL,
        COST INT NOT NULL,
        PRIMARY KEY (ID_PIECE_DETAIL),
                
        CONSTRAINT FK_PIECE FOREIGN KEY (ID_PIECE)
		REFERENCES PIECES(ID_PIECE),
        
        CONSTRAINT FK_COMPUTER FOREIGN KEY (ID_COMPUTER)
		REFERENCES COMPUTER(ID_COMPUTER)
);



CREATE TABLE `pieces` (
        ID_PIECE INT NOT NULL AUTO_INCREMENT,
        SERIE INT NOT NULL,
        PIECES_NAME VARCHAR(30) NOT NULL,
        CHARACTERISTIC VARCHAR(30) NOT NULL,
        
        PRIMARY KEY (ID_PIECE)
);

DROP TABLE `detail_parts`;
DROP TABLE `pieces`;

INSERT INTO user VALUES
(0,'admin','pass');

INSERT INTO pieces (SERIE, PIECES_NAME, CHARACTERISTIC) VALUES
(0,'MSI Motherboard','Motherboard'),
(1,'Intel Core i7-11700K','Processors'),
(2,'Intel Core i5-11400','Processors'),
(3,'Intel Core i9-10900K','Processors'),

(4,'AMD RYZEN 7 3700X','Processors'),
(5,'AMD Ryzen 9 3950X','Processors'),
(6,'AMD RYZEN 5 2600','Processors'),

(7,'ASUS Radeon RX 6700 XT','Video Cards & Video Devices'),
(8,'Sapphire AMD Radeon RX 6700','Video Cards & Video Devices'),
(9,'XFX Radeon RX 6700 XT','Video Cards & Video Devices'),

(10,'Fractal Design Meshify C White','Computer Cases'),
(11,'Cooler Master MasterCase H500','Computer Cases'),
(12,'Rosewill ATX Mid Tower Gaming','Computer Cases'),

(13,'CORSAIR RMx Series RM750x','Power Supplies'),
(14,'EVGA 110-BQ-0500-K1 500','Power Supplies'),
(15,'EVGA 600 BQ 110-BQ-0600-K1','Power Supplies'),

(16,'G.SKILL Ripjaws V Series 32GB','Memory'),
(17,'Crucial Ballistix 3000 MHz','Memory'),
(18,'CORSAIR Vengeance LPX 16GB','Memory'),

(19,'WD Gold 18TB Enterprise Class','Hard Drives'),
(20,'Seagate BarraCuda ST2000DM008','Hard Drives'),
(21,'WD Black 6TB','Hard Drives'),

(22,'ASUS DRW-24B1ST/BLK/B/AS SATA','CD / DVD'),
(23,'LG Black Blu-ray Burner SATA','CD / DVD'),
(24,'ASUS Black SATA DVD-ROM','CD / DVD'),

(25,'Cooler Master Hyper 212 Evo','Fans & PC Cooling'),
(26,'CoolerMaster MasterLiquid','Fans & PC Cooling'),
(27,'Corsair Hydro Series','Fans & PC Cooling');

INSERT INTO detail_parts(ID_PIECE, ID_COMPUTER, PIECE, COST) VALUES

(141, 1, "MSI Motherboard",50),
(142, 1, 'Intel Core i7-11700K', 150),
(143, 1, 'Intel Core i5-11400', 150),
(144, 1, 'Intel Core i9-10900K', 250),
(145, 1, 'AMD RYZEN 7 3700X', 150),
(146, 1, 'AMD Ryzen 9 3950X', 223),
(147, 1, 'AMD RYZEN 5 2600', 137),
(148, 1, 'ASUS Radeon RX 6700 XT', 512),
(149, 1, 'Sapphire AMD Radeon RX 6700', 156),
(150, 1, 'XFX Radeon RX 6700 XT', 132),
(151, 1, 'Fractal Design Meshify C White', 142),
(152, 1, 'Cooler Master MasterCase H500', 156),
(153, 1, 'Rosewill ATX Mid Tower Gaming', 75),
(154, 1, 'CORSAIR RMx Series RM750x', 253),
(155, 1, 'EVGA 110-BQ-0500-K1 500', 149),
(156, 1, 'EVGA 600 BQ 110-BQ-0600-K1', 231),
(157, 1, 'G.SKILL Ripjaws V Series 32GB', 123),
(158, 1, 'Crucial Ballistix 3000 MHz', 135),
(159, 1, 'CORSAIR Vengeance LPX 16GB', 128),
(160, 1, 'WD Gold 18TB Enterprise Class', 430),
(161, 1, 'Seagate BarraCuda ST2000DM008', 560),
(162, 1, 'WD Black 6TB', 1330),
(163, 1, 'ASUS DRW-24B1ST/BLK/B/AS SATA', 270),
(164, 1, 'LG Black Blu-ray Burner SATA', 330),
(165, 1, 'ASUS Black SATA DVD-ROM', 145),
(166, 1, 'Cooler Master Hyper 212 Evo', 45),
(167, 1, 'CoolerMaster MasterLiquid', 72),
(168, 1, 'Corsair Hydro Series', 39);


SELECT * FROM user WHERE username = 'admin' AND pass = 'pass';
SELECT * FROM computer;
SELECT * FROM pieces;
