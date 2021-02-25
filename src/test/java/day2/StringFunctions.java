package day2;

import java.util.Locale;

public class StringFunctions {

    public static void main(String[] args) {

        String name = " Jagrati Tiwari ";
        System.out.println("String Count:"+name.length());
        System.out.println("String uppercase:"+name.toUpperCase());
        System.out.println("String lowercase:"+name.toLowerCase());
        System.out.println("Get Single Value:"+name.charAt(6));
        System.out.println(name.replace("a","C"));
        System.out.println("Contains:"+name.contains("GRA"));
        System.out.println("Equals:"+name.equals("JagratiTiwari"));
        System.out.println("Equal Ignore case:"+name.equalsIgnoreCase("jAgRaTiTiWaRi"));
        System.out.println(name=="JagratiTiwari");
        System.out.println("Starts With:"+name.startsWith("JAG"));
        System.out.println("Ends With:"+name.endsWith("ari"));
        System.out.println("Trim:"+name.trim());
        System.out.println("Count with space:"+name.length());
        System.out.println("Trim :"+name.trim().length());



    }








}
