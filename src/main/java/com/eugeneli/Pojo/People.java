package com.eugeneli.Pojo;

/**
 * @ClassName: People
 * @Description:
 * @Author EugeneLi
 * @Date: 2021/10/16
 * @Time: 15:32
 */
public class People {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void hotFixTest() {
        System.out.println("hot-fix");
        System.out.println("hot-fix2");
    }
    public void test(){
        System.out.println("111");
        System.out.println("222");
    }
}
