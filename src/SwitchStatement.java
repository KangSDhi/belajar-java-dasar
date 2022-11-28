public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "E";

        switch (nilai){
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Min Java 14
        switch (nilai){
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // Min Java 14
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);

        // Min Java 14
        ucapan = switch (nilai) {
            case "A": yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C": yield "Anda Lulus";
            case "D": yield  "Anda Tidak Lulus";
            default : yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
