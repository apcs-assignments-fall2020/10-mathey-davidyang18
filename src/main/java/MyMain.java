import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        int [] my_num = new int[3];
        for (int i = 0; i < my_num.length; i++) {
            int num = (int) (Math.random() * (20 - 10 + 1) + 10);
            return num;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print(someMethod());
    }

}


