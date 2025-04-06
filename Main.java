class Mobil {
    String merk;

    Mobil(String merk) {
        this.merk = merk; // `this.merk` adalah variabel instance
    }

    void tampilkanMerk() {
        System.out.println("Merk mobil: " + this.merk); // Menampilkan merk mobil
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota");
        m.tampilkanMerk(); // Output: Merk mobil: Toyota
    }
}
