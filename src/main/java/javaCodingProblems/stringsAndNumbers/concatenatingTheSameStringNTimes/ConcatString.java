package javaCodingProblems.stringsAndNumbers.concatenatingTheSameStringNTimes;

public class ConcatString {
    public String concatRepeat(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);

        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public boolean hasOnlySubstrings(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));
            String resultStr = str.replaceAll(sb.toString(), "");
            if (resultStr.length() == 0) {
                return true;
            }
        }
        return false;
    }
}
