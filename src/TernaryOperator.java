public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 76;
        String ucapan;

        // If Else Statement
        if (nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        }else {
            ucapan = "Silahkan Coba Lagi";
        }

        System.out.println(ucapan);

        // Ternary Operator
        ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ucapan);
    }
}
