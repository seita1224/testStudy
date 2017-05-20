package entity;

import java.io.Serializable;
import java.sql.Date;

public class Orders implements Serializable {
	private String ordersNo; //受注番号
	private String custCode; //得意先コード
	private String userNo; //従業員コード
	private int orderAmount; //受注金額
	private int numberOfOrders; //受注件数
	private Date dueDate; //納入日
	private Date orderDate; //受注日

	/**
	 * @return
	 */
	public String getOrdersNo() {
		return ordersNo;
	}

	/**
	 * @param ordersNo
	 */
	public void setOrdersNo(String ordersNo) {
		this.ordersNo = ordersNo;
	}

	/**
	 * @return
	 */
	public String getCustCode() {
		return custCode;
	}

	/**
	 * @param custCode
	 */
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	/**
	 * @return
	 */
	public String getUserNo() {
		return userNo;
	}

	/**
	 * @param userNo
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	/**
	 * @return
	 */
	public int getOrderAmount() {
		return orderAmount;
	}

	/**
	 * @param orderAmount
	 */
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	/**
	 * @return
	 */
	public int getNumberOfOrders() {
		return numberOfOrders;
	}

	/**
	 * @param numberOfOrders
	 */
	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders = numberOfOrders;
	}

	/**
	 * @return
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
