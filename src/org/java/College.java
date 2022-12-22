package org.java;

public class College {
 public void undergraduate(String dept) {
	 System.out.println("dept  -"+dept);
	 }
 public void postgraduate(String dept2) {
	 System.out.println("dept  -"+dept2);
	 
 }
 public static void main(String[]args) {
	 College C=new College();
	 C.undergraduate("CSE");
	 C.postgraduate("IT");
	 
 }
}
