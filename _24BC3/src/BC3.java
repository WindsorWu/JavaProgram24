import java.io.*;
public class BC3 {
	public static void main(String[] args) {
		String filePath = "foodinfo.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			//���ڴ���Ӵ���
			String line = reader.readLine(); //����ܵ���ȡ�ļ�
			System.out.println("ʳ��,ÿ100����Ԫ�غ���(����)");
			double max = 0.0;
			String maxName = "";
			while((line = reader.readLine()) != null){
				String[] strs = line.split(","); //�ļ����ݵ�������
				int weight = Integer.parseInt(strs[2]);
				double feWeight = Double.parseDouble(strs[3]);
				double feWeightPer100= feWeight / weight * 100;
				System.out.println(strs[0] + "," + feWeightPer100);
				if(feWeightPer100>max){ //��̨������ֵ
					max = feWeightPer100;
					maxName = strs[0];//���ָ���
				}
			}
			System.out.println("��λ������������ߵ�ʳ����" + maxName + "," + "ÿ100�˺���" + max + "��������");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
