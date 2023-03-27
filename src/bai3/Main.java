package bai3;
import java.util.*;
public class Main {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue<String> registerQueue = new LinkedList<String>();

            while (true) {
                System.out.println("****************MENU***************");
                System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
                System.out.println("2. Phụ huynh được Vào trước");
                System.out.println("3. Thoát");
                System.out.println("Nhập lựa chọn của bạn:");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên phụ huynh:");
                        String parentName = sc.nextLine();
                        registerQueue.add(parentName);
                        break;
                    case 2:
                        if (registerQueue.isEmpty()) {
                            System.out.println("Không có phụ huynh trong danh sách đăng ký");
                        } else {
                            String nextParent = registerQueue.poll();
                            System.out.println("Phụ huynh tiếp theo là: " + nextParent);
                        }
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
    }

