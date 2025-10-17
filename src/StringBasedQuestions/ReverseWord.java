package StringBasedQuestions;

public class ReverseWord {
    public static void main(String[] args) {
       String  str = "I.like.this.program.very.much";
       String[] strArray = str.split(".");

       for(int i=0; i < strArray.length ;i++){
           System.out.println(strArray[i]);
       }
    }
}
