package com.example.demo.repository;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     *  UserMapper.xmlを呼び出しUserSearchRequestの値を渡す
     *  SQL分を実行する
     *  一致したユーザーを取得
     */
    User search(UserSearchRequest user);
}