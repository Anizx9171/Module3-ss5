import java.util.Scanner;

public class Fan {
   private boolean status = false;
   private double radius;

   private int speed = 0;

    Fan(double radius){
        this.radius = radius;
    }

    public void bậtQuạt(){
        if (this.status){
            System.out.println("Quạt đang bật");
            return;
        }
        this.status = true;
        this.speed = 1;
        System.out.println("Quạt đã bật");
    }

    public void tiếngQuạt(){
            switch (this.speed){
                case 1:
                    System.out.println("vù...");
                    break;
                case 2:
                    System.out.println("vù vù...");
                    break;
                case 3:
                    System.out.println("vù vù vù...");
                    break;
                case 0:
                    System.out.println("Chưa bật quật");
                    break;
            }
    }

    public void tắtQuạt(){
        if (!this.status){
            System.out.println("Quạt có bật đâu mà tắt");
            return;
        }
        this.status = false;
        this.speed = 0;
        System.out.println("Quạt đã tắt");
    }

    public void changeSpeed(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số quạt (0/1/2/3)");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                this.speed = 1;
                break;
            case 2:
                this.speed = 2;
                break;
            case 3:
                this.speed = 3;
                break;
            case 0:
                this.tắtQuạt();
                return;
            default:
                System.out.println("số quạt không hợp lệ");
                return;
        }
        System.out.println("Số quạt đã thay đổi thành "+ number);
    }

}
