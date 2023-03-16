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
 * ユーザー情報 Controller
 */
@Controller
public class UserController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  UserService userService;
  /**
   * ユーザー情報検索画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  //user/searchにアクセスすると処理が実行される
  @GetMapping(value = "/user/search") 
  // モデルクラスはコントローラーからビューに変数を渡す
  public String displaySearch(Model model) {
	// search.htmlにuserSearchRequestという変数名で、UserSerchRequestクラスを渡す  
    model.addAttribute("userSearchRequest", new UserSearchRequest());
    // 変数を渡すhtmlの指定
    return "user/search";
  }
  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  // POSTでアクセスされたリクエストを処理する
  @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
  // @ModelAttribute リクエストからきたフォームのデータを受け取る
  public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
    // 入力された値を元にユーザーを検索し、取得するserviceクラスを実行
	User user = userService.search(userSearchRequest);
    // htmlにuserinfoという変数名でuserを渡す
    model.addAttribute("userinfo", user);
    // 変数を渡すhtmlを指定
    return "user/search";
  }
}