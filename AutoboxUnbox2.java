public class AutoboxUnbox2{
    public static void main(String[] args) {
        
        int a = 10;
        int b = 10;
    //    System.out.println(a==b); // (==) it compare reference

       Integer i = 128; // i = 100;
       Integer j = 128; // 100 will give true because of caching (-128 to 127)


       System.out.println(i == j); // reference are comparing 
       System.out.println(i.equals(j)); // value are comparing

    }
}