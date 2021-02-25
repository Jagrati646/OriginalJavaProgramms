package day2;

public class Cars {
         public Cars(){
        System.out.println("I am a default constructor");

    }
    public Cars(String Colours){
        System.out.println("I am a par constructor");
         }
   public Cars(int doors){
        System.out.println("I am a par constructor");
    }

    public static void main(String[] args) {
        Cars car=new Cars();
    }




}
