package com.example.demo.Student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String emailid;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, String emailid, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String emailid, LocalDate dob, Integer age) {
        this.name = name;
        this.emailid = emailid;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
