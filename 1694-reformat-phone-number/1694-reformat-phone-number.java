class Solution {
    public String reformatNumber(String number) {

        StringBuilder temp = new StringBuilder();

        // Remove spaces and '-'
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (ch >= '0' && ch <= '9') {
                temp.append(ch);
            }
        }

        StringBuilder ret = new StringBuilder();

        int i = 0;
        int len = temp.length();

        while (len > 0) {

            if (len > 4) {

                ret.append(temp.substring(i, i + 3));
                ret.append("-");

                i = i + 3;
                len = len - 3;

            } else if (len == 4) {

                ret.append(temp.substring(i, i + 2));
                ret.append("-");

                i = i + 2;
                len = len - 2;

            } else if (len == 3) {

                ret.append(temp.substring(i, i + 3));
                ret.append("-");

                i = i + 3;
                len = len - 3;

            } else if (len == 2) {

                ret.append(temp.substring(i, i + 2));
                ret.append("-");

                i = i + 2;
                len = len - 2;
            }
        }

        // Last extra '-'
        ret.deleteCharAt(ret.length() - 1);

        return ret.toString();
    }
}