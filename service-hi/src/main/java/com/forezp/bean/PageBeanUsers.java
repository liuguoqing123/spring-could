package com.forezp.bean;


import java.util.List;

public class PageBeanUsers {
	Long total;
	List <Users> usersList;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Users> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

	@Override
	public String toString() {
		return "PageBeanUsers{" +
				"total=" + total +
				", usersList=" + usersList +
				'}';
	}
}