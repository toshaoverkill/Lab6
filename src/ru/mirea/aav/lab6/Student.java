package ru.mirea.aav.lab6;
public class Student  {
    private String name;
    private int SUM;
    public Student(String name, int SUM){
        this.name = name;
        this.SUM = SUM;
    }
    public int getSUM() { return SUM; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
    public void setSUM(int SUM) { this.SUM = SUM; }
}
