/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
package com.emoj.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emoj.dao.CommentRepository;
import com.emoj.pojo.CommentDO;

/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
@RestController
public class EmojController {

	@Autowired
	private CommentRepository commentRepository;
	
	@PostMapping("/save")
	public CommentDO save(CommentDO commentDO){
		if(commentDO == null || StringUtils.isEmpty(commentDO.getContent())){
			return null;
		}
		return commentRepository.save(commentDO);
	}
}
