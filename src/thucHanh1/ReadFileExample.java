package thucHanh1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void redFileText(String filePath){
        try {
            // đọc file theo hướng dẫn
            File file = new File(filePath);

            // kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()){
                throw new FileNotFoundException();

            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);

            } br.close();

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();

        readFileEx.redFileText(path);
    }
}
