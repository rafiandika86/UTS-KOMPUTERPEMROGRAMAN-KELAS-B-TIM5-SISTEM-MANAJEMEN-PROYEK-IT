import java.util.ArrayList;
import java.util.List;

public class Developer {
    String nama;
    List<Tugas> daftarTugas;

    public Developer(String nama) {
        this.nama = nama;
        this.daftarTugas = new ArrayList<>();
    }

    public void tambahTugas(Tugas t) {
        daftarTugas.add(t);
    }

    public int hitungTotalJam() {
        int total = 0;
        for (Tugas t : daftarTugas) {
            total += t.estimasiJam;
        }
        return total;
    }

    public double progress() { 
        if (daftarTugas.isEmpty()) return 0; // jika tugasnya kosong maka program berhenti
        int selesai = 0;
        for (Tugas t : daftarTugas) {
            if (t.status) selesai++;
        }
        return (double) selesai / daftarTugas.size() * 100;
    }
}