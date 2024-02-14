// public class IncrementOperator {
//     public static void main(String[] args) {
//         //* */ increment 
//         int a=10;
//         System.out.println(a);
//         System.out.println(a++); // 
//         System.out.println(++a); // 

//         System.out.println(a--); //
//         System.out.println(--a); //
//         System.out.println(a);
//     }
// }

// public class IncrementOperator {

//     public static void main(String[] args) {
//         int a=5;
//         //System.out.println(++a);
//         //System.out.println(++a-++a); // -1
//         System.out.println(a++-a);
//     }
// }

public class IncrementOperator {

    public static void main(String[] args) {
        int a=5;
        System.out.println((--a+--a*(++a-a--)+(--a+a--)*(++a+a--))); // how 
    }
}