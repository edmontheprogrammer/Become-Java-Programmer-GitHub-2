public class Main {

    public static void main(String[] args) {

        // creating an array of strings with 12 values.
        String[] months =
                {"January", "Febrary", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"
                };
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }

//        for (var month : months) {
//            System.out.println(month);
//        }

//        var whileCounter = 0;
//        while (whileCounter < months.length) {
//            System.out.println(months[whileCounter]);
//            whileCounter++;
//        }


        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        }
        while (doCounter < months.length);
    }
}
