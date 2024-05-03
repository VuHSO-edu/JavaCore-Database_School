DROP DATABASE IF EXISTS lab10;
CREATE DATABASE lab10;
USE lab10;

CREATE TABLE NHANVIEN (
	MANV VARCHAR(15) NOT NULL PRIMARY KEY,
	HONV VARCHAR(15) ,
    TENLOT VARCHAR(15) ,
    TENNV VARCHAR(15) ,
    NGSINH DATE ,
    DCHI VARCHAR(30),
    PHAI ENUM ("NAM", "NU") NOT NULL,
    LUONG DECIMAL(10,2) ,
    MA_NQL VARCHAR(30) DEFAULT NULL,
    PHG INT DEFAULT NULL
    );
    
CREATE TABLE PHONGBAN (
	TENPHG VARCHAR(15),
    MAPHG INT PRIMARY KEY,
    TRPHG VARCHAR(15),
    NG_NHANCHUC DATE,
    FOREIGN KEY (TRPHG) REFERENCES NHANVIEN (MANV)
);

CREATE TABLE DIADIEM_PHG (
	MAPHG INT ,
    DIADIEM VARCHAR(15),
    PRIMARY KEY (MAPHG, DIADIEM),
    FOREIGN KEY (MAPHG) REFERENCES PHONGBAN (MAPHG)
);

CREATE TABLE DEAN (
	TENDA VARCHAR(15),
    MADA INT PRIMARY KEY,
    DDIEM_DA VARCHAR(15),
    PHONG INT,
    FOREIGN KEY (PHONG) REFERENCES PHONGBAN (MAPHG)
);

CREATE TABLE CONGVIEC (
	MADA INT ,
    STT INT,
    TEN_CONG_VIEC VARCHAR(50),
    PRIMARY KEY (MADA, STT),
	FOREIGN KEY (MADA) REFERENCES DEAN (MADA)
);

CREATE TABLE PHANCONG (
	MA_NVIEN VARCHAR(15) ,
    MADA INT,
    STT INT,
    THOIGIAN TIME,
    PRIMARY KEY (MA_NVIEN, MADA, STT),
	FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN (MANV),
	FOREIGN KEY (MADA,STT) REFERENCES CONGVIEC (MADA,STT)
);

CREATE TABLE THANNHAN (
	MA_NVIEN VARCHAR(15) ,
    TENTN VARCHAR(15) ,
    PHAI ENUM ("NAM", "NU") NOT NULL,
    NGSINH DATE,
    QUANHE VARCHAR(15),
    PRIMARY KEY (MA_NVIEN, TENTN),
    FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN (MANV)
);


-- ALTER TABLE PHONGBAN DROP FOREIGN KEY FK_PHONGBAN_TRPH;
-- ALTER TABLE DIADIEM_PHG DROP FOREIGN KEY FK_MAPH;
-- ALTER TABLE DEAN DROP FOREIGN KEY FK_PHONG;
-- ALTER TABLE CONGVIEC DROP FOREIGN KEY FK_MADA;
-- ALTER TABLE PHANCONG DROP FOREIGN KEY FK_PHANCONG_MANV;
-- ALTER TABLE PHANCONG DROP FOREIGN KEY FK_MADA_STT;
-- ALTER TABLE THANNHAN DROP FOREIGN KEY FK_THANNHAN_MANV;

INSERT INTO NHANVIEN (MANV, HONV, TENLOT, TENNV, NGSINH, DCHI, PHAI, LUONG, MA_NQL, PHG)
VALUES 
    ('009','Đinh', 'Bá', 'Tiên',  '1960-02-11', '119 Công Quỳnh,TpHCM', "NAM", 30000, '005', 5),
    ('005','Nguyễn', 'Thanh', 'Tùng',  '1962-08-20', '222 Nguyễn Văn Cừ,TpHCM', "NAM", 40000, '006', 5),
    ('007','Bùi ', 'Ngọc ', 'Hằng ',  '1954-11-03', '332 Nguyễn Thái Học , Tp HCM', "NAM", 25000, '001', 4),
    ('001','Lê ', 'Quỳnh ', 'Như',  '1967-01-02' ,'291 Hồ Văn Huê , Tp HCM', "NU", 43000, '006', 4),
    ('004','Nguyễn ', 'Mạnh ', 'Hùng ',  '1967-04-03', '95 Bà Rịa,Vũng Tàu', "NAM", 38000, '005', 5),
    ('003','Trần ', 'Thanh ', 'Tâm ',  '1957-04-05' ,'34 Mai Thị Lựu,Tp HCM', "NAM", 25000, '005', 5),
    ('008','Trần ', 'Hồng ', 'Quang ',  '1967-01-09' ,'80 Lê Hồng Phong,Tp HCM', "NAM", 25000, '001', 4 ),
    ('006','Phạm', 'Văn', 'Vinh',  '1965-01-01', '45 Trưng Vương, Hà Nội', "NU", 55000, '', 1);


