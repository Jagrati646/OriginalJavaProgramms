package day3;

public class StringExample {


    public static void main(String[] args) {
        String var="MyJava";
        System.out.println(var.charAt(2));
        char[] val=var.toCharArray();
        for(int i=val.length-1;i>=0;i--){
            System.out.println(val[i]);
        }

    }
}
