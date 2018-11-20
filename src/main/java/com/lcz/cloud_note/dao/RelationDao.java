package com.lcz.cloud_note.dao;
/**
 * 关联查询通过用户名查询用户和书籍信息
 * @author LvChaoZhang
 *
 */

import java.util.List;

import com.lcz.cloud_note.entity.Book;
import com.lcz.cloud_note.entity.User;

public interface RelationDao {
	//关联多个对象
    User findUserAndBooks(String userId);
	User findUserAndBooks1(String userId);
	//关联单个对象
    List<Book> findBookAndUser();
}
