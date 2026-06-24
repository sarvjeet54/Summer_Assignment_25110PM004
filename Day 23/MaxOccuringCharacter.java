public class MaxOccuringCharacter {

    public static char getMaxOccurringChar(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        int maxFreq = 0;
        char ans = s.charAt(0);

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "banana";

        char result = getMaxOccurringChar(s);

        System.out.println("Maximum occurring character: " + result);
    }
}

