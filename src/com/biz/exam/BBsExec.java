package com.biz.exam;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.service.BBsReadService;
import com.biz.service.BBsReadServiceImpV1;
import com.biz.service.BBsViewService;
import com.biz.service.BBsViewServiceImpV1;

public class BBsExec {

	public static void main(String[] args) {
		
		BBsReadService bs = new BBsReadServiceImpV1();
		BBsViewService bv = new BBsViewServiceImpV1();
		
		Scanner scanner = new Scanner(System.in);
		String bbsFile = "src/bbs.txt";
		
		try {
			bs.readBBS(bbsFile);
			
			bv.setBBsList(bs.getBBsList());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("======================================================");
		System.out.println("게시판 관리 시스템 v1");
		

		while(true) {
			System.out.println("======================================================");
			System.out.println("1. 전체 2. 제목 3. 날짜 4. 정렬 0. 종료");
			System.out.println("------------------------------------------------------");
			System.out.print("입력 >> ");
			
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM.trim());
			
			if(intM == 0) break;
			else if(intM == 1)
				bv.viewBBS();
				
			else if(intM == 2)	{
				System.out.print("제목 이름 검색 >> ");
				String strS = scanner.nextLine();
				bv.viewBBS(strS);
			}
			else if(intM == 3) {
				System.out.print("시작하는 날짜 >> ");
				String sDate = scanner.nextLine();
				System.out.print("끝나는 날짜 >> ");
				String eDate = scanner.nextLine();
				bv.viewBBS(Integer.valueOf(sDate), Integer.valueOf(eDate));
			}
			else if(intM == 4) {
				System.out.println("1. 오름차순 2. 내림차순");
				System.out.print("입력 >> ");
				String strS = scanner.nextLine();
				if(Integer.valueOf(strS) == 1) {
					bv.viewBBS(true);
				}
				else if(Integer.valueOf(strS) == 2) {
					bv.viewBBS(false);
				}
					
			}
		}
		
		System.out.println("======================================================");
		System.out.println("종료!!!");
		
		
	}
}
