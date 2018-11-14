# WebTutorial4Java

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
