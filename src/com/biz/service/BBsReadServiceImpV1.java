package com.biz.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.domain.BBsVO;

public class BBsReadServiceImpV1 implements BBsReadService {

		protected List<BBsVO> BBsList;
	
	
	@Override
	// bbsFile로부터 내용을 가져와서 리스트로 담는 부분
	public void readBBS(String bbsFile) throws IOException {
		// TODO Auto-generated method stub
		BBsList = new ArrayList<BBsVO>();
		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String read = null;
		
		while(true) {
			read = buffer.readLine();
			if(read == null)break;
			String[] strr = read.split(":");
			
			
			
			BBsVO vo = new BBsVO();
			vo.setSeq(Integer.valueOf(strr[0]));
			vo.setDate(Integer.valueOf(strr[2]));
			vo.setAuth(strr[1]);
			vo.setSubject(strr[3]);
			vo.setText(strr[4]);
			vo.setCount(Integer.valueOf(strr[5]));
			
			BBsList.add(vo);
		}
		buffer.close();
		fileReader.close();
		
	}

	@Override
	// 리스트를 내보내는 부분
	public List<BBsVO> getBBsList() {
		// TODO Auto-generated method stub
		return BBsList;
	}

}
