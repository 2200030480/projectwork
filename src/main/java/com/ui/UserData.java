package com.ui;
import javax.faces.bean.ManagedBean;;

@ManagedBean(name = "user", eager =true)
public class UserData {
String name;
int age;
String mobileno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}

}
