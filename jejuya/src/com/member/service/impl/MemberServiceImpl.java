package com.member.service.impl;

import com.member.dao.impl.MemberDaoImpl;
import com.member.dto.MemberDto;
import com.member.service.MemberService;

public class MemberServiceImpl implements MemberService{

	MemberDaoImpl dao = MemberDaoImpl.getInstance();
	
	private static MemberServiceImpl single = null;
	
	private MemberServiceImpl() {}
	
	public static MemberServiceImpl getInstance() {
		if( single == null ) {
			single = new MemberServiceImpl();
		}
		return single;
	}
	
	@Override
	public boolean addMember(MemberDto dto) {
		// TODO Auto-generated method stub
		return dao.addMember(dto);
	}

	@Override
	public MemberDto getOneMember(String id) {
		// TODO Auto-generated method stub
		return dao.getOneMember(id);
	}

	@Override
	public boolean isExistingId(String id) {
		// TODO Auto-generated method stub
		return dao.isExistingId(id);
	}		
	
	
}
