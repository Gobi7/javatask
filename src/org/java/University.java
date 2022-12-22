package org.java;

public class University extends College{
	public void undergraduate(String dept) {
		 System.out.println("dept  -"+dept);
		 
	 }public void postgraduate(String dept) {
		 System.out.println("dept  -"+dept);
		 
	 }public static void main(String[]args) {
		 College C=new College();
		 C.undergraduate("MECH");
		 C.postgraduate("CIVIl");
}
	 }
