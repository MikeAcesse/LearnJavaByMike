package com.imooc;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/10 20:14
 */
public class Book {
    public long id;
    public String name;
    public String author;
    @JsonDeserialize(using = IsbnDeserializer.class)
    public BigInteger isbn;

    public List<String> tags;
    public LocalDate pubDate;
    public BigDecimal price;
}
