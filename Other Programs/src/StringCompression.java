public class StringCompression {
    public static String formCountString(int count) {
        StringBuilder tempString = new StringBuilder();
        while (count > 0) {
            String digitToAppend = String.valueOf(count % 10);
            tempString.insert(0, digitToAppend);
            count = count / 10;
        }
        return tempString.toString();
    }
    public static String appendCurrentCompression(String currentChar,int count){
        StringBuilder str = new StringBuilder(currentChar);
        if(count > 1){
            StringBuilder numberString = new StringBuilder(formCountString(count));
            str.append(numberString);
        }
        System.out.println("current string is "+str.toString()+" "+currentChar);
        return str.toString();
    }

    public static int compress(char[] chars) {
        StringBuilder formedString = new StringBuilder(chars[0]);
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                String current = String.valueOf(chars[i - 1]);
                formedString.append(appendCurrentCompression(current, count));
                count = 1;
            }
        }
        String current = String.valueOf(chars[chars.length - 1]);
        formedString.append(appendCurrentCompression(current, count));

        String temp = formedString.toString();
        System.out.println("formed string is "+ temp);
        return formedString.length();
    }

    public static void main(String[] args) {
        char chars[] = { 'a','a','a','a' };
        int output = compress(chars);
        System.out.println(output);
    }
}