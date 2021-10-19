package com.planning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class PlanningApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	private UserBO userBO;
	
	@Test	// 이 어노테이션으로 수행을 시킨다.
	void contextLoads() {
		logger.debug("### Hello world!! ###");
	}

	@Test
	void 더하기테스트() {
		logger.debug("$$$ 더하기 테스트 시작!!! $$$");
		
		int a = 10;
		int b = 20;
		assertEquals(30, sum(a, b));
	}
	
	int sum(int x, int y) {
		return x + y;
	}
	
//	@Transactional		// 이 어노테이션이 붙어있는 중괄호 영역에서 발생하는 에러는 전부 rollback이 된다.
//	@Test
//	void 디비테스트() {
//		userBO.getUserByLoginIdAndPassword(null, null);
//		assertNotNull(user);
//	}
}
