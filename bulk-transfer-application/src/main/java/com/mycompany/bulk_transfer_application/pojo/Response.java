package com.mycompany.bulk_transfer_application.pojo;

import lombok.Data;

/**
 * Response represent the response JSON
 */
@Data
public class Response {
	// [Q]: what does "code" mean?
	private int code;
	private String description;

}
