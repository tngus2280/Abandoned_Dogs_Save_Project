package admin.dao.face;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import admin.dao.impl.AdminMemberListDaoImpl;
import user.member.dto.MemberDTO;

public interface AdminMemberListDao {
	
	/**
	 * 회원조회
	 * @param - HashMap<String,Object> opt
	 * 
	 * @return List<MemberDTO> - 회원정보 반환
	 */
	public List<MemberDTO> select(HashMap <String,Object> listOpt);
	
	/**
	 * 조건에 따른 회원 수 카운트
	 * 
	 * 페이징에 쓰기위함
	 * @param - HashMap<String,Object> opt
	 * 
	 * @return - List<MemberDTO> - 회원 수 정수값 반환
	 */
	public int getMemberCount(HashMap<String,Object> listOpt);
	
	/**
	 * 회원 삭제
	 * 
	 * @param MemberDTO - memberDTO.userId 를 통해서 삭제 대상 판단 파라미터
	 * @return - int(1,0) -> 삭제유무 판단 int
	 */
	public int delete(MemberDTO member);
	
	/**
	 * 유저 id 를 통한 멤버 전체 정보값 반환
	 * 
	 * @param - String userid
	 * @return - MemberDTO
	 */
	public MemberDTO selectID(String userid);
	
	/**
	 * 
	 * 회원 전체 조회
	 * @param - 없음
	 * @return - List<MemberDTO>
	 */
	public List<MemberDTO> selectAll();
	
	/**
	 * 회원 한달간 날짜 -15 , +15로 해쉬맵 반환
	 * @param - void;
	 * @return - HashMap<Date,Integer>
	 */
	public HashMap<Date,Integer> graphMember();

}		