// Kelas BankBNI 
class BankBNI extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah: 4%"); // [cite: 29]
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        // Bonus Challenge: Biaya transfer jika bank tujuan bukan BNI [cite: 31, 32]
        int biaya = bankTujuan.equalsIgnoreCase("BNI") ? 0 : 6500;
        System.out.println("[BNI] Transfer Rp" + jumlah + " ke " + bankTujuan + " (" + rekeningTujuan + "). Biaya: Rp" + biaya);
    }
}

// Kelas BankBCA 
class BankBCA extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah: 4.5%"); // [cite: 30]
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        // Bonus Challenge: Biaya transfer jika bank tujuan bukan BCA [cite: 31, 32]
        int biaya = bankTujuan.equalsIgnoreCase("BCA") ? 0 : 2500;
        System.out.println("[BCA] Transfer Rp" + jumlah + " ke " + bankTujuan + " (" + rekeningTujuan + "). Biaya: Rp" + biaya);
    }
}