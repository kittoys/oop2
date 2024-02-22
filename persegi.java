public class persegi {
    private double sisi;

    // Konstruktor untuk menginisialisasi sisi saat objek dibuat
    public persegi(double sisi) {
        this.sisi = sisi;
    }

    // Metode untuk mengatur nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Metode untuk menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Metode untuk menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Persegi
        persegi persegi = new persegi(5); // Membuat objek persegi dengan sisi 5

        // Menggunakan metode untuk mendapatkan luas dan keliling
        System.out.println("Luas persegi: " + persegi.getLuas());
        System.out.println("Keliling persegi: " + persegi.getKeliling());

        // Mengubah nilai sisi dan menghitung kembali luas dan keliling
        persegi.setSisi(7);
        System.out.println("Luas persegi setelah diubah: " + persegi.getLuas());
        System.out.println("Keliling persegi setelah diubah: " + persegi.getKeliling());
    }
}