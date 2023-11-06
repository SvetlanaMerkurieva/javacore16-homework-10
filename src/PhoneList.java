package src;

import java.io.*;
import java.util.*;

public class PhoneList {
    public static void main(String[] args) {
        ArrayList<String> phones = new ArrayList<>();
        try (FileReader file = new FileReader(".\\files\\file1.txt")) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    phones.add(scanner.nextLine());
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<String> phoneList = new ArrayList<>();

        for (String phone: phones) {
            String phoneCode = "";
            for (int i = 0; i < phone.length(); i++) {
                switch (phone.charAt(i)) {
                    case '(':
                        phoneCode += "(";
                        break;
                    case ')':
                        phoneCode += ")";
                        break;
                    case '-':
                        phoneCode += "-";
                        break;
                    case ' ':
                        phoneCode += " ";
                        break;
                    case '0':
                        phoneCode += "X";
                        break;
                    case '1':
                        phoneCode += "X";
                        break;
                    case '2':
                        phoneCode += "X";
                        break;
                    case '3':
                        phoneCode += "X";
                        break;
                    case '4':
                        phoneCode += "X";
                        break;
                    case '5':
                        phoneCode += "X";
                        break;
                    case '6':
                        phoneCode += "X";
                        break;
                    case '7':
                        phoneCode += "X";
                        break;
                    case '8':
                        phoneCode += "X";
                        break;
                    case '9':
                        phoneCode += "X";
                        break;
                }
            }
            if (phoneCode.equals("(XXX) XXX-XXXX") || phoneCode.equals("XXX-XXX-XXXX")) {
                phoneList.add(phone);
            }

        }
        for (String phoneNumber: phoneList) {
            System.out.println(phoneNumber);
        }
    }
}
