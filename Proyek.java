import java.util.List;

public class Proyek {
    String namaProyek;
    List<Developer> tim;

    public Proyek(String namaProyek, List<Developer> tim) { // membuat urutan nama proyek
        this.namaProyek = namaProyek;
        this.tim = tim;
    }

    public void tampilkanStatusProyek() {
        System.out.println();
        System.out.println("=+= Status Proyek: " + namaProyek + " =+=");
        for (Developer d : tim) {
            System.out.println("Developer: " + d.nama);
            System.out.println("Total Estimasi Jam: " + d.hitungTotalJam());
            System.out.println("Progress: " + d.progress() + "%");
            System.out.println("--------------------------");
        }
    }
}