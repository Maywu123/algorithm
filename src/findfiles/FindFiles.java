package findfiles;

/**
 * 找到文件夹下所有文件，包括子文件
 */

import java.io.File;
public class FindFiles {
    public static void main(String[] args){
        File file = new File("D:");
        File[] files = file.listFiles();
        readFile(files);
    }

    public static void readFile(File[] files){
        if(files == null){
            return;
        }

        for(File f : files){
            if(f.isFile()){
                System.out.println(f.getName());
            }
            else if(f.isDirectory()){
                readFile(f.listFiles());
            }
        }
    }

}
