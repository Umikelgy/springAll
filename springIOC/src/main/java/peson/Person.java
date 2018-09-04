package peson;
/*
 *@author LgyTT@alog.com
 *@date 2018/8/6 14:14
 */

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> car;

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

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public Person() {
    }

    public Person(String name, int age, List<Car> car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }
}
