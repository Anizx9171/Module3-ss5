package BT4;
import java.util.*;
public class Qlhs {
        public static void main(String[] args) {
            ArrayList<Sinhvien> studentList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("""
                ----- MENU -----
                1. Hiển thị danh sách tất cả học sinh
                2. Thêm mới học sinh
                3. Sửa thông tin học sinh dựa vào mã học sinh
                4. Xoá học sinh
                5. Thoát
                Nhập lựa chọn của bạn:""");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayAllSinhviens(studentList);
                        break;
                    case 2:
                        addNewSinhvien(studentList);
                        break;
                    case 3:
                        updateSinhvien(studentList);
                        break;
                    case 4:
                        deleteSinhvien(studentList);
                        break;
                    case 5:
                        System.out.println("Đã thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                        break;
                }
                System.out.println();
            } while (choice != 5);
        }

    public static int findIndex(String maHS, ArrayList<Sinhvien> studentList) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMaHS().equals(maHS)) {
                index = i;
                break;
            }
        }
        return index;
    }
        public static void displayAllSinhviens(ArrayList<Sinhvien> studentList) {
            if (studentList.isEmpty()) {
                System.out.println("Danh sách học sinh rỗng.");
            } else {
                System.out.println("+++++ Danh sách học sinh +++++");
                for (Sinhvien student : studentList) {
                    student.displayData();
                    System.out.println();
                }
            }
        }

        public static void addNewSinhvien(ArrayList<Sinhvien> studentList) {
            Sinhvien newSinhvien = new Sinhvien();
            newSinhvien.inputData();
            studentList.add(newSinhvien);
            System.out.println("Thêm học sinh mới thành công.");
        }

        public static void updateSinhvien(ArrayList<Sinhvien> studentList) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập mã học sinh cần sửa: ");
            String maHS = scanner.nextLine();

            int index = findIndex(maHS, studentList);

            if (index == -1) {
                System.out.println("Không tìm thấy học sinh có mã```java" + maHS + "\".");
            } else {
                System.out.println("Thông tin học sinh cần sửa:");
                studentList.get(index).displayData();

                System.out.println("Nhập thông tin học sinh mới:");
                studentList.get(index).inputData();

                System.out.println("Sửa thông tin học sinh thành công.");
            }
        }

        public static void deleteSinhvien(ArrayList<Sinhvien> studentList) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập mã học sinh cần xoá: ");
            String maHSCanXoa = scanner.nextLine();

            int index = findIndex(maHSCanXoa, studentList);

            if (index == -1) {
                System.out.println("Không tìm thấy học sinh có mã học sinh \"" + maHSCanXoa + "\".");
            } else {
                System.out.println("Thông tin học sinh cần xoá:");
                studentList.get(index).displayData();

                studentList.remove(index);
                System.out.println("Xoá học sinh thành công.");
            }
        }
}