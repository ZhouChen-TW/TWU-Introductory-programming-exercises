import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzhou on 7/21/16.
 */
public class IntroductoryExercises {

    public static void EasiestExerciseEver(){
        System.out.print("*");
    }

    public static void DrawAhorizontalLine(int n){
        for(int i = 0;i < n;i++){
            System.out.print("*");
        }
    }

    public static void DrawAverticalLine(int n){
        for (int i = 0;i < n;i++){
            System.out.println("*");
        }
    }

    public static void DrawArightTriangle(int n){
        for (int i = 1;i < n+1;i++){
            for(int k = 0;k< i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void IsoscelesTriangle(int n){
        for(int i = 1;i<n+1;i++){
            for(int j = i;j< n;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Diamond(int n){
        for (int i = 1; i < n+1; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n ; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void DiamondwithName(int n,String name){
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println(name);
        for (int i = n-1 ; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void FizzBuzz(){
        for (int i = 1;i<101;i++){
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(Integer.toString(i));
            }
        }
    }

    public static List<Integer> Generate(int n){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i=2;i<=n;i++) {
            while (n % i==0) {
                numbers.add(i);
                n = n / i;
            }
        }
        if(n>1)numbers.add(n);
        return numbers;
    }

    public static void main(String[] args){
        //EasiestExerciseEver();
        //DrawAhorizontalLine(8);
        //DrawAverticalLine(3);
        //DrawArightTriangle(3);

        //IsoscelesTriangle(3);
        //Diamond(3);
        //DiamondwithName(3,"Bill");

        //FizzBuzz();

        List<Integer> number = Generate(1);
        System.out.println(number);

        List<Integer> numbers = Generate(30);
        System.out.println(numbers);

        List<Integer> numberstwo = Generate(70);
        System.out.println(numberstwo);
    }
}
