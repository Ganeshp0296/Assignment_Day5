public class VowelndConsonant {
    public static void main(String[] args) {
        char ch = 'z';

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Alphabet is Vowel");
                break;
            default:
                System.out.println("Alphabet is Consonant");
        }
    }
}
