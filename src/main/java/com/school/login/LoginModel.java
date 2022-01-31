package com.school.login;

import com.school.dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
  Connection connection;

  public LoginModel() throws SQLException {
    try {
      this.connection = dbConnection.getConnection();
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (this.connection == null){
      System.exit(1);
    }
  }
  public boolean isDatabaseConnected(){
    return this.connection !=null;
  }
  public boolean isLogin(String user, String pass, String option) throws Exception{
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    String sql = "SELECT * FROM user_account WHERE username = ? and Password = ? and division = ?";

  try{
    preparedStatement = this.connection.prepareStatement(sql);
    preparedStatement.setString(1,user);
    preparedStatement.setString(2,pass);
    preparedStatement.setString(3,option);
    resultSet = preparedStatement.executeQuery();

    boolean boll1;

    return resultSet.next();
  }
  catch (SQLException e) {
   return false;
  }
  finally {
    preparedStatement.close();
    resultSet.close();
  }

  }
  }
