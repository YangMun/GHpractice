package checkValue;

import java.util.regex.Pattern;

import javax.swing.JTextField;

public class ValueCheck {
	private String id = "ysu";
	private String passwd = "1234";
	boolean check;
	private static ValueCheck instance = new ValueCheck();
	    
	    public static ValueCheck getInstance() {
	        return instance;
	    }
	    
	    private ValueCheck() { }
	    
	    public boolean IdCheck(JTextField usrtxt) {
	    	 if(Pattern.matches(id, (CharSequence) usrtxt.getText()) == true) // 전화번호 정규식 적용
		        {
	    		 check = true;
		        }else{
		        	check = false;
		        }
			return check;
	    	
	    }
	    
	    public boolean PwCheck(JTextField pwtxt) {
	    	 if(Pattern.matches(passwd, (CharSequence) pwtxt.getText()) == true) // 전화번호 정규식 적용
		        {
	    		 check = true;
		        }else{
		        	check = false;
		        }
			return check;
	    	
	    }
}
