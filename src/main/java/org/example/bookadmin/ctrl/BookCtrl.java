package org.example.bookadmin.ctrl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.bookadmin.pojo.Book;
import org.example.bookadmin.pojo.resp.BookResp;
import org.example.bookadmin.pojo.resp.PageResp;
import org.example.bookadmin.service.BookCategoryService;
import org.example.bookadmin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
public class BookCtrl {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookCategoryService bookCategoryService;

    @GetMapping("/getBookList")
//    public List getBookList(){
//        return bookService.list();
//    }
    public PageResp<BookResp> getBookList(Integer page,Integer size,Integer id){
        System.out.println(page + "  " + size + "  " + id);
        PageResp<BookResp> resp = new PageResp<>();
        Page<BookResp> bookRespPage = new Page<>(page,size);
        bookRespPage = (Page<BookResp>) bookService.findBookListByPage(bookRespPage,id);
        resp.setList(bookRespPage.getRecords());
        resp.setTotal(bookRespPage.getTotal());
        return resp;
    }
    @GetMapping("/getBookListCategory")
    public List getBookListCategory(){return bookCategoryService.list();};
    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(@RequestBody Book book){
        try {
            if (Objects.isNull(book.getSelfTime())) {
                book.setSelfTime(new Date());
            }
            bookService.saveOrUpdate(book);
            return "操作成功!";
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败!";
        }

    }
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id")Integer id){
        try {
            bookService.removeById(id);
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "删除失败!";
        }
    }
}
