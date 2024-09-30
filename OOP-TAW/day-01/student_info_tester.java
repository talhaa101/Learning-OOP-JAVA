
public class student_info_tester {
    public static void main(String [] args) {
        int x = 5;
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Talha";
        s1.id = "24301301";
        s2.name = "Shanto";
        s2.id = "1000";

        // int [] arr1 = new int [4];
        // double [] arr2 = new double [5] ;
        // //System.out.println(x);
        // System.out.println(s1);
        // System.out.println(s2);
        // // System.out.println(arr1);
        // // System.out.println(arr2);
        // // System.out.println(arr1.length);
        // // System.out.println(arr2.length);
        //s1.m1(123 , "CSE");
        
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s2.name);
        // System.out.println(s2.id);
        // System.out.println(" ");
        // s1 = s2;
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s2.name);
        // System.out.println(s2.id);


        // System.out.println("\033c"); // anci code
        // System.out.println("\033[20;5H\033[38;5;240m Game Over! "); // anci code


        // s1.showDetail();
        // System.out.println("======================");
        // s2.showDetail();

        s1.standUp();
        System.out.println("===============");
        s2.standUp();
    }

}
