package 反射;

public class Persion {
    private String name;
    private int age;
    public String add;


    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("eat>>>>>");
    }

    public void eat2(String name) {
        System.out.println("eat>>>>>" + name);
    }
}