INSERT INTO PHONGBAN (TENPHG, MAPHG, TRPHG, NG_NHANCHUC)
VALUES 				('Nghiên cứu', 5, '005', '1978-05-22'), 
					('Điều hành', 4, '008', '1985-01-01'), 
					('Quản lý', 1, '006', '1971-06-19');


INSERT INTO DIADIEM_PHG (MAPHG, DIADIEM)
VALUES (1, 'TP HCM'),
       (4, 'Hà Nội'),
       (5, 'TAU'),
       (5, 'NHA TRANG'),
       (5, 'TP HCM');


INSERT INTO DEAN (TENDA, MADA, DDIEM_DA, PHONG)
VALUES ('San pham X', 1, 'Vũng Tàu', 5),
       ('San pham Y', 2, 'Nha Trang', 5),
       ('San pham Z', 3, 'TP HCM', 5),
       ('Tin hoc hoa', 10, 'Hà Nội', 4),
       ('Cap quang', 20, 'TP HCM', 1),
       ('Dao tao', 30, 'Hà Nội', 4);


INSERT INTO CONGVIEC (MADA, STT, TEN_CONG_VIEC)
VALUES 	(1, 1, 'Thiet ke san pham X'),
		(1, 2, 'Thu nghiem san pham X'),
		(2, 1, 'San xuat san pham Y'),
		(2, 2, 'Quang cao san pham Y'),
		(3, 1,'Khuyen mai san pham Z'),
		(10, 1,'Tin hoc hoa nhan su tien luong'),
		(10, 2,'Tin hoc hoa phong Kinh doanh'),
		(20, 1,'Lap dat cap quang'),
		(30, 1, 'Dao tao nhan vien Marketing'),
		(30, 2, 'Dao tao chuyen vien thiet ke');
		


INSERT INTO PHANCONG (MA_NVIEN,  MADA,  STT,  THOIGIAN)
VALUES 				('009',       1,     1,      32),
					('009',       2,     2,      8),
					('004',       3,     1,      40),
					('003',       1,     2,      20.0),
					('003',       2,     1,      20.0),
					('008',       10 ,   1 ,     35 ),
					('008',       30 ,   2 ,      5 ),
					('001',       30 ,   1 ,     20 ),
					('001',       20 ,   1 ,     15 ),
					('006',       20 ,   1 ,     30 ),
					('005',       3 ,   1 ,     10 ),
					('005',      10 ,   2 ,     10),
					('005',       20,     1,     10),
					('007',       30,     2,     30),
					('007',       10,     2,     10);


INSERT INTO THANNHAN (MA_NVIEN, TENTN, PHAI, NGSINH, QUANHE)
VALUES 	('005', 'Trinh', "NU", '1976-04-05', 'Con gái'),
		('005', 'Khang', "NAM", '1973-10-25', 'Con trai'),
		('005', 'Phuong', "NU", '1948-05-03', 'Vợ chồng'),
		('001', 'Minh', "NAM", '1932-02-29', 'Vợ chồng'),
		('009', 'Tiến', "NAM", '1978-01-01', 'Con trai'),
		('009', 'Châu', "NU", '1978-12-30', 'Con gái'),
		('009', 'Phuong', "NU", '1957-05-05', 'Vợ chồng');
        
        
        
        
-- question01

	DROP PROCEDURE IF EXISTS question_01;
	DELIMITER //
    
    CREATE PROCEDURE question_01()
    
    BEGIN
		SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV
		FROM NHANVIEN
        WHERE PHG = 4;
    
    
    END //
    DELIMITER ;
    
    CALL question_01();
    
    
-- question02

	DROP PROCEDURE IF EXISTS question_02;
    DELIMITER //
    
    CREATE PROCEDURE question_02()
    
    BEGIN
		
        SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV
        FROM NHANVIEN
        WHERE LUONG > 30000 ;
        
    END //
    DELIMITER ;
    
    CALL question_02();
    
    
