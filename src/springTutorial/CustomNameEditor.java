package springTutorial;

import java.beans.PropertyEditorSupport;

public class CustomNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String userName) throws IllegalArgumentException {
		
		if(!userName.contains("Mr.")) userName = "Mr." + userName;
		
		setValue(userName);
	}
	
}
