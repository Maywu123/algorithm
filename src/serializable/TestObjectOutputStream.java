package serializable;

import java.io.*;

public class TestObjectOutputStream {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
        writeObj();
        readObj();

    }

    public static void writeObj() throws FileNotFoundException,IOException{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(new Person("lisi",30));
        oos.close();

    }

    public static void readObj() throws FileNotFoundException,IOException,ClassNotFoundException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        Object o=ois.readObject();
        Person p=(Person)o;
        System.out.println(p);

    }

}
