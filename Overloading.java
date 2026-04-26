public class Bank {
    // Overload 1: Transfer sesama bank [cite: 20]
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }

    // Overload 2: Transfer antar bank [cite: 21]
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke " + bankTujuan + " (" + rekeningTujuan + ")");
    }

    // Overload 3: Transfer dengan berita [cite: 22, 23]
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke " + bankTujuan + " (" + rekeningTujuan + ") dengan berita: " + berita);
    }

    // Method yang akan di-override [cite: 24]
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}