package com.jero.motelmall.po.user;

public class LogInfo {

	private String logId;
	private String logName;
	private String logAddress;
	private String logSex;
	private Integer logPhone;
	private String logPass;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getLogAddress() {
		return logAddress;
	}

	public void setLogAddress(String logAddress) {
		this.logAddress = logAddress;
	}

	public String getLogSex() {
		return logSex;
	}

	public void setLogSex(String logSex) {
		this.logSex = logSex;
	}

	public Integer getLogPhone() {
		return logPhone;
	}

	public void setLogPhone(Integer logPhone) {
		this.logPhone = logPhone;
	}

	public String getLogPass() {
		return logPass;
	}

	public void setLogPass(String logPass) {
		this.logPass = logPass;
	}

	@Override
	public String toString() {
		return "LogInfo [logId=" + logId + ", logName=" + logName
				+ ", logAddress=" + logAddress + ", logSex=" + logSex
				+ ", logPhone=" + logPhone + ", logPass=" + logPass + "]";
	}

	
}
