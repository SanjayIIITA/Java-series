public class Interface2{
    public static void main (String[] args){
        Payment p = new CredittCard();
        // Payment p = new DebitCard();
        p.pay();
    }
}

//Polymorphism
interface Payment{
    void pay(); // bydefault its public and abstract

}

class CredittCard implements Payment{

    @Override
    public void pay(){
        System.out.println("paying by credit card");
    }
}

class DebitCard implements Payment{

    @Override
    public void pay(){
        System.out.println("paying by debit card");
    }
}