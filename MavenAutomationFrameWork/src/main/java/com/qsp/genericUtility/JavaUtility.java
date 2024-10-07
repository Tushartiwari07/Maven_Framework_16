package com.qsp.genericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	//Java logic for Local date and time
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}

}
