package net.ukr.bior.Lesson2.HW.L1;

import java.util.Arrays;

public class Group {
    private Student[] gr=new Student[10];

    public Group() {
    }

    public Group(Student[] gr) {
        this.gr = gr;
    }


    public void addToGoroup(Student student) throws OutOfBoundGroupExeption{
        int test=0;
        for (int i = 0; i < gr.length; i++) {
            if (gr[i]==null){
                gr[i]=student;
                test=1;
                break;
            }
        }
        if (test==0) throw  new OutOfBoundGroupExeption();

    }

    public void delFromGroup(Student student){
        for (int i = 0; i < gr.length; i++) {
            if (gr[i].equals(student)){
                gr[i]=null;
                break;
            }
        }
    }


    public Student findStudent (String secondName){
        for (int i = 0; i < gr.length; i++) {
            if (gr[i].getSecondName().equals(secondName)){
                return gr[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String[] secName= new String[gr.length];
        for (int i = 0; i < gr.length; i++) {
            secName[i]=gr[i].getSecondName();
        }
        Arrays.sort(secName);
        String temp="";
        for (int i = 0; i < secName.length; i++) {
            temp += i+" student is - "+ secName[i]+"\n";
        }


        return temp;
    }

    public Student[] getGr() {
        return gr;
    }

    public void setGr(Student[] gr) {
        this.gr = gr;
    }
}
