/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
package com.emoj.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
@RestController
@RequestMapping("/mysession/")
public class MySessionController {

	@GetMapping("/save")
	public String save(HttpServletRequest request, String name) {
		request.getSession().setAttribute("name", name);
		return "session数据保存成功";
	}

	@GetMapping("/get")
	public String get(HttpServletRequest request) {
		String name = (String) request.getSession().getAttribute("name");
		System.out.println("session存储的name数据为：" + name);
		return "session数据获取成功（" + name + "）";
	}
}
