public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Sigit Boworaharjo";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Dhini Aprilia Budiarti";
        System.out.println(name);

        // var => https://medium.com/@thickkoezz/penggunaan-keyword-var-di-java-de3b7355050c
        var firstName = "Sigit";
        var lastName = "Boworaharjo";
        var fullName = firstName + " " +lastName;

        System.out.println(fullName);

        // final => https://www.duniailkom.com/tutorial-oop-java-pengertian-dan-fungsi-perintah-final/
        final String application = "Belajar Java";

        // final var
        final var version = 3.0;
    }
}
