package study.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.dal.UserMapper;
import study.dal.UserMapperExt;
import study.entity.User;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月22日下午6:09:36
 */
@Service
public class UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserMapperExt userMapperExt;

	public List<User> listUser() {

		logger.info("userService method listUser invoked.");

		return userMapper.list();
	}
	
	public List<User> list2() {
		
		return userMapperExt.list();
	}
}
