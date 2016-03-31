package myArtId;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private H2Test1 h2 ;
	
	
	public H2Test1 getH2() {
		return h2;
	}

	public void setH2(H2Test1 h2) {
		this.h2 = h2;
	}

	@Override
	public String execute() throws Exception {
		h2.test1();
		return ActionSupport.SUCCESS;
	}
	
	public void validate() {
		super.validate();
	}
}
