public class Main {
    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        str = str.replaceAll(":", " ");
        String[] str2 = str.split(" ");
        for(int i = 0; i < str2.length; i++)
        {
            str2[i] = str2[i].replaceAll("[ ,:{}\" ]","");
        }

        StringBuilder str3 = new StringBuilder();
        str3.append( "select * from students where ");
        for(int i = 1; i < str2.length; i+=2){
            if(str2[i].equals("null")|str2[i].equals(" ")){
                continue;
            }
            str3.append(str2[i-1]);
            str3.append(" = '");
            str3.append(str2[i]);
            str3.append("' ");
        }
        System.out.println(str3);
    }

}
