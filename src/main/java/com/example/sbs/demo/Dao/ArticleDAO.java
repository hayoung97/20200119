package com.example.sbs.demo.Dao;

import java.util.ArrayList;

import com.example.sbs.demo.Controller.Article;

public class ArticleDAO {
	
	//article 상자 만들기
	ArrayList<Article> articles = new ArrayList<Article>();
	
	//create 게시물을 위한 메서드
	public void insertArticle(int id, String title, String body, String nick) {
		
		Article a = new Article();
		
		a.setId(id);
		a.setTitle(title);
		a.setBody(body);
		a.setNick(nick);
		
		articles.add(a);
		
	}
	
	//delete 게시물을 위한 메서드
	public void removeArticle(int id) {
		int idx = -1;
		
		for(Article element : articles) {
			if(element.getId() == id) {
				break;
			}
			idx++;
		}
		
		if(idx > -1)
		{
			idx++;
		}
		
		articles.remove(idx);
			
	}
	
	//article 상자에 return
	public ArrayList<Article> getArticles() {
		
		return this.articles;
	}

	
}
