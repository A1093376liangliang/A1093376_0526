import java.io.*;

public class A1093376_0526_Student implements Serializable{

    public A1093376_0526_Student (String s, short e, short m, short j){
        name = s;
        EScore = e;
        MScore = m;
        JScore = j;
    }

    public A1093376_0526_Student(){

    }

    //傳回姓名和各項成績的方法
    public String getN() {
        return name;
    }
    public short getE(){
        return EScore;
    }
    public short getM(){
        return MScore;
    }
    public short getJ(){
        return JScore;
    }

    //傳回三科成績平均的方法
    public double getAvg(){
        return (EScore + MScore + JScore)/3.0;
    }

    private String name;
    private short EScore;
    private short MScore;
    private short JScore;

}
