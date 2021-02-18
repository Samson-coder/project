
import java.util.*;
import java.io.*;
import java.lang.*;
public class Contact{
    public static void main(String[] args){
        Contact c = new Contact();
        System.out.println("Enter contact name/ number/ mail");
        System.out.println("Enter what you want to process");
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if(sc.hasNextLine()){
            if(S=="name"){
                c.Name();
            }
            else if(S=="mail"){
                c.Mail();
            }
            else if(S=="number"){
                c.Number();
            }
            else{
                System.out.println("Enter correct input as per the statement above !: Ex: name");
            }
        }
        else{
            System.out.println("Enter correct input as per the statement above ! Ex: name");
        }
        
    }
        static void Name(){
            System.out.println("Enter name");
        }
        static void Mail(){
            System.out.println("Enter mail");
        }
        static void Number(){
            System.out.println("Enter number");
        }
}
