package com.xinqushi.utils;

public enum UserType {
	ADMIN(0,"普通管理员"),
	SUPERADMIN(1,"超级管理员"),
	MEMBER(2,"Vip会员"),
	EXPERIENCE(3,"体验会员"),
	CLUE(4,"跟踪用户");
	
	int value;
	String name;
	
	UserType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @Title: getByValue   
	 * @Description: 跟据value获取用户类型(这里用一句话描述这个方法的作用)   
	 * @param: @param value
	 * @param: @return      
	 * @return: UserType      
	 * @throws
	 */
	public static UserType getByValue(int value) {
		for(UserType userType : UserType.values()) {
			if(userType.value == value) {
				return userType;
			}
		}
		throw new IllegalArgumentException("No element matches " + value);
	}
	
	
}
