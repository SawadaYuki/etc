import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;
import java.util.Date;
//import gnu.getopt.Getopt; //defaultの環境だとない


public class 5w2h {

	public static void main(String[] args){
		System.out.print("第一引数:"  + args[0] + "\r\n"); //1つ目の引数
		//System.out.print(args[1]);

		//要素準備
        // Dateクラスを使用
        Date d = new Date();
        SimpleDateFormat d1 = new SimpleDateFormat("yyyy_MM_dd_HH時");
        String q1 = d1.format(d); 
        //System.out.println(q1); // 出力結果： 2016/08/05 00:28:47

        String receiver = "上司";
		

        String why = "why:";
        String when = "when:";
        String where = "whare:";
        String who = "what:";
        String what = "what:";
        String how = "how:";
        String how_much = "how_much:";
        String how_many = "how_many:";

		


        try{
            //出力先ファイルのFileオブジェクトを作成
            //file名に"/"があればダメ
            File templete_file = new File("5w2h_" + args[0] + "_" + q1 + ".txt");

            //FileWriterオブジェクトを作成（追記モード）
            FileWriter fw = new FileWriter(templete_file, true);



            //文字列を出力
            // Winでの改行コード: \r\n
            fw.write("title:" + args[0] + "\r\n");
            fw.write(q1 + ":From sawada -> To" + receiver + "\r\n");
            fw.write( why + "\r\n");
            fw.write( when + "\r\n");
            fw.write( where + "\r\n");

            //FileWriterオブジェクトをクローズ
            fw.close();

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}