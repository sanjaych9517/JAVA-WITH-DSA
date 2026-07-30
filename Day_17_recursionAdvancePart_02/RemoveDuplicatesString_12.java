package Day_17_recursionAdvancePart_02;

public class RemoveDuplicatesString_12 {

    public static void remobeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
     if(idx == str.length() ){
        System.out.println(newStr);
        return;
     }

    //  kaam
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true ){
        // duplicates 
        remobeDuplicates(str,  idx+1, newStr, map);
    }else{
        map[currChar-'a'] = true;
        remobeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
    }

    public static void main(String[] args) {
       String str = "appnacollege";
       remobeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
