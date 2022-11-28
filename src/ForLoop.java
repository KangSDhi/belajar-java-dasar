public class ForLoop {
    public static void main(String[] args) {
        // Perulangan Tanpa Henti
//        for (;;){
//            System.out.println("Perulangan Tanpa Henti");
//        }

        // Perulangan Dengan Kondisi
        var counter = 1;
        for (; counter <= 10; ){
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }

        // Perulangan Dengan Init Statement
        for (var counter2 = 1; counter2 <= 10; ){
            System.out.println("Perulangan Ke-" + counter2);
            counter2++;
        }

        // Perulangan Dengan Post Statement
        for (var counter3 = 1; counter3 <= 10; counter3++){
            System.out.println("Perulangan Ke-" + counter3);
        }
    }
}
