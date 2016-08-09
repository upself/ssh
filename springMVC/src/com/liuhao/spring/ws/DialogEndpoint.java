package com.liuhao.spring.ws;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ibm.watson.developer_cloud.dialog.v1.DialogService;
import com.ibm.watson.developer_cloud.dialog.v1.model.Dialog;

public class DialogEndpoint {
@GET
@Path("/{dialog_id}/")
public List<Dialog> getDialogList(){
	DialogService service = new DialogService();
	service.setUsernameAndPassword("169fec25-a483-4224-b7c1-223cb2d3616f", "mR2t7IiHZ6e2");
	AtomicLong counter = new AtomicLong();
	counter.incrementAndGet();
	return service.getDialogs();
}
}
