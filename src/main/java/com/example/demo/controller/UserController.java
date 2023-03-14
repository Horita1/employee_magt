package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.service.UserService;

/**
 * ユーザー情報コントローラー
 *
 */
@Controller
public class UserController {

	/**
	 * ユーザー情報サービス
	 */
	@Autowired
	UserService userService;
	
	/**
	 * ユーザー一覧を表示
	 * @param model Model
	 * return ユーザー情報一覧画面
	 */
	@GetMapping(value = "/user/search")
	public String display Search(Model model) {
		model.addAttribute("userSerchRequest",new UserSerchRequest());
		return "user/serch";
	}
	
	
}
