package com.school.login;

import com.school.option;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static com.school.utils.GUIUtils.showStage;


public class LoginController implements Initializable {
  LoginModel loginModel = new LoginModel();

  @FXML
  private Button cancelButton;

  @FXML
  private Label loginMessage;

  @FXML
  private Button loginButton;

  @FXML
  private TextField username;

  @FXML
  private PasswordField password;

  @FXML
  private ComboBox <option> combobox;

  @FXML
  private Label  dbstatus;


  public LoginController() throws SQLException {
  }

@Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    if ((this.loginModel.isDatabaseConnected())) {
      this.dbstatus.setText("Connected to database");
      System.out.println("connected");
    } else{
      this.dbstatus.setText("Not connected to db");
    }
    this.combobox.setItems(FXCollections.observableArrayList(option.values()));
  }

  public void studentLogin(){
    try {

      showStage("/student.fxml", "Student Dashboard");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public void adminLogin(){
    try{
      showStage("/admin.fxml", "Admin Dashboard");


    } catch (Exception e) {
     e.printStackTrace();

    }

  }

  @FXML
  private void Login(ActionEvent event){
    try {
      if (this.loginModel.isLogin(this.username.getText(), this.password.getText(), this.combobox.getValue().toString())){
        Stage stage = (Stage) this.loginButton.getScene().getWindow();
        stage.close();

        switch (this.combobox.getValue().toString())
        {
          case "Admin":
            adminLogin();
            break;

          case "Student":
            studentLogin();
            break;

          default:
            throw new IllegalStateException("Unexpected value: " + this.combobox.getValue().toString());
        }
      }
      else {
        this.loginMessage.setText("Invalid login. Please try again");
      }
    } catch (Exception localException) {
      localException.printStackTrace();

    }

  }

  public void cancelButton(ActionEvent event) {
    Stage stage = (Stage) cancelButton.getScene().getWindow();
    stage.close();
  }

// public void loginButtonOnAction(ActionEvent event) throws Exception {
//
//   if (!usernameTextField.getText().isBlank() && !enterPasswordField.getText().isBlank()){
//    validateLogin();
// } else {
//     loginMessage.setText("Please enter username and password");
//   }
// }
//
// public void validateLogin() throws Exception {
//   dbConnection connectNow = new dbConnection();
//   Connection connectDB = connectNow.getConnection();
//
//   String verifyLogin = "SELECT * FROM user_account WHERE username ='" + usernameTextField + enterPasswordField.getText() + " ' ";
//   try {
//     Statement statement = connectDB.createStatement();
//     ResultSet queryResult = statement.executeQuery(verifyLogin);
//     System.out.println("success");
//
//     while (queryResult.next()){
//       if (queryResult.getInt(1) == 1){
//
//         loginMessage.setText("Logged in successfully");
//       }else {
//         loginMessage.setText("Invalid login. Please try again");
//       }
//     }
//   } catch(Exception e){
//     e.printStackTrace();
//     e.getCause();
//   }
// }
// @Override
// public void initialize(URL url, ResourceBundle resourceBundle) {
//   File brandingFile = new File("images/logo.jpg");
//   Image brandingImage = new Image(brandingFile.toURI().toString());
//   brandingImageView.setImage(brandingImage);
//
//   File lockFile = new File("images/undraw_Safe_re_kiil.png");
//   Image lockImage = new Image(lockFile.toURI().toString());
//   lockImageView.setImage(lockImage);
// }


}