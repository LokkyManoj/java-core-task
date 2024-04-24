package com.chainsys.remainderApp;

public class BmiCalculation {
String name;
double height;
int weight;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHeight() {
	return height;
}
public void setHeight (double height) {
	this.height = height;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public BmiCalculation(String name, double height, int weight) {
	super();
	this.name = name;
	this.height = height;
	this.weight = weight;
}
public BmiCalculation() {
	
}

public String toString() {
	return "BmiCalculation [name=" + name + ", height=" + height + ", weight=" + weight + "]";
}

}
