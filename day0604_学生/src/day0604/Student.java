package day0604;

public class Student {
	int id;//id
	String name;//名字
	String gender;//性别
	int age;//年龄
	
	public Student(){	
	}
	
	public Student(int id,String name){
		/*
		this.id = id;
		this.name = name;
		*/
		this(id, name, null);
	}
	
	public Student(int id,String name,String gender){
		/*
		this.id = id;
		this.name = name;
		this.gender = gender;
		*/
		//从构造方法，调用另一个重载的构造方法，
		//目的是减少代码重复
		this(id, name, gender, 0);
	}
	
	public Student(int id,String name,String gender,int age){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String toString(){
		return "id:"+id+",name:"+name+",gender:"+gender+",age:"+age;
	}
	

}
