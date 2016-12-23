import java.io.*;

public class BacaFileHarga{

	public static void main(String[] ar){

		int x = 0;
		double total = 0;
		try{
			FileInputStream fstream = new FileInputStream("harga");
			DataInputStream dataInput = new DataInputStream(fstream);

			while(dataInput.available() != 0){
				x++;
				String data = dataInput.readLine();
				total+=Double.valueOf(data);
				System.out.println("Harga hari ke-"+x+" : "+data);
			}
			dataInput.close();

			System.out.printf("Harga Rata-rata : %.2f",(total/x));
		}catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}
	}
}