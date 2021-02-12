package Spring.com.entity;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class User {

    //@Value("李四")
    private String name;
    //@Value("28")
    private int age;
    //@Value("男")
    private String sex;

    private List list;

    public User() {
    }

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setList(List list) {
        this.list = list;
    }

    public User(String name, int age, String sex, List list) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.list = list;
    }

    public void init(){
        System.out.println("初始化执行。。。");
    }
    public void destroy(){
        System.out.println("销毁执行。。。");
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
