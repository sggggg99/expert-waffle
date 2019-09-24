package ch06.ex;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 本例子演示了throw与 throws
 * @author cjy
 *
 */
public class ThrowsDemo {

	public ThrowsDemo() {
		// TODO Auto-generated constructor stub
	}
	public void method() 
			throws SQLException, IOException {
		if(1>2) {
			throw new IOException("IOException");
		}
		if(2>3) {
			throw new  SQLException("SQLException");
		}
	}

}
