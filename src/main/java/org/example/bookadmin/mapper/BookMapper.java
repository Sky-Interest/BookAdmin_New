package org.example.bookadmin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import org.example.bookadmin.pojo.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.bookadmin.pojo.resp.BookResp;

/**
* @author Redmi
* @description 针对表【book】的数据库操作Mapper
* @createDate 2024-04-24 20:03:40
* @Entity org.example.bookadmin.pojo.Book
*/
public interface BookMapper extends BaseMapper<Book> {
    IPage<BookResp> findBookAndCategory(IPage<BookResp> page, @Param("categoryId")Integer categoryId);
}





