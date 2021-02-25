package day2;

import java.util.Objects;
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();

        ScientificCalculator sci = new ScientificCalculator();
        sci.addNum(n1 ,n2);
        sci.subNum(n1,n2);
        sci.mulNum(n1,n2);
        sci.divNum(n1,n2);
        sci.remNum(n1,n2);
    }
    public void addNum (int a, int b){
           int sum = a+b;
           System.out.println("Addition:"+sum);
    }

    public void subNum (int a, int b){
        int sub = a-b;
        System.out.println("Subtraction :"+sub);
    }
    public void mulNum (int a, int b){
        int mul = a*b;
        System.out.println("Multiplication:"+mul);
    }
    public void divNum (int a, int b){
        int div = a/b;
        System.out.println("Division:"+div);
    }
    public void remNum (int a, int b){
        int rem= a%b;
        System.out.println("Reminder:"+rem);
    }
}




