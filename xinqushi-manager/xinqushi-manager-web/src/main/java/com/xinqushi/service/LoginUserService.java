package com.xinqushi.service;

import com.xinqushi.entity.LoginUserInfo;

public interface LoginUserService {
	public LoginUserInfo getLoginUserByToken(String token);
}
