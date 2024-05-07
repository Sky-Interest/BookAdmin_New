package org.example.bookadmin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.bookadmin.pojo.Book;
import org.example.bookadmin.pojo.resp.BookResp;
import org.example.bookadmin.service.BookService;
import org.example.bookadmin.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author Redmi
* @description 针对表【book】的数据库操作Service实现
* @createDate 2024-04-24 20:03:40
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

    public IPage<BookResp> findBookListByPage(IPage<BookResp>page,Integer id){
        return this.baseMapper.findBookAndCategory(page,id);
    }
}




