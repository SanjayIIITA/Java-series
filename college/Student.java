package college;

public class Student {
    public void print() {
        System.out.println("Collge Student");
    }
}

class Teacher {

    void print() {
        Student st = new Student();
        st.print();
    }
}
