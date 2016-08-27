package com.dark;
public class Thisdemo {
  
  public void f() {
	  System.out.println("f method");
	  this.d().f();
  }
  public Thisdemo d(){
	  System.out.println("d  method");
	  return this;
  }
  
  public static void main(String h[]){
	  Thisdemo f = new Thisdemo();
	  f.d();
  }
  
}
