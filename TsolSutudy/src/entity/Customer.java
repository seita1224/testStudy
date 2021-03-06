package entity;

import java.io.Serializable;

public class Customer implements Serializable{
	private String custCode; //得意先コード
	private String custName; //得意先名
	private String telNo; //電話番号
	private String postalCode; //郵便番号
	private String address; //住所
	private int discountRate; //割引率

	/**
	 * @return custCode
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
	 * @return custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * @return telNo
	 */
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	/**
	 * @return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return Address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return discountRate
	 */
	public int getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate
	 */
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
}
