public class Tugas {
    String judul;
    boolean status; // status jika tugasnya selesai atau tidak
    int estimasiJam;

    public Tugas(String judul, int estimasiJam) { // penggunaan this untuk membedakan variabel kelas
        this.judul = judul;
        this.estimasiJam = estimasiJam;
        this.status = false;
    }

    public void selesaikanTugas() {
        this.status = true;
    }
}