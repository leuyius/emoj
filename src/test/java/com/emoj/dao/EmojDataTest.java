/**
 * Description: <BR>
 *
 * @author leuyius
 * @date 2017��11��2�� ����5:23:20
 * @version 1.0
 */
package com.emoj.dao;

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
	
	@Test
	public void testUft8mb4Save(){
		
	}
}
