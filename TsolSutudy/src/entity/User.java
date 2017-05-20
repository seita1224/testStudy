package entity;

import java.io.Serializable;

public class User implements Serializable{
	private String userID; //従業員番号
	private String userName; //従業員名
	private String password; //パスワード

	/**
	 * @return userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
