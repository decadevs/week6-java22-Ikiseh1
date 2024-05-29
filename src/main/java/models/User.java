package models;

import enumm.Role;

public class User {
    private String name;
    private int age;
    private Role role;

    public User(String name, int age, Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }
}
