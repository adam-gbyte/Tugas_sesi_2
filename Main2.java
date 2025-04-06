class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    void perkenalkanDiri() {
        System.out.println("Halo, nama saya " + this.nama);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Budi");
        mhs.perkenalkanDiri(); // Output: Halo, nama saya Budi
    }
}
