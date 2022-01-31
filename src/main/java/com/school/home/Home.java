package com.school.home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Home extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    Parent root = (Parent) FXMLLoader.load(getClass().getResource("/home.fxml"));
    Scene scene = new Scene(root);

    ImageView iv = new ImageView();


    stage.setScene(scene);
    stage.setTitle("School Management System");
    stage.show();
  }

}
