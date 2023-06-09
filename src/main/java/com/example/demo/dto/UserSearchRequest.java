package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;


/**
 * ユーザー情報 検索用リクエストデータ
 * エンティティからIDだけを取得したクラス
 * 画面からのリクエストを格納するBeanクラス
 */
@Data
public class UserSearchRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ユーザーID
	 */
	 private Long id;
	

}

