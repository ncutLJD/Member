package com.xinqushi.service;

import com.xinqushi.utils.MemberResult;

public interface UserLoginService {
	public MemberResult login(String username,String password);
}
