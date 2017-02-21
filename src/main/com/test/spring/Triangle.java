package com.test.spring;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	private Point pointE;
	private ApplicationContext context;
	
	List<Point> objList;
	
	
	public List<Point> getObjList() {
		return objList;
	}

	public void setObjList(List<Point> objList) {
		this.objList = objList;
	}

	public Point getPointE() {
		return pointE;
	}

	@Autowired
	
	public void setPointE(Point pointE) {
		this.pointE = pointE;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public Triangle() {
		System.out.println("Inside no arg constructor");
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle(String args){
		System.out.println("Inside one arg constructor");
	}
	
	public Triangle(String args,int a){
		System.out.println("Inside two arg constructor");
	}
	
	public void draw() {
		
		System.out.println("Traingle drawn 1 "+ pointA.getX()+":"+pointA.getY());
		System.out.println("Traingle drawn 2 "+ pointB.getX()+":"+pointB.getY());
		System.out.println("Traingle drawn 3 "+ pointC.getX()+":"+pointC.getY());
		System.out.println("Traingle drawn 4 "+ pointD.getX()+":"+pointD.getY());
		System.out.println("Traingle drawn 5 "+ pointE.getX()+":"+pointE.getY());			
	}
	
	public void drawList() {
		
		System.out.println("The List.....");
		objList.stream().forEach((p)->System.out.println(p.getX()+":"+p.getY()));
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println(arg0);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		pointA = (Point) context.getBean("pointA");
		System.out.println(pointA.getX());
		
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("In Post Construct");
		
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("In Pre Destroy");
		
	}	
	
	public void initialize(){
		System.out.println("Inside initialize....");
		
	}
}
