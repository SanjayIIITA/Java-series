public class ImmutableClass2 {
    public static void main(String[] args) {

        College college = new College("IIT A", "Allahabad");
        Student s1 = new Student(28, "Sanjay", college);

        System.out.println(s1.getCollege().name); // IIT A

        // Trying to modify college via getCollege() reference
        s1.getCollege().name = "IIT B";
        // getCollege() now returns a NEW College object (defensive copy)
        // so modifying it does NOT affect the original college inside Student
        System.out.println(s1.getCollege().name); // still IIT A → immutability preserved ✅
    }
}

/*
 * Immutable Class:
 * - A class whose state cannot be changed after the object is created
 * - Example from Java: String, Integer, LocalDate
 *
 * Problem with mutable fields (like College):
 * - even if field is private final, returning its reference allows caller to modify it
 * - s1.getCollege().name = "IIT B" → modifies internal state → breaks immutability
 *
 * Solution: Defensive Copy
 * - create a new copy of mutable object instead of using original reference
 * - apply defensive copy at two places:
 *   1. Constructor  → prevents external object from modifying internal state after creation
 *   2. Getter       → prevents caller from modifying internal state via returned reference
 *
 * Shallow Copy:
 * - copies the object but NOT the nested objects inside it
 * - both original and copied object share the same reference of nested object
 * - modifying nested object in copy will affect the original too
 * - Example: Student s2 = s1 → s2.college and s1.college point to same College object
 *
 * Deep Copy:
 * - copies the object AND all nested objects inside it recursively
 * - original and copied object have completely independent copies of nested objects
 * - modifying nested object in copy will NOT affect the original
 * - Example: new College(college.name, college.address) → creates independent College copy
 * - Defensive Copy is a form of Deep Copy
 *
 * Shallow Copy vs Deep Copy:
 * - Shallow → same reference for nested objects → changes in one affect the other
 * - Deep    → new copy of nested objects       → changes in one do NOT affect the other
 */

// Purely Immutable Student class using Defensive Copy
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        // Defensive copy in constructor
        // creates new College object so external college object changes don't affect Student
        this.college = new College(college.name, college.address);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        // Defensive copy in getter
        // returns new College object so caller cannot modify original college inside Student
        return new College(this.college.name, this.college.address);
    }
}

// Mutable class → has setters and non-final fields
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
