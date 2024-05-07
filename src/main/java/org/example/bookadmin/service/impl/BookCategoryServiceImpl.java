package org.example.bookadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.bookadmin.pojo.BookCategory;
import org.example.bookadmin.service.BookCategoryService;
import org.example.bookadmin.mapper.BookCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Redmi
* @description 针对表【book_category】的数据库操作Service实现
* @createDate 2024-04-24 20:03:40
*/
@Service
public class BookCategoryServiceImpl extends ServiceImpl<BookCategoryMapper, BookCategory>
    implements BookCategoryService{

}




