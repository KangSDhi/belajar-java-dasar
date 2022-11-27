public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[2];

        stringArray[0] = "Sigit";
        stringArray[1] = "Boworaharjo";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[0] = "Dhini";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Dhini", "Aprilia", "Budiarti"
        };

        System.out.println(namaNama[1]);

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9
        };

        System.out.println(arrayInt[0]);

        Long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = null;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Eko", "Kurniawan", "Khannedy"},
                {"Sigit", "Boworaharjo"},
                {"Tela", "Tela"}
        };
        System.out.println(members[0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
