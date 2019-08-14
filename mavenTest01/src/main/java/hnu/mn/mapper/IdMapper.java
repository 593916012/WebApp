package hnu.mn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import hnu.mn.pojo.Id;

public interface IdMapper {
	@Select("select * from demo1")
	List<Id> selList();
}
