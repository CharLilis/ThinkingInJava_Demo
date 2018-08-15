package com.lilith.mybatis.dao;

import java.util.List;

import com.lilith.mybatis.annotation.MyBatisRepository;
import com.lilith.mybatis.entity.CodeLibrary;
@MyBatisRepository
public interface CodeLibraryMapperDao {
	public CodeLibrary selectCodeLibrary(String codeNo);
	
	public List<CodeLibrary> selectCodeLibraryALL();
}
