//Anonymous CLass
public class AnonymousClass {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.intro();

        // Person p2 = new Person();
        // p2.intro();

        Person p2 = new Person(){
            String name = "ABC";
            @Override
            void intro(){
                greet();
                System.out.println("Hello i am " + name );
            }

            void greet(){
                System.out.println("Hello");
            }
        };
        p2.intro();// I can only override method here bcz p2 is person type reference variable 
        // p2.greet();// I can not call directly
    }
    
}

class Person{
    void intro(){
        System.out.println("Hello I am person");
    }
}

// class Guest extends Person{
    
//     @Override
//     void intro(){
//         System.out.println("Hello i am Guest");
//     }
// }

// No constructor present in anonymous class
//Anonymous class replace with ----> lamdas 