//Encrypt word when A=F
//Input: Apple
//Output: Fuuqj
public class encryptWord {
    public static void main(String[] args) {
        int key=5;
        String word= "Apple";
        System.out.println(word);

        char[] chars = word.toCharArray();
        for(char n:chars) {
            n += key;
            System.out.print(n);

        }

    }
}
