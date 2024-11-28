import java.io.*;
public class BC3 {
	public static void main(String[] args) {
		String filePath = "foodinfo.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			//请在此添加代码
			String line = reader.readLine(); //构造管道读取文件
			System.out.println("食物,每100克铁元素含量(毫克)");
			double max = 0.0;
			String maxName = "";
			while((line = reader.readLine()) != null){
				String[] strs = line.split(","); //文件内容导入数组
				int weight = Integer.parseInt(strs[2]);
				double feWeight = Double.parseDouble(strs[3]);
				double feWeightPer100= feWeight / weight * 100;
				System.out.println(strs[0] + "," + feWeightPer100);
				if(feWeightPer100>max){ //擂台法求最值
					max = feWeightPer100;
					maxName = strs[0];//名字更新
				}
			}
			System.out.println("单位重量含铁量最高的食物是" + maxName + "," + "每100克含有" + max + "毫克铁。");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
