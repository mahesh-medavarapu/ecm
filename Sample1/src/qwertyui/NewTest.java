package qwertyui;

import com.dark.Bat;

public class NewTest {
	
public   int data=7;
	
static NewTest obj;
   public  void setData(int data){
	   this.data=data;
   }
   public  int getData(){
	   return this.data;
   }
public void login(){
	if(obj==this){
		System.out.println("data");
	}
}
	public static  void main(String[] args){

		new Bat().ref().B();
//		obj=new NewTest();
//		obj.login();
//		System.out.println(obj.getData());
//		System.out.println(obj.data);

	}
	

}
