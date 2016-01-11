package myArtId;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		return ActionSupport.SUCCESS;
	}
	
	public void validate() {
		super.validate();
	}
}
