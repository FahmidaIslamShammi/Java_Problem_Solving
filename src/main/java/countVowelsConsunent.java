//Count Vowels and consonants from a word
//Input: Dhaka
//Output:
//Vowel: 2
//Consonant: 3
public class countVowelsConsunent {
    public static void main(String[] args) {
        int vowelCounter = 0;
        int consunantCounter = 0;


        String word = "Dhaka";
        word = word.toLowerCase();

        for(int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {

                vowelCounter++;
            }
            else if(word.charAt(i) >= 'a' && word.charAt(i)<='z') {

                consunantCounter++;
            }
            else{
                System.out.println("Invalid input");
            }
        }
        System.out.println("Number of vowels: " + vowelCounter);
        System.out.println("Number of consonants: " + consunantCounter);

    }
}
