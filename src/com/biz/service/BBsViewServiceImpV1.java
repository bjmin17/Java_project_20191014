package com.biz.service;

import java.util.Collections;
import java.util.List;

import com.biz.domain.BBsVO;

public class BBsViewServiceImpV1 implements BBsViewService {

	protected List<BBsVO> BBsList;
	
	@Override
	public void setBBsList(List<BBsVO> BBsList) {
		// TODO List를 불러오는 부분
		this.BBsList = BBsList;
	}

	@Override
	public void viewBBS() {
		// TODO 전체 리스트를 보는 부분
		this.title();
		
		for(BBsVO vo : BBsList) {
			
			System.out.print(vo.getSeq() + "\t");
			System.out.print(vo.getAuth() + "\t");
			System.out.print(vo.getDate() + "\t");
			System.out.print(vo.getSubject() + "\t");
			System.out.print(vo.getText() + "\t");
			System.out.print(vo.getCount() + "\n");
		}
	}

	@Override
	public void viewBBS(String subject) {
		// TODO 문자열 매개변수로 받아서 일치하는 제목 출력
		
		this.title();
		
		for(BBsVO vo : BBsList) {
			if(vo.getSubject().contains(subject.trim())) {
				System.out.print(vo.getSeq() + "\t");
				System.out.print(vo.getAuth() + "\t");
				System.out.print(vo.getDate() + "\t");
				System.out.print(vo.getSubject() + "\t");
				System.out.print(vo.getText() + "\t");
				System.out.print(vo.getCount() + "\n");
			}
		}
	}

	@Override
	public void viewBBS(int sDate, int eDate) {
		// TODO 두 날짜를 매개변수로 받아서 작성일자 출력
		
		this.title();
		
		for(BBsVO vo : BBsList) {
			if(vo.getDate() >= sDate && vo.getDate() <= eDate) {
				System.out.print(vo.getSeq() + "\t");
				System.out.print(vo.getAuth() + "\t");
				System.out.print(vo.getDate() + "\t");
				System.out.print(vo.getSubject() + "\t");
				System.out.print(vo.getText() + "\t");
				System.out.print(vo.getCount() + "\n");
			}
		}
	}

	@Override
	public void viewBBS(boolean sort) {
		// TODO 오름차순, 내림차순
		
		this.title();
		// 오름차순
		if(sort == true) {
//			Collections.sort((List<T>) BBsList);
			
			for(BBsVO vo : BBsList) {
				
				System.out.print(vo.getSeq() + "\t");
				System.out.print(vo.getAuth() + "\t");
				System.out.print(vo.getDate() + "\t");
				System.out.print(vo.getSubject() + "\t");
				System.out.print(vo.getText() + "\t");
				System.out.print(vo.getCount() + "\n");
			}
		}
		
		// 내림차순
//		Collections.sort(BBsList);
		for(BBsVO vo : BBsList) {
				
			System.out.print(vo.getSeq() + "\t");
			System.out.print(vo.getAuth() + "\t");
			System.out.print(vo.getDate() + "\t");
			System.out.print(vo.getSubject() + "\t");
			System.out.print(vo.getText() + "\t");
			System.out.print(vo.getCount() + "\n");
		}
	}
	
	public void title() {
		System.out.println("------------------------------------------------------");
		System.out.println("순번\t작성자\t작성일자\t제목\t내용\t조회수");
		System.out.println("------------------------------------------------------");
	}
}
