public class AutoboxUnboxing{
    public static void main(String[] args) {
        // int a = 10;
        // Integer i = a; // Autoboxing
        // // Integer i = Integer.valueOf(a); optional
        
        // // Integer j = new Integer(a);
        // System.out.println(a);
        // System.out.println(i); // unboxing i is automatic converting into primitive i

        // System.out.println(i.intValue()); // i is reference variable and we don't print ref variable,
        // // it is pointing to some memory location so compiler is automatic converting it internally

        // Integer c = Integer.valueOf(i); // i is 

        // // Unboxing

        // // Integer x = new Integer(50);
        // Integer x = 50; //Autoboxing x automatically converting into object
        // int b = x; // unboxing x is automatically converting in primitive x.intValue

        // System.out.println(x); // x.intValue 
        // System.out.println(b);

        int x= 50;
        printInteger(x);

        Integer s = 10;
        Integer d = 20;

        int sum = s.intValue() + d.intValue(); // unboxing s and d then adding
        System.out.println(sum);

        Integer v = null;
        int n = v.intValue(); // null pointiner exception
        System.out.println(n);
    }

    // static void printInteger(int x){
    //     System.out.println(x);
    // }

    static void printInteger(Integer a) {
        System.out.println(a);
    }

}

// Assignments
//Method call
// Assignment