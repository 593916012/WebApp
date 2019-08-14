package hnu.mn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hnu.mn.mapper.IdMapper;
import hnu.mn.pojo.Id;
import hnu.mn.service.ShowIdService;

@Service
public class ShowIdServiceImpl implements ShowIdService{
	@Resource
	IdMapper idMapper;
	
	
	@Override
	public List<Id> showList() {
		// TODO Auto-generated method stub
		return idMapper.selList();
	}

}
