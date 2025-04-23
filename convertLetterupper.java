public class convertLetterupper{
    // function
    public static String toUpperCase(String str) {
        // stringbuilder empty hai
        StringBuilder sb = new StringBuilder("");
        // string ko uppercase keraga 
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // loop 1 se string ke length tk jayega
        for(int i=1; i<str.length(); i++) {
            // space ko check karega
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i)); // apend me jodna
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
        String str = "hi i am klamuddin"; 
        System.out.println(toUpperCase(str));
    }
}