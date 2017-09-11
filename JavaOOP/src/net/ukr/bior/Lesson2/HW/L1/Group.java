package net.ukr.bior.Lesson2.HW.L1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Group {
    private Student[] gr=new Student[10];

    public Group() {
    }


    public void toFile(){
        File file = new File("Group.txt");
        BufferedWriter bufferedWriter = null;

        try {
            file.createNewFile();
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i <gr.length ; i++) {
                if (gr[i]==null){
                    continue;
                }
                bufferedWriter.write(gr[i].toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void addToGoroup(Student student) throws OutOfBoundGroupExeption
    {
        if (student==null) throw new NullPointerException();
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
            if (gr[i]==student){
                gr[i]=null;
                break;
            }
        }
    }


    public Student findStudent (String secondName) throws NullPointerException{
        for (int i = 0; i < gr.length; i++) {
            if (gr[i]==null){
                continue;
            }
            if (gr[i].getSecondName().equals(secondName)){
                return gr[i];
            }
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        ArrayList<String> secName = new ArrayList<>();
        for (int i = 0; i < gr.length; i++) {
            if (gr[i]==null){
                continue;
            }
            secName.add(gr[i].getSecondName());
        }
        Collections.sort(secName);
        String temp="";
        for (int i = 0; i < secName.size(); i++) {
            temp += i+" student is - "+ secName.get(i)+"\n";
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
