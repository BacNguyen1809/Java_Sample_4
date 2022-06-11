/*
	* @author bacng
	* @ Date Jun 8, 2022
*/
package exercise;

public class InstanceofDemo {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		
		System.out.println("obj1 instanceof Parent: "
				+(obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: "
				+(obj1 instanceof Child));
		System.out.println("obj1 instanceof Myinterface: "
				+(obj1 instanceof MyInterface));
		System.out.println("obj2 instanceof Parent: "
				+(obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: "
				+(obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: "
				+(obj2 instanceof MyInterface));
		
	}

}
