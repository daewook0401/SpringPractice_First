package com.kh.spring.member.model.service;

import org.springframework.stereotype.Component;

import com.kh.spring.exception.InvalidParameterException;
import com.kh.spring.exception.TooLargeValueException;
import com.kh.spring.member.model.dto.MemberDTO;

@Component
public class MemberValidator {
	
	private void validatedLength(MemberDTO member) {
		if(member.getMemberId().length() > 10) {
			throw new TooLargeValueException("아이디가 너무 깁니다. 10자 이내로 작성해주세요.");
		}
	}
	
	private void validatedValue(MemberDTO member) {
		if(member == null || member.getMemberId() == null ||
				member.getMemberId().trim().isEmpty() ||
				member.getMemberPw() == null ||
				member.getMemberPw().trim().isEmpty()) {
			throw new InvalidParameterException("아이디나 비밀번호를 입력해주십시오.");
		}
	}
	public void validatedLoginMember(MemberDTO member) {
		validatedLength(member);
		validatedValue(member);
	}
}
