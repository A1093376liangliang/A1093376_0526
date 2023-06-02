import java.io.*;

public class A1093376_0526_WriteObject{
    public static void main(String[] args) throws IOException {
        
        System.out.println("請輸入要建立的學生成績檔檔名");
        System.out.print("->");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine(); //取得檔名字串
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));

        String str = new String();
        int counter=0;

        do{
            counter++;

            System.out.print("請輸入學生姓名:");
            String name = br.readLine();

            System.out.print("請輸入英文成績:");
            str = br.readLine();
            short e = Short.parseShort(str);

            System.out.print("請輸入數學成績:");
            str = br.readLine();
            short m = Short.parseShort(str);

            System.out.print("請輸入Java成績:");
            str = br.readLine();
            short j = Short.parseShort(str);

            A1093376_0526_Student ss = new A1093376_0526_Student(name, e, m, j);

            os.writeObject(ss);

            System.out.print("還要輸入另一本資料嗎(Y/N):");
            str = br.readLine();

        }while (str.equalsIgnoreCase("Y"));

        os.flush();
        os.close();

        System.out.println("\n已寫入"+ counter + "筆學生資料至檔案" + filename);
    }
}