public class TestEqual {
    public static void main(String[] args) {
        String s1 = new String("Hello"); // creates new object in Heap
        String s2 = new String("Hello"); //creates another new object in Heap
        String s3 = "Hello"; // stored in String Pool
        String s4 = "Hello"; // Java finds "Hello" already exists → reuses it 
        
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true - compares content, both have "Hello"
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3 == s4); // true - both point to same object in String Pool
        
    }
}

/*
Heap:
┌──────────────────────────────┐
│  String Pool                 │
│  ┌─────────┐                 │
│  │ "Hello" │ ← s3, s4        │  ← same object!
│  └─────────┘                 │
│                              │
│  ┌─────────┐                 │
│  │ "Hello" │ ← s1 (new)      │  ← separate object
│  └─────────┘                 │
│  ┌─────────┐                 │
│  │ "Hello" │ ← s2 (new)      │  ← separate object
│  └─────────┘                 │
└──────────────────────────────┘

*/