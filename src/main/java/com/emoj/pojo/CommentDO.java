/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
package com.emoj.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
@Entity
public class CommentDO {

	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String title;

	private String content;
	
	private Integer age;
	
	/**
	 * 
	 */
	public CommentDO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CommentDO [id=" + id + ", title=" + title + ", content=" + content + ", age=" + age + "]";
	}

	
}
