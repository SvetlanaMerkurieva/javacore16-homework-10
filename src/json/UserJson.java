package src.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserJson {
    public static void main(String[] args) throws IOException {
        ArrayList<String> users = new ArrayList<>();
        try (FileReader file = new FileReader(".\\files\\file2.txt")) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                users.add(scanner.nextLine());
            }
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
        OutputStream file = new FileOutputStream(".\\files\\user.json");
        ObjectOutputStream obj = new ObjectOutputStream(file);
        for (int i = 1; i <users.size(); i++) {
            User user = new User();
            String[] items = users.get(i).split(" ");
            user.setName(items[0]);
            user.setAge(Integer.parseInt(items[1]));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(user);
            System.out.println(json);
            obj.writeObject(json);
            obj.flush();
        }
        file.close();
    }
}
