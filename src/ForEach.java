public class ForEach {
    public static void main(String[] args) {

         String[] names = {
                 "Eko", "Kurniawan", "Khannedy",
                 "Programmer", "Zaman", "Now"
         };

        // Tanpa For Each
         for (var i = 0; i < names.length; i++){
             System.out.println(names[i]);
         }

        System.out.println("For Each");
         // For Each
        for (var name: names){
            System.out.println(name);
        }
    }
}
