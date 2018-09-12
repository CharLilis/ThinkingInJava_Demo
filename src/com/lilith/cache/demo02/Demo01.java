package com.lilith.cache.demo02;

import org.junit.Test;
/**
 * 测试方法
 * @author 56580
 *
 */
public class Demo01 {

	@Test
	public void testCache() {
		CacheManager cacheMgr = CacheManager.getInstance();
		cacheMgr.put("3", "TestCache");
		
		System.out.println(cacheMgr.getValue("3"));
		
		
	}
}
