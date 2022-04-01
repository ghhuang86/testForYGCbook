package co.jp.netwisdom.dao;

import cn.key.dbManager.JdbcTemplate;

public class UserInfoDAO {
	private JdbcTemplate template = new JdbcTemplate();
	
	public boolean insertUserInfo(String username,String password,String gender,String major,String intro) {
		
		int row = 0;
		
		String sql = "insert into userinfo values (?,?,?,?,?)";
		
		Object[] values = new Object[] {username,password,gender,major,intro};
		
		try {
			row = template.updata(sql, values);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return row == 1;
	}
}
