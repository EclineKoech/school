package com.school.login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {

    Parent root = (Parent) FXMLLoader.load(getClass().getResource("/login.fxml"));

    Scene scene = new Scene(root);

    stage.setScene(scene);

//    Image icon = new Image("src/logo.jpg");
//    stage.getIcons().add(icon);
    stage.setTitle("School Management System");
    stage.show();
  }
//    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("/login.fxml"));
//    Scene scene = new Scene(fxmlLoader.load( 620, 400);
//    stage.setTitle("School Management System");
//    stage.setScene(scene);
//    stage.show();


  public static void main(String[] args) {
    launch();
  }
}