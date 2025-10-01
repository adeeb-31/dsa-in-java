public class Strin_char_rev {
    public static void main(String[] args){
        //my name is adeeb
        //ym eman si beeda

        String s="Adeeb is good";

        String words[]=s.split(" ");
         StringBuilder sb=new StringBuilder();

        for(String w:words){

            String rev=" ";

            for(int i=w.length()-1;i>=0;i--){

                rev+=w.charAt(i);
            }
            sb.append(rev).append(" ");

        }
        System.out.println(sb.toString().trim());
    }
    
}
