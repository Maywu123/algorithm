package xuliehua;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestPair {
    @Test
    public void writeData() throws IOException {
        FileOutputStream fos=new FileOutputStream("pair.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeInt(100);
        oos.writeBoolean(false);
        oos.writeUTF("writting a string");
        Pair pair=new Pair(13,"haha");
        oos.writeObject(pair);

        oos.flush();
        oos.close();
        fos.close();
    }

    @Test
    public void readData() throws IOException,ClassNotFoundException{
        FileInputStream fis=new FileInputStream("pair.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        int number=ois.readInt();
        boolean bool=ois.readBoolean();
        String string=ois.readUTF();

        Pair pair=(Pair) ois.readObject();

        assertEquals(100,number);
        assertFalse(bool);
        assertEquals("writting a string",string);
        assertEquals(13,pair.getNumber());
        assertEquals("haha",pair.getName());
    }
}
