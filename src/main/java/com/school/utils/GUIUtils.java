package com.school.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIUtils {
  public static void showStage(String path, String title) throws IOException {
    Stage stage = new Stage();
    Parent root = FXMLLoader.load(GUIUtils.class.getResource(path));
    Scene sc = new Scene(root);
    stage.setScene(sc);
    Image image = new Image(GUIUtils.class.getResourceAsStream("images/logo.jpg"));
//    Image logo = new Image("src/logo.jpg");
    stage.setTitle(title);
    stage.show();
  }
}
