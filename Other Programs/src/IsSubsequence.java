public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int indexArr[] = new int[s.length()];
        for(int i =0;i<s.length();i++){
            boolean found = false;
            for(int j =0;j<t.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    if((i != 0 && indexArr[i-1] < j) || i == 0){
                        found = true;
                        indexArr[i] = j;
                        break;
                    }
                }
            }
            if(!found) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        boolean result = isSubsequence(s,t);
        System.out.println(result);
    }
}
