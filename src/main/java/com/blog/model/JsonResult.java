package com.blog.model;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {
	
	private static final long serialVersionUID = 5323143294698029902L;
	
	private Integer status;
	private String message;
	private T date;
	public JsonResult() {
		super();
	}
	public JsonResult(Integer status) {
		super();
		this.status = status;
	}
	public JsonResult(Integer status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public JsonResult(Integer status, T date) {
		super();
		this.status = status;
		this.date = date;
	}
	public JsonResult(Integer status, String message, T date) {
		super();
		this.status = status;
		this.message = message;
		this.date = date;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getDate() {
		return date;
	}
	public void setDate(T date) {
		this.date = date;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		JsonResult<T> other = (JsonResult<T>) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", message=" + message + ", date=" + date + "]";
	}
	
	
}
