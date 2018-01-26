package study;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import study.entity.User;
import study.service.UserService;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月22日下午6:12:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class SpringTest {

	private static final Logger logger = LoggerFactory.getLogger(SpringTest.class);

	@Autowired
	private UserService userService;

	@Test
	public void test1() throws Exception {

		List<User> users = userService.listUser();

		logger.info("users=" + JSON.toJSONString(users));
	}

	@Test
	public void test2() throws Exception {

		List<User> users = userService.list2();

		System.err.println("users=" + JSON.toJSONString(users));
	}
}
