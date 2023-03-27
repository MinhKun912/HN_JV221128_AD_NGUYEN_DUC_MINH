package bai2;
import java.util.*;
public class ReverseWords {
    static String sentence;
    static String word;
    static Stack<String> stack = new Stack<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("***************MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                 inputData(sc,sentence);

                    break;
                case 2:
                   reverseWord();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }
    public static void inputData(Scanner scanner,String sentence){
        System.out.println("Nhập câu:");
        sentence = scanner.nextLine();
        String[] words = sentence.split("");

        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
    }
    public static void reverseWord(){
        System.out.println("Câu đảo ngược:");
        while (!stack.isEmpty()) {
            word = stack.pop();
            System.out.print(word + " ");
        }
        System.out.println();
    }
}

