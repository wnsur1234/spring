package com.grepp.spring.app.model.book;

import com.grepp.spring.app.model.book.dto.Book;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BookRepository {

    @Select("select * from book")
    List<Book> selectAll();
    
    @Select("select * from book where bk_idx = #{bkIdx}")
    Optional<Book> selectById(Integer bkIdx);
    
    @Insert("insert into book(category, title, author, info) "
                + "values (#{category},#{title},#{author},#{info})")
    void insert(Book book);
    
    @Update("update book set title=#{title}, author=#{author} where bk_idx = #{bkIdx}")
    void update(Book book);
}
