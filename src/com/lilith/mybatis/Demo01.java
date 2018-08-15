package com.lilith.mybatis;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lilith.mybatis.dao.CodeLibraryDao;
import com.lilith.mybatis.dao.CodeLibraryMapperDao;
import com.lilith.mybatis.entity.CodeLibrary;
import com.lilith.mybatis.mapper.CodeLibraryMapper;

public class Demo01 {
	/**
	 * 获得Mybatis的SqlSession
	 * @throws Exception
	 */
	@Test
	public void testSqlSession() throws Exception {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);
		
		SqlSession session = sf.openSession();
		System.out.println(session);
		
		session.close();
	}
	
	/**
	 * 通过Mybatis的SqlSession执行sql
	 * @throws Exception
	 */
//	@Test
	public void testAdd() throws Exception {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);
		
		SqlSession session = sf.openSession();
		
		CodeLibrary codeLibrary = new CodeLibrary();
		codeLibrary.setCodeNo("XOX");
		codeLibrary.setItemNo("0010");
		codeLibrary.setItemName("Hi~ o(*￣▽￣*)ブ");
		session.insert("addCodeLibrary", codeLibrary);
		
		session.commit();
		session.close();
	}
	
	/**
	 * 通过Mybatis的SqlSession执行sql
	 * @throws Exception
	 */
//	@Test
	public void testDelete() throws Exception {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory sf = sfb.build(reader);
		
		SqlSession session = sf.openSession();
		
		session.delete("deleteCodeLibrary", "XOX");
		
		session.commit();
		
		session.close();
	}

	/**
	 * MyBatis：1、在Spring容器的XML中直接配对象的MapperBean
	 * 		   2、通过对象的XML，查询出所使用的Mapper类，再使用
	 */
//	@Test
	public void testSM() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring02.xml");
		CodeLibraryMapper clMapper = ac.getBean("codeLibraryMapper", CodeLibraryMapper.class);
		CodeLibrary cl = clMapper.selectCodeLibrary("ImageTree");
		System.out.println(cl.toString());
		List<CodeLibrary> clList = clMapper.selectCodeLibraryALL();
		for(CodeLibrary cl02 : clList) {
			System.out.println(cl02.toString());
		}
	}
	
	/**
	 * Mybatis：定义指定注释，在Spring容器中配置Mapper的组件扫描，查找加了指定注释的Mapper类
	 */
//	@Test
	public void testSM02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-annotation.xml");
		CodeLibraryMapper clMapper = ac.getBean("codeLibraryMapper", CodeLibraryMapper.class);
		CodeLibrary cl = clMapper.selectCodeLibrary("ImageTree");
		System.out.println(cl.toString());
		List<CodeLibrary> clList = clMapper.selectCodeLibraryALL();
		for(CodeLibrary cl02 : clList) {
			System.out.println(cl02.toString());
		}
	}
	
	/**
	 * Spring和MyBatis：
	 * 		使用MyBatis实现sqlTemplate，在直接通过配置文件执行
	 */
//	@Test
	public void testSMTemplate() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-template.xml");
		CodeLibraryDao clDao = ac.getBean("myBatisCodeLibraryDao", CodeLibraryDao.class);
		CodeLibrary cl = clDao.selectCodeLibrary("ImageTree");
		System.out.println(cl.toString());
		List<CodeLibrary> clList = clDao.selectCodeLibraryAll();
		for(CodeLibrary cl02 : clList) {
			System.out.println(cl02.toString());
		}
	}
	
	/**
	 * Spring和MyBatis：
	 * 		使用MyBatis实现Dao，嵌入Spring中使用
	 */
//	@Test
	public void testSMDao() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring03.xml");
		CodeLibraryMapperDao clDao = ac.getBean("codeLibraryMapperDao", CodeLibraryMapperDao.class);
		CodeLibrary cl = clDao.selectCodeLibrary("ImageTree");
		System.out.println(cl.toString());
		List<CodeLibrary> clList = clDao.selectCodeLibraryALL();
		for(CodeLibrary cl02 : clList) {
			System.out.println(cl02.toString());
		}
	}
	
	
}
