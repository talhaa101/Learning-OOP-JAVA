public class Student
{
    public  String name ; // instance variable
    public  String id ; // instance variable

    // public void m1(int n1 , String n2) // instance method
    // {
    //     System.out.println(n1 +" "+ n2 + " M1 is working");
    // }

    public void showDetail() // instance method
    {
        System.out.println(name + " " + id);
    }

    public void standUp() // instance method
    {
        System.out.println(name + " " + id + " is now standing");
    }
}
