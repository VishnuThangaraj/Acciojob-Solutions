//https://course.acciojob.com/idle?question=c422428a-3393-4fdc-a875-47e88248a78e

class Person
{
    public void speak()
    {
        System.out.println("I'm a person");
    }
}

class Student extends Person
{
    @Override
	public void speak()
    {
        System.out.println("I''m a student");
    }
}
public class Main{
    public static void main(String[] args)
        {
            Person p1 = new Student();
            p1.speak();
        }
}
