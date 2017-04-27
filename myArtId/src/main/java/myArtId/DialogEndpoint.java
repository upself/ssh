package myArtId;

import java.util.List;

import javax.ws.rs.GET;

import com.ibm.watson.developer_cloud.dialog.v1.DialogService;
import com.ibm.watson.developer_cloud.dialog.v1.model.Dialog;

public class DialogEndpoint {
  
  @GET
  public List<Dialog> test(){
	  DialogService service = new DialogService();
	  service.setUsernameAndPassword("169fec25-a483-4224-b7c1-223cb2d3616f", "mR2t7IiHZ6e2");
	  System.out.println("nihao");
	  return service.getDialogs();
  }
}
