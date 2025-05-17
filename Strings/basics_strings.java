public class basics_strings {

    public static void main(String[] args) {
        // Concatenation of strings

        String first="Sarthak";
        String last="Shahi";
        String full= first+" "+last;
        System.out.println(full);
        System.out.println(full.length());// to find the length of the string

        // charAt to display each element of the string
        for(int i=0;i<full.length();i++){
            System.out.println(full.charAt(i));

        }
        // Comparing 2 strings
        String name1="Sankalp";
        String name2="vanshita";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");

        }
        else{
            System.out.println("Strings are not equal");
        }
        String sentence="Hey Sarth";
        String name3=sentence.substring(0,4);
        System.out.println(name3);

        //Srings are immutable

    }
}