package com.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;
	
	//매퍼
	private static String namespace="com.board.mappers.member";

	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".register", vo); 
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		//return sql.selectOne(namespace + ".login", vo);
		return sql.selectOne(namespace + ".loginBcrypt", vo);
	}

	@Override
	public void modify(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".modify", vo);
	}

	@Override
	public void withdrawal(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".withdrawal",vo);
	}

	@Override
	public MemberVO idCheck(String userId) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".idCheck", userId);
	}

}
