## mySQL 구문

# mySQL 8.0 설치

# mySQL Workbench 설치 & 설정


```sql
# scott 에게 권한 상승 
GRANT ALL on scott_db.* TO scott@'localhost';

# 데이타베이스 작성
create database testdb1 character set utf8;

# 데이터베이스 사용
use testdb1;

# 데이터베이스안에 테이블 작성 (실제 사용할 정보 저장되는 공간)
# 키보드 ESC 아래, 1키 왼쪽에 있는 `키 사용(' 키가 아님)
create table `mard` ( 
	`id` varchar(10) NOT NULL, 
    `name` varchar(4),
    `address` varchar(50),
    primary key(`id`)
    );
    
# 데이터베이스 안의 테이블 삭제 
drop table `mard`;


create database scott_db character set utf8;
use scott_db;

DROP TABLE IF EXISTS `mvc_board`;
CREATE table `mvc_board`(
    BID INT(4) auto_increment ,
    BNAME VARCHAR(20),
    BTITLE VARCHAR(100),
    BCONTENT VARCHAR(300),
    BDATE DATETIME DEFAULT NOW(),
    BHIT INT(4) DEFAULT 0,
    BGROUP INT(4),
    BSTEP INT(4),
    BINDENT INT(4),
	PRIMARY KEY (`BID`)
) ENGINE=innodb DEFAULT CHARSET=utf8;


INSERT INTO `mvc_board` (`BNAME`,`BTITLE`, `BCONTENT`, 
		`BHIT`,`BGROUP`, `BSTEP`, `BINDENT`)
  VALUES ('오프라 윈프리', '가장 큰 모험', '여러분이 할 수 있는 가장 큰 모험은 바로 여러분이 꿈꾸는 삶을 사는 것입니다.', 
		0, LAST_INSERT_ID()+1, 0, 0);

INSERT INTO `mvc_board` (`BNAME`,`BTITLE`, `BCONTENT`, 
		`BHIT`,`BGROUP`, `BSTEP`, `BINDENT`)
  VALUES ('랄프 왈도 에머슨', '도토리', '수천개의 숲도 한개의 도토리 열매에서 만들어진다.', 
		0, LAST_INSERT_ID()+1, 0, 0);

INSERT INTO `mvc_board` (`BNAME`,`BTITLE`, `BCONTENT`, 
		`BHIT`,`BGROUP`, `BSTEP`, `BINDENT`)
  VALUES ('마이클 J. 폭스', '가족', '가족은 중요한게 아니라 모든 것입니다.', 
		0, LAST_INSERT_ID()+1, 0, 0);


select * from mvc_board;
```