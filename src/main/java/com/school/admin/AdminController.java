package com.school.admin;

import com.school.dbUtil.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public  class AdminController {
 @FXML
  private TextField id;
  @FXML
  private TextField firstname;
  @FXML
  private TextField lastname;
  @FXML
  private TextField grade;
  @FXML
  private TextField classteacher;
  @FXML
  private TextField parentname;
  @FXML
  private TextField phonenumber;
  @FXML
  private DatePicker datepicker;
  @FXML
  private TextField feepaid;
  @FXML
  private TextField feebal;
  @FXML
 private TableView<StudentData> studentdata;
  @FXML
 private TableColumn<StudentData,String> idcolumn;
 @FXML
 private TableColumn<StudentData,String> fcolumn;
 @FXML
 private TableColumn<StudentData,String> lcolumn;
 @FXML
 private TableColumn<StudentData,String> gradecolumn;
 @FXML
 private TableColumn<StudentData,String> teachercolumn;
 @FXML
 private TableColumn<StudentData,String> parentcolumn;
 @FXML
 private TableColumn<StudentData,String> phonecolumn;
 @FXML
 private TableColumn<StudentData,String> dobcolumn;
 @FXML
 private TableColumn<StudentData,String> feepaidcolumn;
 @FXML
 private TableColumn<StudentData,String> feebalancecolumn;
 @FXML
 private Button addentry;
 
 private dbConnection dc = new dbConnection();
 private  String sql = "SELECT * FROM students";
 private ObservableList<StudentData> data;

 public static void initialize(URL url, ResourceBundle rb){}

 @FXML
 private void loadStudentData(ActionEvent event) throws Exception {
  try {
   Connection connection = dbConnection.getConnection();
   this.data = FXCollections.observableArrayList();

   assert connection != null;
   ResultSet rs = connection.createStatement().executeQuery(sql);
   while (rs.next()) {
    this.data.add(new StudentData(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), id, firstname, lastname, grade, classteacher, parentname, phonenumber, datepicker, feepaid, feebal));
   }
  } catch (SQLException e) {
   System.err.println("ERROR " + e);
  }
  this.idcolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("ID"));
  this.fcolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("firstName"));
  this.lcolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("lastName"));
  this.gradecolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("grade"));
  this.teachercolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("classTeacher"));
  this.parentcolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("parentName"));
  this.phonecolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("phoneNumber"));
  this.dobcolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("DOB"));
  this.feepaidcolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("feePaid"));
  this.feebalancecolumn.setCellValueFactory(new PropertyValueFactory<StudentData,String>("feeBalance"));

  this.studentdata.setItems(null);
  this.studentdata.setItems(this.data);
 }
 @FXML
 private void addStudent(ActionEvent event) throws Exception {
  String sqlInsert = "INSERT INTO students(id,fname,lname,grade,teacher,parent,phone,dob,feepaid,feebal) VALUES(?,?,?,?,?,?,?,?,?,?)";
  Connection connection = dbConnection.getConnection();
  assert connection != null;
  PreparedStatement stmnt = connection.prepareStatement(sqlInsert);

  stmnt.setString(1,this.id.getText());
  stmnt.setString(2,this.firstname.getText());
  stmnt.setString(3,this.lastname.getText());
  stmnt.setString(4,this.grade.getText());
  stmnt.setString(5,this.classteacher.getText());
  stmnt.setString(6,this.parentname.getText());
  stmnt.setString(7,this.phonenumber.getText());
  stmnt.setString(8,this.datepicker.getEditor().getText());
  stmnt.setString(9,this.feepaid.getText());
  stmnt.setString(10,this.feebal.getText());

  stmnt.execute();
  connection.close();

 }
 @FXML
 private void clearFields(ActionEvent event){
  this.id.setText("");
  this.firstname.setText("");
  this.lastname.setText("");
  this.grade.setText("");
  this.classteacher.setText("");
  this.parentname.setText("");
  this.phonenumber.setText("");
  this.datepicker.setValue(null);
  this.feepaid.setText("");
  this.feebal.setText("");
 }
}
