package src.json;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", age: " + age + "}";
    }
}
