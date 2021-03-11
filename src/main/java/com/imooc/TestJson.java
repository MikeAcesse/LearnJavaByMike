package com.imooc;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/10 20:48
 */
public class TestJson {
    public static void main(String[] args) throws IOException {
        InputStream input = TestJson.class.getResourceAsStream("book.json");
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        // 反序列化时忽略不存在的JavaBean属性:
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Book book = mapper.readValue(input, Book.class);
        System.out.println(book.id);
        System.out.println(book.name);
        System.out.println(book.author);
        System.out.println(book.isbn);
        System.out.println(book.tags);
        System.out.println(book.price);
        System.out.println(book.pubDate);
        // 序列化为JSON:
        String json = mapper.writeValueAsString(book);
        System.out.println(json);
    }
}