-- question03


	DROP PROCEDURE IF EXISTS question_03;
    DELIMITER //
    
    CREATE PROCEDURE question_03()
    BEGIN
		SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV
		FROM NHANVIEN
        WHERE (LUONG > 25000 AND PHG = 4) OR ( LUONG > 30000 AND PHG = 5 ) ;
    
    END //
    
    DELIMITER ;
    
    CALL question_03();
    
    
-- question04

	DROP PROCEDURE IF EXISTS question_04;
    DELIMITER //
    CREATE PROCEDURE question_04()
    BEGIN
		SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV
        FROM NHANVIEN
        WHERE DCHI LIKE '%TP HCM%' ;
    END //
    DELIMITER ;
    
    CALL question_04();
    
-- question05

	DROP PROCEDURE IF EXISTS question_05;
    
    DELIMITER //
    CREATE PROCEDURE question_05()
    
    BEGIN
		SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV
        FROM NHANVIEN
        WHERE HONV LIKE 'N%' ;
    
    END //
    DELIMITER ;
    
    CALL question_05();
    
-- question06

	DROP PROCEDURE IF EXISTS quetion_06;
    
    DELIMITER //
    
    CREATE PROCEDURE question_06()
    
    BEGIN
		SELECT NGSINH , DCHI
        FROM NHANVIEN
        WHERE CONCAT_WS(' ',  HONV, TENLOT, TENNV) = 'Đinh Bá Tiên';
    
    END //
    DELIMITER ;
    
    CALL question_06();
    
-- question07

	DROP PROCEDURE IF EXISTS question_07;
    DELIMITER //
    CREATE PROCEDURE question_07()
    BEGIN
        SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV
        FROM NHANVIEN
        WHERE YEAR(NGSINH) BETWEEN 1960 AND 1965 ;
    END //
    DELIMITER ;
    
    CALL question_07();
    
-- question08

	DROP PROCEDURE IF EXISTS question_08;
    DELIMITER //
    CREATE PROCEDURE question_08()
    BEGIN
    SELECT CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV , YEAR(NGSINH) AS YEAR
    FROM NHANVIEN 
    ORDER BY YEAR(NGSINH) ;
    END //
    DELIMITER ;
    
    CALL question_08();
    
-- question09

	DROP PROCEDURE IF EXISTS question_09;
    DELIMITER //
    CREATE PROCEDURE question_09()
    BEGIN
		SELECT	CONCAT_WS(' ',  HONV, TENLOT, TENNV) AS TENNV , YEAR(now()) - YEAR(NGSINH) AS AGE
        FROM NHANVIEN
        ORDER BY YEAR(NGSINH) ;
    END //
    DELIMITER ;
    
    CALL question_09();
    
-- question_10

	DROP PROCEDURE IF EXISTS question_10;
    DELIMITER //
    CREATE PROCEDURE question_10()
    BEGIN
		SELECT PB.TENPHG , DD.DIADIEM
        FROM PHONGBAN PB
        JOIN DIADIEM_PHG DD ON PB.MAPHG = DD.MAPHG ;
    END //
    DELIMITER ;
    
    CALL question_10();
    
-- question11

	DROP PROCEDURE IF EXISTS question_11;
    DELIMITER //
    CREATE PROCEDURE question_11()
    BEGIN
		SELECT PB.TENPHG , CONCAT_WS(' ',  NV.HONV, NV.TENLOT, NV.TENNV) AS TRPHG
        FROM PHONGBAN PB
        JOIN NHANVIEN NV ON PB.TRPHG = NV.MANV ;
    END //
    DELIMITER ;
    
    CALL question_11();
    
-- question_12

	DROP PROCEDURE IF EXISTS question_12;
	DELIMITER //
    CREATE PROCEDURE question_12()
    BEGIN
		SELECT CONCAT_WS(' ',  NV1.HONV, NV1.TENLOT, NV1.TENNV) AS TENNV , NV1.DCHI
        FROM NHANVIEN NV1
        JOIN PHONGBAN PB ON NV1.PHG = PB.MAPHG 
        WHERE PB.TENPHG LIKE 'Nghiên cứu' ;
    END //
    DELIMITER ;
    
    CALL question_12();
    
		
    
    
