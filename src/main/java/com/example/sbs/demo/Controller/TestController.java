package com.example.sbs.demo.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sbs.demo.Dao.ArticleDAO;

@Controller
public class TestController {
	
	ArticleDAO dao = new ArticleDAO();
	
	//Create 게시판
	@RequestMapping("addArticle")
	@ResponseBody
	public String add(int id, String title, String body, String nick) {
		
		dao.insertArticle(id, title, body, nick);
		
		return "게시물이 저장되었습니다.";
	}
	
	//Read  게시판
	@RequestMapping("list")
	@ResponseBody
	public ArrayList<Article> list() {
		
		ArrayList<Article> list = dao.getArticles();
		
		return list;
	}
	
	//Update 게시판
	@RequestMapping("updateArticle")
	@ResponseBody
	public String update(int id) {
		
		
		return null;
		
	}
	
	//Delete 게시판
	@RequestMapping("deleteArticle")
	@ResponseBody
	public String delete(int id) {

		dao.removeArticle(id);
		
		return id + "번 글이 삭제되었습니다.";
		
	}
}
