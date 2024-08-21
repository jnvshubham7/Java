// package oom.tut_7;



interface animals{
	public void greet();
}
interface dogs{
	public void greet();
}
class puppy implements animals,dogs{
	public void greet()
	{
		System.out.println("Hello, This is PuppyDog Class ");
	}
}
public class tut7_que3 {

	public static void main(String[] args) {
		
		puppy obj1 = new puppy();
		obj1.greet();
	}
}

