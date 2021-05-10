package com.dongho.dev.stream;

import java.io.*;

class Wallet implements Serializable {
    private static final long serialVersionUID = -2676497815333212456L;

    private int money;

    Wallet(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                '}';
    }
}

class Human implements Serializable {
    private static final long serialVersionUID = -1266330610271333184L;

    private String name;
    private int number;

    private Wallet wallet;

    Human(String name, int number, Wallet wallet) {
        this.name = name;
        this.number = number;
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", wallet=" + wallet +
                '}';
    }
}

public class ObjectStream {

    public static void main(String[] args) {
        String objectFileName = "E:\\Downloads\\object.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectFileName))) {

            Wallet wallet = new Wallet(10000);
            Human human = new Human("human", 1, wallet);

            oos.writeObject(human);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objectFileName))) {
            Human human = Human.class.cast(ois.readObject());

            System.out.println(human);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
