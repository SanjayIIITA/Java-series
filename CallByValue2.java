public class CallByValue2 {
    public static void main(String[] args) {
       Random r1 = new Random(4, 6);

       Random r2 = new Random(r1); // creating a new object r2 with the same values as r1 is called deep copy,
       // because we are creating a new object with the same values as the original object. If we change the values of r2, it will not affect the values of r1. If we change the values of r1, it will not affect the values of r2. This is called deep copy. 
       //In shallow copy, if we change the values of the original object, it will affect the values of the copied object. In deep copy, if we change the values of the original object, it will not affect the values of the copied object.
        Random r3 = r1;
       System.out.println("Before calling method: " + r1.x + ", " + r1.y);

       Random res = addRandom(r1);

       System.out.println("After calling method: " + res.x + ", " + res.y);
    }


//    static void addRandom(Random r) {
//     r.x = r.x + 4;
//     r.y = r.y + 7;
//     System.out.println("Inside method: " + r.x + ", " + r.y);
//     // Output: Inside method: 8, 13
//    }
    static Random addRandom(Random r) {
    r.x = r.x + 4;
    r.y = r.y + 7;
    System.out.println("Inside method: " + r.x + ", " + r.y);
    return r; // returning the modified object
    // Output: Inside method: 8, 13
   }
}

class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Random(Random r) {
        this.x = r.x;
        this.y = r.y;
    }
}