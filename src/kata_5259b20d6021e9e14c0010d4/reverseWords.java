package kata_5259b20d6021e9e14c0010d4;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//        Examples
//
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"


public class reverseWords {
    public static String reverseWords(final String original) {
        if (!original.trim().isEmpty()){
            String[] parts = original.split(" ");
            StringBuilder result = new StringBuilder();

            for (String x : parts) {
                StringBuilder newline = new StringBuilder();
                for (int i = 0; i < x.length(); i++) {
                    char ch = x.charAt(i);
                    newline.insert(0, ch);
                }
                result.append(newline).append(" ");
            }
            System.out.println(result.toString().trim());
            return result.toString().trim();
        }
        return original;
    }

}