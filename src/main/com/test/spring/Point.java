package com.test.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Point implements InitializingBean,DisposableBean {
 
 public int x;
 public int getX() {
	return x;
}
 @Required 
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int y;
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("After Property Set");
	
}
@Override
public void destroy() throws Exception {
	System.out.println("After Set");
	
}
 
 public void myinit(){
	 
	 System.out.println("Inside myinit method");
 }
}
