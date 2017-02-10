package com.jero.motelmall.common.interceptor;

public class MySqlDialect extends Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return sql + " limit " + offset + " , " + limit;
	}

}
