package com.luco.ex00;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySqlConnectionTest {
	
/*  mySql Driver 구버젼을 신버젼으로 변경 */	
/*	private static final String DRIVER = "com.mysql.jdbc.Driver";*/
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
/*	private static final String URL = "jdbc:mysql://127.0.0.1:3306/myfirstboard?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";*/
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/scott_db?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
	private static final String USER = "scott";
	private static final String PW = "tiger";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
