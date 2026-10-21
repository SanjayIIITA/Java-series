public class ImmutableClass{
    public static void main(String[] args) {

        College college = new College("IIT A", "Allahabad");
        Student s1 = new Student(28,"sanjay", college);
        System.out.println(s1.getCollege().name); // IIT A

        s1.getCollege().name = "IIT B";
        //s1.getCollge() Here i got the reference of college so i can modify college data without setter
        System.out.println(s1.getCollege().name);

        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());
        // System.out.println(s1.getCollege());

       
        // System.out.println(college.name());
        // System.out.println(college.address());

        
    }
}

//Immutable Class
// now it is not purely immutable
class Student{
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        this.college = college;

    }

    //getters
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return name;
    }

    public College getCollege() {
        return this.college; // this is giving me college reference so I am able to change name 
    }
}

//Mutable
class College {
    String name;
    String address;

    College (String name, String address){
        this.name = name;
        this.address = address;
    }

    public String name() {
        return this.name;
    }

    public String address() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}