
//Create a program which will take input from users for registration and save the info to a json file. The system will require following user info:
//Full Name, email, password, address, mobile no.

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner (System.in);
        JSONObject jsonobject=new JSONObject();
        System.out.println("Enter your Full name: ");
        jsonobject.put("name",scanner.next());


        System.out.println("Enter your email: ");
        jsonobject.put("email",scanner.next());

        System.out.println("Enter your password: ");
        jsonobject.put("password",scanner.next());

        System.out.println("Enter your address: ");
        jsonobject.put("address",scanner.next());

        System.out.println("Enter your mobile no.: ");
        jsonobject.put("mobile no.",scanner.next());


        System.out.println(jsonobject);

        FileWriter file = new FileWriter ("./src/main/resources/Employee.json");
        file.write(jsonobject.toJSONString());
        file.flush();
        file.close();
    }




    }

