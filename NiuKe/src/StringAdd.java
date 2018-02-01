public class StringAdd {
    public static void main(String args[]){
        String str1="abc";
        String str2="def";
        String result="";
        for(int i=0;i<str1.length();i++){
            result+=str1.charAt(i);
            result+=str2.charAt(i);
        }
        System.out.println(result);
    }
}
