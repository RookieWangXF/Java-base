package cn.rookie.io.serializable;

import java.io.*;

/**
 * Created by Rookie on 2016/4/20.
 */
public class ReadObj {

    public static void readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\program\\java\\Java-base\\api\\src\\demo1\\resources\\io\\serializable\\obj.object"));
        Person p = (Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }

    public static void writeObj() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\program\\java\\Java-base\\api\\src\\demo1\\resources\\io\\serializable\\obj.object"));
        oos.writeObject(new Person("feifei", 24));
        oos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ReadObj.writeObj();
        ReadObj.readObj();
    }
}
