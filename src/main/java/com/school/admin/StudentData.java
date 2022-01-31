package com.school.admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class StudentData {
  private final StringProperty ID;
  private final StringProperty firstName;
  private final StringProperty lastName;
  private final StringProperty grade;
  private final StringProperty classTeacher;
  private final StringProperty parentName;
  private final StringProperty parentPhone;
  private final StringProperty DOB;
  private final StringProperty feePaid;
  private final StringProperty feeBal;

  public StudentData(String id, String firstname, String lastname, String grade, String classteacher, String parentname, String parentphone, String dob, String feepaid, String feebal, TextField textField, TextField field, TextField lastname1, TextField grade1, TextField classteacher1, TextField parentname1, TextField phonenumber, DatePicker datepicker, TextField feepaid1, TextField feebal1) {
    this.ID = new SimpleStringProperty(id);
    this.firstName = new SimpleStringProperty(firstname);
    this.lastName = new SimpleStringProperty(lastname);
    this.grade = new SimpleStringProperty( grade);
    this.classTeacher = new SimpleStringProperty(classteacher);
    this.parentName = new SimpleStringProperty(parentname);
    this.parentPhone = new SimpleStringProperty(parentphone);
    this.DOB = new SimpleStringProperty(dob);
    this.feePaid = new SimpleStringProperty( feepaid);
    this.feeBal = new SimpleStringProperty(feebal);
  }


  public String getID() {
    return ID.get();
  }

  public StringProperty IDProperty() {
    return ID;
  }

  public void setID(String ID) {
    this.ID.set(ID);
  }

  public String getFirstName() {
    return firstName.get();
  }

  public StringProperty firstNameProperty() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName.set(firstName);
  }

  public String getLastName() {
    return lastName.get();
  }

  public StringProperty lastNameProperty() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName.set(lastName);
  }

  public String getGrade() {
    return grade.get();
  }

  public StringProperty gradeProperty() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade.set(grade);
  }

  public String getClassTeacher() {
    return classTeacher.get();
  }

  public StringProperty classTeacherProperty() {
    return classTeacher;
  }

  public void setClassTeacher(String classTeacher) {
    this.classTeacher.set(classTeacher);
  }

  public String getParentName() {
    return parentName.get();
  }

  public StringProperty parentNameProperty() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName.set(parentName);
  }

  public String getParentPhone() {
    return parentPhone.get();
  }

  public StringProperty parentPhoneProperty() {
    return parentPhone;
  }

  public void setParentPhone(String parentPhone) {
    this.parentPhone.set(parentPhone);
  }

  public String getDOB() {
    return DOB.get();
  }

  public StringProperty DOBProperty() {
    return DOB;
  }

  public void setDOB(String DOB) {
    this.DOB.set(DOB);
  }

  public String getFeePaid() {
    return feePaid.get();
  }

  public StringProperty feePaidProperty() {
    return feePaid;
  }

  public void setFeePaid(String feePaid) {
    this.feePaid.set(feePaid);
  }

  public String getFeeBal() {
    return feeBal.get();
  }

  public StringProperty feeBalProperty() {
    return feeBal;
  }

  public void setFeeBal(String feeBal) {
    this.feeBal.set(feeBal);
  }
}
