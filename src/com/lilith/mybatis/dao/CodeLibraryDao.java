package com.lilith.mybatis.dao;

import java.util.List;

import com.lilith.mybatis.entity.CodeLibrary;

public interface CodeLibraryDao {
	public CodeLibrary selectCodeLibrary(String codeNo);
	
	public List<CodeLibrary> selectCodeLibraryAll();
}
