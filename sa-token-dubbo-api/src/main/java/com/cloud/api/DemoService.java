package com.cloud.api;

/**
 * description api
 *
 * @author aven
 * @version 1.0
 * @date 2024/3/26 16:38
 */
public interface DemoService {

	/**
	 * 登录
	 *
	 * @param loginId 账号id
	 */
	void doLogin(Object loginId);

	/**
	 * 判断是否登录，打印状态
	 */
	void isLogin(String str);

}
