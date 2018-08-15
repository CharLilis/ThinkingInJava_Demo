package com.lilith.mybatis.mapper;

import java.util.List;

import com.lilith.mybatis.annotation.MyBatisRepository;
import com.lilith.mybatis.entity.CodeLibrary;
@MyBatisRepository
public interface CodeLibraryMapper {
 	public void addCodeLibrary(CodeLibrary codeLibrary) ;
 	public void deleteCodeLibrary(String codeNo);
 	public CodeLibrary selectCodeLibrary(String codeNo);
 	public List<CodeLibrary> selectCodeLibraryALL();
}
