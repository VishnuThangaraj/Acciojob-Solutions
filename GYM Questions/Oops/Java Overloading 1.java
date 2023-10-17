//https://course.acciojob.com/idle?question=eefaa427-0ba0-40fa-b6c3-c352147de7a9

class Test1
{
    public static void talk()
    {
          System.out.println("hello there!");
    }

    //overloading method
	public static void talk(String name)
    {
          System.out.println("Hello "+name);
    }

}
public class Main{
    public static void main(String[] args)
    {
        Test1 test=new Test1();
        test.talk("Matthew");
    }
}
