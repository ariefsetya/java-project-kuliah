import java.io.*;

class TulisFile{
	public static void main(String[] a){
		try{
			FileOutputStream out = new FileOutputStream("baru.txt");

			PrintStream p = new PrintStream(out);
			p.println("Arief Setya");
			p.println("Y3H");
			p.println("Pemrograman 3");
			p.println("Unindra");
			p.close();
		}catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}

		System.out.println("Tulis File Berhasil");
	}
}