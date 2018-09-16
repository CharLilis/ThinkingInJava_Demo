package com.lilith.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lilith.mybatis.annotation.MyBatisRepository;
import com.lilith.mybatis.dao.CodeLibraryDao;
import com.lilith.mybatis.entity.CodeLibrary;
@MyBatisRepository
public class MyBatisCodeLibraryDao implements CodeLibraryDao{
	private SqlSessionTemplate template;

	@Autowired
	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}

	public CodeLibrary selectCodeLibrary(String codeNo) {
		CodeLibrary cl = template.selectOne("selectCodeLibrary", codeNo);
		return cl;
	}

	public List<CodeLibrary> selectCodeLibraryAll() {
		return template.selectList("selectCodeLibraryALL");
	}
}
