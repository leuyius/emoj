/**
 * Description: <BR>
 *
 * @author leuyius
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
package com.emoj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: <BR>
 * 
 * @date 2017年11月2日 下午5:21:15
 * @version 1.0
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Application应用启动成功--------------------------------------------");
	}
}