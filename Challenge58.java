public class Main {

    public static void main(String[] args) {
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.print("A = Able");
                break;
            case 'B':
                System.out.print("B = Baker");
                break;
            case 'C':
                System.out.print("C = Charlie");
                break;
            case 'D':
                System.out.print("D = Dog");
                break;
            case 'E':
                System.out.print("E = Easy");
                break;
            default:
                System.out.print("Not Found");
        }
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'A':
                    System.out.print("A = Able");
                    break;
                case 'B':
                    System.out.print("B = Baker");
                    break;
                case 'C':
                    System.out.print("C = Charlie");
                    break;
                case 'D':
                    System.out.print("D = Dog");
                    break;
                case 'E':
                    System.out.print("E = Easy");
                    break;
                default:
                    System.out.print("Not Found");
            }
        }
    }
}