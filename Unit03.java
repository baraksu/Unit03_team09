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
       public static int countWords(String s){
        Scanner reader = new Scanner(System.in);
        int count = 0;
        String newS = s.replace(" ","");
        count = s.length() - newS.length() + 1;
        if (count < 3)
            return -1;
        else
            return count;
    }
    
    public static int countParts(String s, char separator){
        int firstIndex, lastIndex;
        firstIndex = s.indexOf(separator);
        if (firstIndex == -1){
            if (s.length() > 0)
                return 1;
            else
                return 0;
        }
        lastIndex = s.lastIndexOf(separator);
        if (firstIndex == lastIndex){
            return 2;
        }else{
            return 3;
        }
    }
    
    public static void printParts(String s, char separator){
        if (countParts(s,separator) == 1){
            System.out.println(s);
        }
        else if (countParts(s,separator) == 2){
            int index = s.indexOf(separator);
            String a = s.substring(0, index);
            String b = s.substring(index+1);
            System.out.println(a +"\n" + b);
        }
        else if (countParts(s,separator) == 3){
            int index1 = s.indexOf(separator), index2 = s.lastIndexOf(separator);
            String a = s.substring(0, index1);
            String b = s.substring(index1 + 1, index2);
            String c = s.substring(index2 + 1);
        }
    } 
    
}
