import java.util.Objects;
public class Student{
    public static void main(String [] args){

        Students s1 = new Students();

        s1.name = "Sanjay";
        s1.age = 28;
        // System.out.println(s1.toString()); //without override Students@b3d7190
        System.out.println(s1); // it has default method toString

        Students s2 = new Students();
        s2.name = "Sanjay";
        // s2.name = null;
        s2.age = 28;
        System.out.println(s1.equals(s2)); //False because comparing reference

        Students s3 = null;
        Integer i = 28;
        System.out.println(s1.equals(s2));

        // System.out.println(s1.equals(s3)); // null pointer exception

        System.out.println(s1.hashCode() == s2.hashCode());//false hashcode is different so we need to override

        System.out.println(s1.getClass().getName());// get class name Students
        System.out.println(s2.getClass().getName());

        System.out.println(s1 instanceof Students);

    }
}

// instanceOf operator ----> check if an object is instance of a class or any of its subclass
class Students extends Object{
    String name;
    int age;

    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age; 
    }

    @Override
    public boolean equals(Object obj){

        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;

        }
        // checked both class are type Student
        // if not checked we may get ClassCastException
        if (obj.getClass() != this.getClass()){
          return false;
        }

        Students s = (Students) obj;

        return (this.name == s.name && this.age == s.age);

    }
    @Override
    public int hashCode(){
        // int result = 17; //Take non zero and prime number
        // result = 31 * result + age;
        // result = 31 * result + ((name == null) ? 0 : name.hashCode());
        // return result;
        return Objects.hash(name, age);
    }
}