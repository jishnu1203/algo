package HERE_PREP;

public class DuplicateInMultpleStr {

    public static void main(String[] args) {
        String firstElement = "jishnu";
        String secondElement = "devika";

        char[] firstElementArray = firstElement.toCharArray();

        for(int i=0; i < firstElementArray.length; i++){
//            System.out.println(secondElement.indexOf(firstElementArray[i]));
            if(secondElement.indexOf(firstElementArray[i]) > 0){
                System.out.println(firstElementArray[i]);
            }
        }
    }
}
