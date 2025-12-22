public class Unit03{
    
    public static int shiftRight(int num)    {
        return -1;
    }
    public static int shiftRight(int num, int k){
        return -1;
    }
   
    public static int shiftLeft(int num)    {
        return -1;
    }
    public static int shiftLeft(int num, int k){
        return -1;
    }
    public static String shiftRight(String s)    {
        return "";
    }
    public static String shiftLeft(String s)    {
        if (s.length() < 2) return s;
        String subS = s.substring(1)
        String c0 = s.charAt(0);
        return subS + c0; 
    }
    public static String shiftLeft(String s, int k)    {
        if (s.length() < 2) return s;
        if (s.length() < k) k -= s.length();
        String start = s.substring(k);
        String end = s.substring(0, k);
        return start + end;
    }
    public static String shiftRight(String s, int k)    {
        if (s.length() < 2) return s;
        if (s.length() < k) k -= s.length();
        String start = s.substring(s.length() - k);
        String end = s.substring(0, s.length() - k);
        return start + end;
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        
    } 
    
}
