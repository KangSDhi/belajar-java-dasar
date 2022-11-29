public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] nilai = { 80, 60, 80, 80, 80 };

        sayCongrats("Eko", nilai);

        sayCongratsX("Eko", nilai);

        sayCongratsX("Sigit", 80, 90, 76, 30);
    }

    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value: values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat, " + name + " Anda Lulus!");
        }else {
            System.out.println("Maaf, " + name + " Anda Tidak Lulus!");
        }
    }

    // Method Variable Argument
    static void sayCongratsX(String name, int... values){
        var total = 0;
        for (var value: values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat, " + name + " Anda Lulus!");
        }else {
            System.out.println("Maaf, " + name + " Anda Tidak Lulus!");
        }
    }

}
