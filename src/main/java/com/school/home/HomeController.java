package com.school.home;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
  @FXML
  public Button home1;

  @FXML
  private Button home;

  @FXML
  private Button students;

  @FXML
  private Button staff;

  @FXML
  private Button accounts;

  @FXML
  private Button library;

  @FXML
  private ImageView logo1;

  @FXML
  private ImageView cover;

  @FXML
  private ImageView logo2;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {

    File brandingFile = new File("images/logo.jpg");
   Image brandingImage = new Image(brandingFile.toURI().toString());
    logo1.setImage(brandingImage);

//  File lockFile = new File("images/undraw_Safe_re_kiil.png");
//   Image lockImage = new Image(lockFile.toURI().toString());
//   lockImageView.setImage(lockImage);
  }
}
