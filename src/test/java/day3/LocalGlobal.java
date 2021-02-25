package day3;

public class LocalGlobal {
    String city = "Bangalore";

    public void studentDetails(String name, float per) {
        String State = "Kar";
        System.out.println(" Student name is " + name);
        System.out.println(name + " has secured " + per);
        System.out.println(name + " is from " + city);
        System.out.println(name + " is from " + State);

    }

    public static void main(String[] args) {
        LocalGlobal lg=new LocalGlobal();
        lg.studentDetails("Jagrati",44.9f);


    }
}


