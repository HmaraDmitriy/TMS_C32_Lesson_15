package com.teachmeskills.lesson_15.task_4.group;

import java.util.Objects;

public class Members {

    private String name ;
    private int id ;
    private String sex;
    private String status;

    public Members(String name, int id, String sex, String status) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, sex, status);
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

