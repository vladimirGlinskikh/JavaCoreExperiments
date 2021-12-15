package stepic.tooManyArguments;

interface StringFunc {
    String func(String n);
}

public class Main {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "The lambda has too many string arguments.";
//        String outStr = stringOp((str) -> str.toUpperCase(), inStr);
        String outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result.toUpperCase();
        }, inStr);
        System.out.println(outStr);
    }
}

// (a1,  a2, a3, a4, a5, a6, a7)  -> (a1 + a2 + a3 + a4 + a5 + a6 + a7).toUpperCase();
