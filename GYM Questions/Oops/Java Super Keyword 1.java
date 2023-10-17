//https://course.acciojob.com/idle?question=caf1745b-aacd-4974-92a0-87dc1d7a67fe

class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() { return this.name; }

    public int getAge() { return this.age; }

    public String toString()
    {
        return getName() + " " + getAge();
    }

    
}

class Teacher extends Person
{
	private String course;

	//constructor
    public Teacher(String name, int age, String course)
    {
        super(name,age); //calling super class constructor
		this.course = course;
    }

	@Override //to print course too
	public String toString()
    {
		//get name and age from super class
        return super.getName() + " " + super.getAge() + " " + course;
    }
	
}
public class Main{
    public static void main(String[] args)
    {
       Person p = new Person("Destini", 20);
       System.out.println(p);
       Teacher p2 = new Teacher("Erica", 55, "Masters in Teaching");
       System.out.println(p2);
    }
}
