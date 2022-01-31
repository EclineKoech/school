package com.school.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
 private static final String databaseName = "school";
  private static final String databaseUser = "root";
  private static final String databasePassword = "esme1234@C";
  private static final String url = "jdbc:mysql://localhost/" + databaseName;

  public static Connection getConnection() throws Exception{
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      return DriverManager.getConnection(url,databaseUser,databasePassword);
    }
    catch (ClassNotFoundException e){
      e.printStackTrace();
    }
    return null;
  }
}
