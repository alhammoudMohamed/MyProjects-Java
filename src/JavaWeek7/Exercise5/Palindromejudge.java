package JavaWeek7.Exercise5;



public class Palindromejudge {
    public Boolean isPalindrome(String word){
        String wordNoSpaces = word.replaceAll(" ","");
        String reversedWithNoSpaces = reverse(wordNoSpaces);
        if(reversedWithNoSpaces.equalsIgnoreCase(wordNoSpaces)){
            return true;
        }

        return false;
    }
    private String reverse(String wordWithNoSpaces){
        Integer lenght = wordWithNoSpaces.length();
        String reersed = "";
        for (int postion = lenght - 1; postion >=0; postion--) {
            reersed = reersed+wordWithNoSpaces.charAt(postion);

        } return reersed;
    }
}
