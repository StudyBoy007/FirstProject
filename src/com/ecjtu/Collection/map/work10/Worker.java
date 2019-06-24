package com.ecjtu.Collection.map.work10;

import org.junit.validator.PublicClassValidator;

/**
 * Create by czq
 * time on 2019/6/24  15:47
 */
public class Worker implements Comparable<Worker> {
    public String name;
    public int age;
    public double salary;

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Worker o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            if (this.salary > o.salary) {
                return 1;
            } else if (this.salary < o.salary) {
                return -1;
            } else {
                return this.name.compareTo(o.name);
            }
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
