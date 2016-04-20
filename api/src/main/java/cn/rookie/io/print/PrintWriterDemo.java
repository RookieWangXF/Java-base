package cn.rookie.io.print;

import java.io.*;

/**
 * Created by Rookie on 2016/4/20.
 */
public class PrintWriterDemo {

    /**
     * 使用字符流接收输入值
     * @throws IOException
     */
    public static void systemIn() throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream in  = System.in;
        char ch;
        while((ch=(char) in.read() )!= -1){
            if(ch == '\r'){
                continue;
            }
            if(ch == '\n'){
                String temp=sb.toString();
                if("over".equals(temp)){
                    break;
                }
                System.out.println(temp.toUpperCase());
                sb.delete(0, sb.length());
            }
            else{
                sb.append((char)ch);
            }
        }
    }

    /**
     * 使用
     * @throws IOException
     */
    public static void printWriter() throws IOException {
        InputStream in = System.in;
        InputStreamReader insr = new InputStreamReader(in);
        BufferedReader bufr = new BufferedReader(insr);

        PrintWriter out = new PrintWriter(System.out);

        String line = null;

        while ((line = bufr.readLine())!= null) {
            if ("OVER".equals(line.toUpperCase()))
                break;
            out.print(line);
            out.flush();
        }
        out.close();
        bufr.close();
    }

    public static void main(String[] args) throws IOException {
        PrintWriterDemo.printWriter();
    }
}
