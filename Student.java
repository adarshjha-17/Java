public class Student{

    private int age;
    private String name;
    private String DOB;
    private int classes;

    private static String collegeName;

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public Student(int age, String name,String DOB, int classes){

        if(age <= 18){

            this.age = age;
            this.name = name;
            this.DOB = DOB;
            this.classes = classes;

        }
        else{
            System.out.println("Enter a valid age..");
        }
        
    }

    public static String getCollegeName(){

        return collegeName;
    }

    public static void setCollegeName(String collegeName){

        this.collegeName = collegeName;
    }
 
}

