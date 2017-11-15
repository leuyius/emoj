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
import com.emoj.util.EmojiFilter;

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
	public CommentDO save(CommentDO commentDO) {
		if (commentDO == null || StringUtils.isEmpty(commentDO.getTitle())
				|| StringUtils.isEmpty(commentDO.getContent())) {
			return null;
		}
		// 表情处理
		System.out.println(commentDO.getTitle());
		System.out.println(commentDO.getContent());
		if (EmojiFilter.containsEmoji(commentDO.getTitle())) {
			System.out.println("======title======");
			commentDO.setTitle(EmojiFilter.filterEmoji(commentDO.getTitle()));
		}
		if (EmojiFilter.containsEmoji(commentDO.getContent())) {
			System.out.println("======content======");
			commentDO.setContent(EmojiFilter.filterEmoji(commentDO.getContent()));
		}
		
		return commentRepository.save(commentDO);
	}
}
