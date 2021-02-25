package day2;

public class LogicalOperator {


    public static void main(String [] args) {

 System.out.println(10==90);
 System.out.println("Jagrati"=="Jagrati");

 System.out.println(20!=40);

 int age= 13;
 boolean reg= true;

 if(age>=18|| reg== true){

     System.out.println("You can vote");
 }
        if(age>=18 && reg== true){

            System.out.println("You can vote");
        }
    }
}
