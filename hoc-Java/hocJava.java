import java.util.Scanner;
 
public class YourInformation {
 
    public static void main(String[] args) throws Expection{
        Scanner scanner = new Scanner(System.in);
        String hoten = ""
        System.out.println("Mời bạn nhập vào họ tên: ");
        String yourName = scanner.nextLine();
        System.out.println("Tên của bạn khi sử dụng phương thức nextLine là " + yourName);
    }
}