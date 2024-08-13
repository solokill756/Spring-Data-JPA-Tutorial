package com.example.demo.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Table(
        name = "students",
        uniqueConstraints = {
            @UniqueConstraint(name = "student_email", columnNames = "email")

        }
)
@Entity
public class Students {

    @Id
    private int id;
    private String name;
    private String address;
    private String phone;
    private int sex;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "Text"
    )
    private String email;
    @Column(
            name = "password",
            nullable = false
    )
    private String password;
    private int group_id;
    private int age;
    private String bankNumber;

    public Students() {
    }

    public Students(int id, String name, String address, String phone, int sex, String email, String password,
            int group_id, int age, String bankNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        this.email = email;
        this.password = password;
        this.group_id = group_id;
        this.age = age;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }
}
