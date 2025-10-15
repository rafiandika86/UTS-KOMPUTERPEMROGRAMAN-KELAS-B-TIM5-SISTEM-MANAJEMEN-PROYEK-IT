import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama proyek: ");
        String namaProyek = input.nextLine();

        System.out.print("Masukkan jumlah developer: ");
        int jumlahDev = input.nextInt();
        input.nextLine();

        List<Developer> tim = new ArrayList<>();

        for (int i = 0; i < jumlahDev; i++) {
            System.out.print("\nNama developer ke-" + (i + 1) + ": ");
            String namaDev = input.nextLine();
            Developer dev = new Developer(namaDev);

            System.out.print("Berapa jumlah tugas untuk " + namaDev + "? ");
            int jumlahTugas = input.nextInt();
            input.nextLine();

            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Judul tugas ke-" + (j + 1) + ": ");
                String judul = input.nextLine();

                System.out.print("Estimasi jam: ");
                int jam = input.nextInt();
                input.nextLine();

                Tugas tugas = new Tugas(judul, jam);

                System.out.print("Apakah tugas ini sudah selesai? (y/n): ");
                String selesai = input.nextLine();
                if (selesai.equalsIgnoreCase("y")) {
                    tugas.selesaikanTugas();
                }

                dev.tambahTugas(tugas);
            }

            tim.add(dev);
        }

        Proyek proyek = new Proyek(namaProyek, tim);
        proyek.tampilkanStatusProyek();

        // untuk mencari developer yang paling produktif 
        Developer produktif = tim.get(0);
        for (Developer d : tim) {
            if (d.progress() > produktif.progress()) {
                produktif = d;
            }
        }

        System.out.println("Developer paling produktif adalah: " + produktif.nama + 
                           " dengan progress " + produktif.progress() + "%" + " Selamat ya :D");

        input.close();
    }
}