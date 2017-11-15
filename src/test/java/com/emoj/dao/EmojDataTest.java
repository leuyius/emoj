/**
 * Description: <BR>
 *
 * @author leuyius
 * @date 2017��11��2�� ����5:23:20
 * @version 1.0
 */
package com.emoj.dao;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emoj.Application;
import com.emoj.pojo.CommentDO;

/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class EmojDataTest {

	@Autowired
	private CommentRepository commentRepository;
	
	@Test
	public void testUtf8Save(){
		CommentDO commentDO = new CommentDO();
		commentDO.setContent("测试添加内容\\xF0\\x9F\\x99\\x84");
		System.out.println("测试添加内容\\xF0\\x9F\\x99\\x84");
		commentRepository.save(commentDO);
	}
	
	/**
	 * Description: https://wiki.debris.cn/pages/viewpage.action?pageId=1736860<BR>
	 *	测试wiki中提及到Integer和int的问题
	 * @author leuyius
	 * @date 2017年11月8日 上午10:06:34
	 * @version 1.0
	 */
	@Test
	public void saveDataTestInteger(){
		CommentDO commentDO = new CommentDO();
		commentDO.setTitle("测试添加内容1108");
		commentDO.setContent("测试添加内容1108");
		System.out.println("保存之前的" + commentDO);
		commentDO = commentRepository.save(commentDO);
		System.out.println("保存之后的" + commentDO);
	}

	/**
	 * Description: https://wiki.debris.cn/pages/viewpage.action?pageId=1736860<BR>
	 *	测试wiki中提及到Integer和int的问题
	 * @author leuyius
	 * @date 2017年11月8日 上午10:06:34
	 * @version 1.0
	 */
	@Test
	public void findDataTestInteger(){
		CommentDO commentDO1 = new CommentDO();
		CommentDO commentDO = commentRepository.findOne(11);
		commentRepository.delete(commentDO1);
		System.out.println("保存之后的" + commentDO);
	}

	/**
	 * Description: https://wiki.debris.cn/pages/viewpage.action?pageId=1736860<BR>
	 *	测试wiki中提及到Integer和int的问题
	 * @author leuyius
	 * @date 2017年11月8日 上午10:06:34
	 * @version 1.0
	 */
	@Test
	public void deleteDataTestInteger(){
		CommentDO commentDO1 = new CommentDO();
		commentDO1.setAge(null);
		commentRepository.delete(commentDO1);
	}
}
