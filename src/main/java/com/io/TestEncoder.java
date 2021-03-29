package com.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class TestEncoder {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "樊志康";
        //编码
        //byte[] dataBytes = data.getBytes("UTF-8");
        byte[] dataBytes = data.getBytes("GBK");
        System.out.println(Arrays.toString(dataBytes));
        //解码
        // String newData = new String(dataBytes,"GBK");
        String newData = new String(dataBytes, "ISO-8859-1");
        System.out.println(newData);

        //解决乱码
        byte[] databytes1 = newData.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(dataBytes));

        //解码
        String newData2 = new String(databytes1, "GBK");
        System.out.println(newData2);


    }


}
