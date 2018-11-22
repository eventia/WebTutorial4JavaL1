# WebTutorial4Java

#pom.xml

- Java : 1.8
- org.springframework-version : 4.2.4.RELEAS
- org.aspectj-version : 1.6.10
- org.slf4j-version : 1.6.6

- mysql-connector-java : 8.0.13
- mybatis : 3.4.1
- mybatis-spring : 1.3.0


## mySql 관련 제대로 된 세팅 :

# mySql 명령구문

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


INSERT INTO `mvc_board` (`BNAME`,`BTITLE`, `BCONTENT`, `BHIT`,`BGROUP`, `BSTEP`, `BINDENT`)
  VALUES ('오프라 윈프리', '가장 큰 모험', '여러분이 할 수 있는 가장 큰 모험은 바로 여러분이 꿈꾸는 삶을 사는 것입니다.', 0, LAST_INSERT_ID()+1, 0, 0);

INSERT INTO `mvc_board` (`BNAME`,`BTITLE`, `BCONTENT`, `BHIT`,`BGROUP`, `BSTEP`, `BINDENT`)
  VALUES ('랄프 왈도 에머슨', '도토리', '수천개의 숲도 한개의 도토리 열매에서 만들어진다.', 0, LAST_INSERT_ID()+1, 0, 0);

INSERT INTO `mvc_board` (`BNAME`,`BTITLE`, `BCONTENT`, `BHIT`,`BGROUP`, `BSTEP`, `BINDENT`)
  VALUES ('마이클 J. 폭스', '가족', '가족은 중요한게 아니라 모든 것입니다.', 0, LAST_INSERT_ID()+1, 0, 0);


select * from mvc_board;
```



# myex_2myBatis

- 버젼 설정 체크 완료 (2018.11.19)

# mysqlboard

- 수정으로 맞춤

## mySql 

scott_db 스키마추가

/*  mySql Driver 구버젼을 신버젼으로 변경 */	

/*	private static final String DRIVER = "com.mysql.jdbc.Driver";*/

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
mysql-connector-java 버전 6.xx 이상(현재 8.0 사용)에서 com.mysql.jdbc.Driver가 Deprecated 됐다고 경고메시지 발생
com.mysql.cj.jdbc.Driver로 변경할 것(이전 com.mysql.jdbc.Driver)

이전 방식에서는 jdbc:mysql://{ip주소}:{port번호}/{databaseName} 식으로 url을 설정, 사용방식이 6.x 이후에서는 serverTimezone파라미터가 필수가 되어 빠지면 에러 발생(DB연결 되지 않음)

jdbc:mysql://{ip주소}:{port번호}/{databaseName}?serverTimezone=UTC 식으로 사용

실제 사용예는 아래에 

jdbc:mysql://127.0.0.1:3306/myfirstboard?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false

관련 docs링크

https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-spring-config.html


## tree

c:/dev

  - /Servers/apache-tomcat-7.0.91

  - /sts-3.9.5.RELEASE

  - /WebTutorial4Java
    - /Java1HelloWorld
    - /Java2Gugu
    - /Java3String
    - /Java4Class
    - /Java5InOut
    - /Java6Etc
    - /Jsp1Hello
    - /Spring1Hello

	
## STEP 1. 자바 따라하기	

    - /Java1HelloWorld
    - /Java2Gugu
    - /Java3String
    - /Java4Class
    - /Java5InOut
    - /Java6Etc


## STEP 2. Web 서비스와 JSP

    - /Jsp1Hello

	
## STEP 3. Web 서비스를 위한 스프링 프레임워크 따라하기

    - /Spring1Hello
	

## Spring 프로젝트 튜토리얼 세부 내용

1. Spring Legacy 프로젝트 생성 후 실행
2. home.jsp 수정
2.1. 한글 깨짐 방지 UTF-8
<pre><code>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
</pre></code>

2.2. table 태그 사용으로 게시판 모양 만들기

3. mySql 로 DB 생성(myfirstboard)

3.1. CMD(Shell) 에서 명령
```sql
mysql -uroot -p
CREATE DATABASE MYPDB CHARACTER SET utf8 COLLATE utf8_general_ci;
create user scott@localhost IDENTIFIED BY 'tiger';
grant all privileges on MYPDB.* to scott@localhost;
```

3.2. WorkBench 에서 실행

```
use MYPDB;
CREATE table `myFirstBoard`(
    M1ID INT(4) auto_increment ,
    M1AUTHOR VARCHAR(20),
    M1TITLE VARCHAR(100),
    M1TEXT VARCHAR(300),
    M1WDATE DATETIME DEFAULT NOW(),
    M1PDATE DATETIME,
    PRIMARY KEY (`M1ID`)
) ENGINE=innodb DEFAULT CHARSET=utf8;
```



4. pom.xml 수정 - dependency 추가
```xml
   <!-- JDBC Template -->

    <!-- MySQL -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>6.0.5</version>
    </dependency>

    <!-- MyBatis 3.4.1 -->
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.4.1</version>
    </dependency>


    <!-- MyBatis-Spring -->
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>1.3.0</version>
    </dependency>

    <!-- Spring-jdbc -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>${org.springframework-version}</version>
    </dependency>

    <!-- Spring-test -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-test -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <version>${org.springframework-version}</version>
    </dependency>
```
   
5. DB 데이터 저장, mySql

```sql
create database LOCALDB CHARACTER SET utf8 COLLATE utf8_general_ci;
grant all privileges on LOCALDB.* to scott@localhost;
use LOCALDB;

CREATE table `myFirstBoard`(
    M1ID INT(4) auto_increment ,
    M1AUTHOR VARCHAR(20),
    M1TITLE VARCHAR(100),
    M1TEXT VARCHAR(300),
    M1WDATE DATETIME DEFAULT NOW(),
    M1PDATE DATETIME,
    PRIMARY KEY (`M1ID`)
) ENGINE=innodb DEFAULT CHARSET=utf8;
```
# WebTutorial4JavaL1
