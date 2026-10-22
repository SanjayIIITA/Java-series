public class InterfaceInheritance{
    public static void main(String[] args) {
        
    }
}

interface A{
 void fun();
}

interface B {
    void fun2();

}

class C implements A, B {
    @Override
    public void fun(){
        System.out.println("FUn");
    }

    @Override
    public void fun2(){
        System.out.println("Fun2");
    }
}


//InterFace Inheritance

interface Animal{
    void sound();
}

interface Dog extends Animal{ // adding more funcationality so extend
    void food();
}

class StreetDog implements Dog{
    @Override
    public void sound() {
        System.out.println("Barking");
    }

    @Override
    public void food() {
        System.out.println("Pedigree");
    }
}