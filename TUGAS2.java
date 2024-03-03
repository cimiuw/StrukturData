import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class tugas2 {
    public static void main(String[] args) {
        // Soal Array
        // 1. Buat array 1 dimensi dengan 8 tipe data primitif dan berikan nilai setiap array tersebut
        int a[] = {1, 2, 3, 4};
        byte b [] = {5, 6, 7, 8};
        short c [] = {9, 10, 11, 12};
        long d [] = {100, 45, 77, 30};
        float e [] = {3.4f, 3.3f, 7.1f, 4.2f};
        double f [] = {4.6, 8.9, 2.4, 6.1};
        char g [] = {'w', 'a', 'n', 'a'};
        boolean h [] = {false, true, false, true};
        
        // 2. Buat array 1 dimensi bertipe data primitif apapun dan berikan nilai kemudian cetak dengan 5 metode mencetak isi array
        int nilai[] = {98, 87, 96, 83};
        
        // Mencetak isi Array menggunakan for
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }
        
        // Mencetak isi Array menggunakan for-each
        for (int i : nilai) {
            System.out.println(i);
        }
        // Mencetak isi Array menggunakan kelas Arrays
        System.out.println(Arrays.toString(nilai));
        
        // Mencetak isi Array menggunakan do-while
        int w = 0;
        do{
            System.out.println(nilai[w]);
            w++;
        }while(w<nilai.length);
        
        // Mencetak isi Array menggunakan while
        int i = 0;
        while(i<nilai.length){
            System.out.println(nilai[i]);
            i++;
        }
        
        // 3. Buat Array 2 dimensi dan lakukan input nilai menggunakan keyboard dan cetak isi array tersebut
        Scanner input = new Scanner (System.in);
        int nilai1[][] = new int[2][2];
        
        for (int j = 0; j < nilai1.length; j++) {
            for (int k = 0; k < nilai1[j].length; k++) {
                System.out.print("Masukkan nilai: ");
                nilai1[j][k] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(nilai1));
        
        // Soal ArrayList
        // 1. Buat ArrayList dengan tipe data wrapper dan berikan nilai dan cetak isi ArrayList
        ArrayList<Integer> wi = new ArrayList<>();
        wi.add(1);
        wi.add(5);
        wi.add(8);
        wi.add(30);
         System.out.println(wi);
         
         // 2. Buat ArrayList bertipe data Integer 
         ArrayList<Integer> di = new ArrayList<>();
         di.add(1);
         di.add(90);
         di.add(8);
         di.add(30);
        
         System.out.println("Isi ArrayList: " + di);
         System.out.println("Indeks ke 3: " + di.get(3));
         di.set(1, 7);
         System.out.println("Setelah indeks ke 1 diganti: " + di);
         di.remove(3);
         System.out.println("Setelah indek ke 3 dihapus: " + di);
         System.out.println("Ukuran ArrayList: " + di);
           
}
}
