package com.lanyou;

import org.junit.Test;

import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/16 14:03
 */
public class PrintStreamDemo {

    @Test
    public void testPrintStream() throws IOException {
        final String fileName = "D:\\java.txt";
        File file = new File(fileName);
        testPrintMethod(fileName, file);
        //testOtherMethod(fileName,file);
    }

    private void testOtherMethod(String fileName, File file) throws IOException {
        PrintStream ps = new PrintStream(fileName);
        ps.write("helloworld".getBytes());
        ps.println();
        ps.format("文件名称：%s", file.getName());
        ps.println();
        ps.write(0x41);
        ps.append("abcde");
        ps.close();
    }

    private void testPrintMethod(String fileName, File file) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream(fileName));
        ps.println('a');
        ps.println("hello");
        ps.println(2345);
        ps.println(3.1415);
        ps.println();
        ps.printf("文件名称：%s,是否可读：%s", file.getName(), file.canRead());
        ps.println();
        ps.close();
    }


    @Test
    public void testPrintStream1() throws IOException {
        final String fileName = "D:\\javaleaning.txt";
        File file = new File(fileName);
        PrintStream ps = new PrintStream(new FileOutputStream(file));
        ps.println("fanzhikang");
        ps.print('B');
        ps.append("xxxx");
        ps.append('A');
        ps.println("end");
        ps.write(0x44);
        ps.println("end");
        ps.write("bababa".getBytes(), 2, 4);
        ps.close();

    }


    @Test
    public void testPrintStream2() throws IOException {
        PrintStream ps = null;
        ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        ps.print("hello ");
        ps.println("world!!!");

        String name = "樊治康";
        int age = 'M';
        float score = 990.345f;
        char sex = 'M';
        ps.printf("姓名：%s;年龄：%d;成绩：%f;性别：%c", name, age, score, sex);
        ps.printf("姓名：%s;年龄：%s;成绩：%s;性别：%s", name, age, score, sex);
        ps.close();
    }

    @Test
    public void testPrintWriter1() throws IOException {
        PrintWriter pw = null;
        pw = new PrintWriter(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        pw.print("hello ");
        pw.println("world!!!");

        String name = "樊治康";
        int age = 'M';
        float score = 990.345f;
        char sex = 'M';
        pw.printf("姓名：%s;年龄：%d;成绩：%f;性别：%c", name, age, score, sex);
        pw.printf("姓名：%s;年龄：%s;成绩：%s;性别：%s", name, age, score, sex);
        pw.close();
    }

    @Test
    public void testPrintWriter2() throws IOException {
        PrintWriter pw = null;
        pw = new PrintWriter(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        pw.print("hello ");
        pw.println("world!!!");

        String name = "樊治康";
        int age = 'M';
        float score = 990.345f;
        char sex = 'M';
        pw.printf("姓名：%s;年龄：%d;成绩：%f;性别：%c", name, age, score, sex);
        pw.printf("姓名：%s;年龄：%s;成绩：%s;性别：%s", name, age, score, sex);
        pw.close();
    }
}
