package myArtId;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("this is in execute method.");
		return ActionSupport.SUCCESS;
	}
	
	public void validate() {
		System.out.println("this is in validation of helloWorld action");
		super.validate();
	}
}
