import java.io.*;

public class BacaFile{

	public static void main(String[] ar){
		try{
			FileInputStream fstream = new FileInputStream("dataku");
			DataInputStream dataInput = new DataInputStream(fstream);

			while(dataInput.available() != 0){
				String data = dataInput.readLine();
				System.out.println(data);
			}
			dataInput.close();
		}catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}
	}
}