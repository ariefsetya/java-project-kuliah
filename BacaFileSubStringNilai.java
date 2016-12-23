import java.io.*;

public class BacaFileSubStringNilai{

	public static void main(String[] ar){

		int x = 0;
		double nilaitugas = 0;
		double nilaiuts = 0;
		double nilaiuas = 0;
		double nilaiakhir = 0;
		try{
			FileInputStream fstream = new FileInputStream("nilai");
			DataInputStream dataInput = new DataInputStream(fstream);

			System.out.println("---------------------------------------------------------");
			System.out.println("    No  Tugas  UTS    UAS     NA    Huruf  Keterangan    ");
			System.out.println("---------------------------------------------------------");
			
			while(dataInput.available() != 0){
				x++;
				String data = dataInput.readLine();
				String datatugas = data.substring(1,3);
				nilaitugas+=Double.valueOf(datatugas);
				String datauts = data.substring(5,7);
				nilaiuts+=Double.valueOf(datauts);
				String datauas = data.substring(10,12);
				nilaiuas+=Double.valueOf(datauas);
				Double dataakhir = ((Double.valueOf(datatugas)*20)/100)+
									((Double.valueOf(datauts)*30)/100)+
									((Double.valueOf(datauas)*50)/100);
				nilaiakhir+=dataakhir;
				String huruf = "A";
				if(dataakhir<60){
					huruf = "E";
				}else if(dataakhir<70){
					huruf = "D";
				}else if(dataakhir<60){
					huruf = "E";
				}else if(dataakhir<80){
					huruf = "B";
				}

				String keterangan = "Lulus";
				if(dataakhir<60){
					keterangan = "Gagal";
				}

				System.out.printf("    %d    %d     %d     %d   %.2f     %s      %s   ",x,Integer.valueOf(datatugas),Integer.valueOf(datauts),Integer.valueOf(datauas),dataakhir,huruf,keterangan);
				System.out.println();
			}
			dataInput.close();


				String huruf = "A";
				if(nilaiakhir/x<60){
					huruf = "E";
				}else if(nilaiakhir/x<70){
					huruf = "D";
				}else if(nilaiakhir/x<60){
					huruf = "E";
				}else if(nilaiakhir/x<80){
					huruf = "B";
				}


			System.out.println("---------------------------------------------------------");
			System.out.println("                        Rata-rata                        ");
			System.out.println("---------------------------------------------------------");

			System.out.printf("    %s  %.2f  %.2f  %.2f  %.2f     %s      %s   "," ",nilaitugas/x,nilaiuts/x,nilaiuas/x,nilaiakhir/x,huruf,"");
			System.out.println();
			System.out.println("---------------------------------------------------------");

			// System.out.printf("Harga Rata-rata : %.2f",(/x));
		}catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}
	}
}