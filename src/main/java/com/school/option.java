package com.school;

public enum option {
  Admin, Student;

  option() {}
  public String value(){
    return name();
  }
  public static option fromvalue(String v){
    return valueOf(v);
  }
}
