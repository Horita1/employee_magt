package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
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
	public String displaySearch(Model model) {
		model.addAttribute("userSearchRequest",new UserSearchRequest());
		return "user/serch";
	}
	
	/**
	 * ユーザー情報検索
	 * @param userSerchRequest リクエストデータ
	 * @param model Model
	 * @param ユーザー情報一覧画面
	 */
	@RequestMapping(value = "/user/id_serch",method = RequestMethod.POST)
	public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
		User user = userService.search(userSearchRequest);
		model.addAttribute("userinfo",user);
		return "user/search";
	}
	
}
