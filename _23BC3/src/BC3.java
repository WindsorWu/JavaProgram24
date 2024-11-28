import java.io.*;
import java.util.Objects;

public class BC3 {
    public static void main(String[] args) {
        String filePath = "source.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            //请在此添加代码
            String line = reader.readLine();
            int count =  0;
            int countY = 0;
            int countN = 0;
            while((line = reader.readLine()) != null) {
                ++count;
                String[] strs = line.split("\\t");
                System.out.println(strs[0]);
                if(Objects.equals(strs[0], "Y")){
                    countY++;
                }
                else {
                    countN++;
                }

            }
            System.out.println("单位共有"+count+"人");
            System.out.println("已接种疫苗"+countY+"人"+"，"+"未接种疫苗"+countN+"人");











        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
