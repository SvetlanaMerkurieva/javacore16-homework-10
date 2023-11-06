package src.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FromJson {
    public static void main(String[] args) {
        String json = "{\n" +
                "  \"name\": \"alice\",\n" +
                "  \"age\": 21\n" +
                "}";
        User user = new Gson().fromJson(json, User.class);
        System.out.println(user.getAge());
        System.out.println(user.getName());
    }
}
