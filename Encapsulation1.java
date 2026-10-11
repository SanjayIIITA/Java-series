public class Encapsulation1{
    public static void main(String[] args){

        BankAccount ba = new BankAccount();
        // ba.balance = 1000; // cannot access private variable balance

        ba.depositAmount(1000);
        ba.withdrawAmoount(500);

        System.out.println(ba.getBalance()); // can access private variable balance through public method getBalance()


    }
}

class BankAccount{
    private double balance; // private variable, cannot be accessed outside the class
    
    //getter and setter
    public double getBalance(){ // public method to access the private variable
        return balance;
    }

    public void withdrawAmoount(int amount){
        balance -= amount;
    }

    public void depositAmount(int amount){
        balance += amount;
    }
}

class Student{
    private String name;
    private int age;
    private int rollNo;
    private String collegeName;
    // nobody can access these private variable so creating constructor to initialize these private variable
    public Student(String name, int age, int rollNo, String collegeName){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    // now we are creating getter and setter methods to access these private variables
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public String getCollegeName(){
        return collegeName;
    }

    public void setCollegeName(String collegeName){
        // validation can be add should be correct
        this.collegeName = collegeName;
    }
}

//The main reason using getter and setter is we can validations here in setter
//we are adding college so we can't add any clg like abc 