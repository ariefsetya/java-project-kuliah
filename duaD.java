import java.util.*;

public class duaD
{

    public static void main(String[] ar){
        
        Scanner f = new Scanner(System.in);
        System.out.print
        System.out.print("Jumlah data :"); int jd = f.nextInt();
        
        String x[][] = new String[jd][3];
        int jum=0;
        
        for(int a=0;a<jd;a++){
            System.out.print("NPM ke-"+(a+1)+" : "); x[a][0] = f.next();
            System.out.print("Nama ke-"+(a+1)+" : "); x[a][1] = f.next();
            System.out.print("Alamat ke-"+(a+1)+" : "); x[a][2] = f.next();
        }
        
        System.out.println("------------------------------------------"); 
        System.out.println("NPM\tNama\tAlamat"); 
        System.out.println("------------------------------------------"); 
        for(int a=0;a<jd;a++){
            for(int b=0;b<3;b++){
                System.out.print(x[a][b]+"\t"); 
            }
            System.out.println(); 
        }
        System.out.println("------------------------------------------"); 
        
    }
}
