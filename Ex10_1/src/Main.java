import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("text.txt");
        if(f.exists())
            System.out.println(f.getName() + " " + "文件存在");
        else {
            System.out.println(f.getName() + " " + "文件不存在");
            try {
                f.createNewFile();
            }
            catch (IOException e){
                System.out.println("创建文件异常");
                e.printStackTrace();
            }
        }
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.getClass());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.length());

        System.out.println();

        File f2 = new File("src","Main.java");
        if(f2.exists()){
            System.out.println(f2.getName() + " " + "文件存在");
            System.out.println("文件的路径：" + f2.getAbsolutePath());
        }
        else
            System.out.println(f2.getName() + " " + "文件不存在");

        System.out.println(f2.canRead());
        System.out.println(f2.canWrite());
        System.out.println(f2.canExecute());
        System.out.println(f2.getClass());
        System.out.println(f2.getParent());
        System.out.println(f2.getPath());
        System.out.println(f2.length());

        System.out.println();

        File f3 = new File("DIR");
        if(f3.mkdir())
            System.out.println("目录创建成功");
        else
            System.out.println("目录创建不成功");

        String[] filenames = f3.list();
        if (filenames != null)
            for (String item : filenames)
                System.out.println("-" + item);

        System.out.println();

        FileFilter fileFilter = new FileFilter(".txt");
        String[] filteredFileNames = f3.list(fileFilter);
        if (filteredFileNames != null)
            for (String item : filteredFileNames)
                System.out.println("-" + item);
    }
}