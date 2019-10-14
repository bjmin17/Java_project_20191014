package com.biz.service;

import java.util.List;

import com.biz.domain.BBsVO;

public interface BBsViewService {

	public void setBBsList(List<BBsVO> BBsList);
	public void viewBBS();
	public void viewBBS(String subject);
	public void viewBBS(int sDate, int eDate);
	public void viewBBS(boolean sort);
}
