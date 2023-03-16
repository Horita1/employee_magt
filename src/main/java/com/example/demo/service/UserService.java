package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
     * ユーザー情報検索
　　　	　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     * コントローラークラスから呼び出される
     */
    public User search(UserSearchRequest userSearchRequest) {
        // マッパーにフォームで入力された値を渡す。返ってきた値をコントローラーに返す
    	return userMapper.search(userSearchRequest);
    }
}