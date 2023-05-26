public class StrongPasswordCheck {

    public int strongPasswordChecker(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int missing = getMissingCount(chars);
        //no of replacements to deal with 3 repeating characters
        int replaces = 0;
        //no of groups that can be substituted with one deletions
        int oneSeq = 0;
        //no of groups that can be substituted with 2 deletions (3k + 1)groups
        int twoSeq = 0;

        for (int i = 2; i < n;) {
            if (chars[i] == chars[i - 1] && chars[i - 1] == chars[i - 2]) {
                int length = 2; //length of repeating characters
                while (i < n && chars[i] == chars[i - 1]) {
                    length++;
                    i++;
                }
                replaces += length / 3; //bbbbbbb ---> bbxbbxb
                if (length % 3 == 0)
                    oneSeq++;
                if (length % 3 == 1)
                    twoSeq++;
            } else {
                i++;
            }
        }

       

        if (n < 6)
            return Math.max(6 - n, missing);
        if (n <= 20)
            return Math.max(replaces, missing);

        int deletes = n - 20;
        //Each replacement in the (3k)-group can be substituted with one deletion
        replaces -= Math.min(oneSeq, deletes);
        //Each replacement in the (3k + 1)-group can be substituted with two deletion
        replaces -= Math.min(Math.max(deletes - oneSeq, 0), twoSeq * 2) / 2;
        //Each replacement in the other-group can be substituted with three deletion
        replaces -= Math.max(deletes - oneSeq - twoSeq * 2, 0) / 3;
        return deletes + Math.max(replaces, missing);
    }

    private int getMissingCount(final char[] chars) {
        //missing = 3 represents all of the lowercase, uppercase and digit are missing
        int missing = 3;

        for (final char c : chars)
            //if we encounter an uppercase then we will reduce the missing by1
            if (Character.isUpperCase(c)) {
                missing--;
                break;
            }
            //if we encounter a lowercase will will decrement missing by 1
        for (final char c : chars)
            if (Character.isLowerCase(c)) {
                missing--;
                break;
            }
            //if we encounter a digit then we will decrement missing by 1
        for (final char c : chars)
            if (Character.isDigit(c)) {
                missing--;
                break;
            }

        return missing;
    }

    public static void main(String[] args) {
        StrongPasswordCheck spc = new StrongPasswordCheck();
        System.out.println("Testing out the first test case");
        String s1 = "a";
        System.out.println("The minimum number of steps required to make " +s1+" a strong password is " + spc.strongPasswordChecker(s1));

        System.out.println("Testing out the Second test case");
        String s2 = "aA1";
        System.out.println("The minimum number of steps required to make " +s2+" a strong password is " + spc.strongPasswordChecker(s2));

        System.out.println("Testing out the Third test case");
        String s3 = "1337C0d3";
        System.out.println("The minimum number of steps required to make " +s3+" a strong password is " + spc.strongPasswordChecker(s3));
    }

   
}

