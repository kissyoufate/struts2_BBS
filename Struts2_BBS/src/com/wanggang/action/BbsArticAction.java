package com.wanggang.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wanggang.model.BbsArtic;
import com.wanggang.service.BbsArticService;

//bbs跳转逻辑action
public class BbsArticAction extends ActionSupport {
	private List lists;
	private BbsArtic artic;
	private String name;
	private String description;
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List getLists() {
		return lists;
	}

	public void setLists(List lists) {
		this.lists = lists;
	}

	public BbsArtic getArtic() {
		return artic;
	}

	public void setArtic(BbsArtic artic) {
		this.artic = artic;
	}
	
	/**
	 * 进入前台
	 * @return
	 */
	public String index(){
		System.out.println("进入前台");
		this.setLists(BbsArticService.getAll()); 
		return SUCCESS;
	}

	/**
	 * 进入详情页面
	 * @return
	 */
	public String detail(){
		this.setArtic(BbsArticService.getBbsArticById(id)); ;
		return SUCCESS;
	}
	
	/**
	 * 进入管理后台
	 * @return
	 */
	public String admin(){
		List l = BbsArticService.getAll();
		this.setLists(l);
		return SUCCESS;
	}
	
	/**
	 * 进入编辑文章
	 * @return
	 */
	public String edit(){
		System.out.println(id);
		this.setArtic(BbsArticService.getBbsArticById(id));
		return SUCCESS;
	}
	
	/**
	 * 编辑文章的操作
	 * @return
	 */
	public String editHandle(){
		BbsArticService.update(id, name, description);
		this.setLists(BbsArticService.getAll());
		return SUCCESS;
	}
	
	/**
	 * 进入添加文章
	 * @return
	 */
	public String add(){
		return SUCCESS;
	}
	
	/**
	 * 添加文章的操作
	 * @return
	 */
	public String addHandle(){
		BbsArticService.add(name, description);
		this.setLists(BbsArticService.getAll());
		return SUCCESS;
	}
	
	/**
	 * 删除文章
	 * @return
	 */
	public String delete(){
		BbsArticService.deleteById(id);
		this.setLists(BbsArticService.getAll());
		return SUCCESS;
	}
}
