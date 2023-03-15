package com.example.demo.dto;

import java.io.Serializable;


/**
 * ユーザー情報 検索用リクエストデータ
 */

public class UserSearchRequest implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

/**
   * ユーザーID
   */
  private Long id;
}

