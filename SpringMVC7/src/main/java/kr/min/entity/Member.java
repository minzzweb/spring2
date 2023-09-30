package kr.min.entity;

import lombok.Data;

@Data
public class Member {
	 private String memID;
	 private String memPwd;
	 private String memName;
	 private String memPhone;
	 private String memAddr;
	 private double latitude;
	 private String longitude;	
	
}
