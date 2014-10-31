package cn.springmvc.dao;

import cn.springmvc.model.User;


public interface UserDAO {

	/**
	 * 娣诲姞鏂扮敤鎴�
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	
	//@Select("SELECT * FROM blog WHERE id = #{id}") 
	//Blog selectBlog(int id);
}
