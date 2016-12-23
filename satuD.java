import java.util.*;

public class satuD
{

    public static void main(String[] ar){
        Scanner f = new Scanner(System.in);
        
        System.out.print("Jumlah data :"); int jd = f.nextInt();
        
        int x[] = new int[jd];
        int jum=0;
        
        for(int a=0;a<jd;a++){
            System.out.print("Data ke-"+(a+1)+" : "); x[a] = f.nextInt();
            jum=jum+x[a];
        }
        
        double rata=(double)jum/jd;
        
        System.out.print("Rata-rata : "+rata);
    }
}
