package Metthod;

public class userName {

    void UserName(String Email){
        int a = Email.indexOf("@");
        String name = Email.substring(0, a);
        String domain = Email.substring(a + 1 , Email.length());
        System.out.println("Name is : " + name);
        System.out.println("domain is : " + domain);
        
    }
    public static void main(String[] args) {
        userName u = new userName();

        String Email = "ahmadFaiz8720@gmail.com";

        u.UserName(Email);
    }
}
