module com.school {

  requires java.sql;



  requires javafx.fxml;
  requires javafx.graphics;
  requires javafx.controls;
  requires controlsfx;


  exports com.school.login;
  opens com.school.login to javafx.fxml;
  exports com.school.admin;
  opens com.school.admin to javafx.fxml;
  opens com.school to javafx.fxml;
  exports com.school;
  exports com.school.student;
  opens com.school.student to javafx.fxml;
  exports com.school.home;
  opens com.school.home to javafx.fxml;
}