package org.example;

import java.io.*;

class SBOX implements Serializable {
    private String name;
    private int age;

    public SBOX(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SBOX{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main8 {

    public static void main(String[] args) {
        SBOX sbox = new SBOX("감자", 20);
        SBOX sbox2 = new SBOX("고구마", 25);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.bin"))) {
            oos.writeObject(sbox);
            oos.writeObject(sbox2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.bin"))) {
            SBOX obj = (SBOX) ois.readObject();
            SBOX obj2 = (SBOX) ois.readObject();
            System.out.println(obj);
            System.out.println(obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
