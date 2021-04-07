package br.com.todolist.domain;

import javax.persistence.*;

@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "task_name", nullable = false)
    private String tasName;

    public void setTasName(String tasName) {
        this.tasName = tasName;
    }

    public String getTasName() {
        return tasName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", tasName='" + tasName + '\'' +
                '}';
    }
}
