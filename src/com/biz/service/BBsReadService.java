package com.biz.service;

import java.io.IOException;
import java.util.List;

import com.biz.domain.BBsVO;

public interface BBsReadService {

	public void readBBS(String bbsFile) throws IOException;
	public List<BBsVO> getBBsList();
}
