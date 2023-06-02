import java.io.*;

public class A1093376_0526_ReadObject{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("要讀取的學生成績檔名:");
        System.out.print("->");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine(); //取得檔名字串

        int counter=0;
        double Esum=0;
        double Msum=0;
        double Jsum=0;
        A1093376_0526_Student ss = new A1093376_0526_Student();

        System.out.println("姓名\t英文\t數學\tJava\t平均");
        System.out.println("-----------------------------------------");

        try(ObjectInputStream ois = new ObjectInputStream(filename)){
            while (true){
                ss = (A1093376_0526_Student) ois.readObject();
                counter++;

                Esum+=ss.getE();
                Msum+=ss.getM();
                Jsum+=ss.getJ();

                System.out.println(ss.getN()+'\t'+ss.getE()+'\t'+ss.getM()+'\t'+ss.getJ()+'\t'+ss.getAvg());
            }
        }
        catch(EOFException e){
            System.out.println("\n已從檔案"+filename+"讀取"+counter+"筆學生資料");
            System.out.println("\n全員英文平均:"+(Esum/counter));
            System.out.println("全員數學平均:"+(Msum/counter));
            System.out.println("全員Java平均:"+(Jsum/counter));
        }
    }
}
