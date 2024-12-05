import java.io.*;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        File f = new File("score");
        Reader r = null;
        try {
            r = new FileReader(f);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        if(r!=null) {
            BufferedReader bf = new BufferedReader(r);
            try {
                String line = bf.readLine();
                while ((line = bf.readLine())!=null){
                    String[] strs = line.split("#");
                    int cnt=0;
                    int totalScore=0;
                    for(String str:strs){
                        if(cnt==0){
                            cnt++;
                            continue;
                        }
                        else {
                            totalScore+=Integer.parseInt(str);
                        }
                    }
                    System.out.println(totalScore);
                }
                bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}