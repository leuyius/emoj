/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
package com.emoj.dao;

import org.springframework.data.repository.CrudRepository;

import com.emoj.pojo.CommentDO;

/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
public interface CommentRepository extends CrudRepository<CommentDO, Integer> {

}
