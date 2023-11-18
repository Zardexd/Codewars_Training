package kata_5259b20d6021e9e14c0010d4;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//        Examples
//
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"


public class reverseWords {
    public static String reverseWords(final String original) {
        if (original.trim().length() > 0){
            String[] parts = original.split(" ");
            String result = "";

            for (String x : parts) {
                String nw = "";
                for (int i = 0; i < x.length(); i++) {
                    char ch = x.charAt(i);
                    nw = ch + nw;
                }
                result += nw + " ";
            }
            System.out.println(result.trim());
            return result.trim();
        }
        return original;
    }

}