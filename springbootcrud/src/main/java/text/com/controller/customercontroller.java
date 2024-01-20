package text.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import text.com.service.customerserviceImpl;

@RestController
@RequestMapping("/cst")
public class customercontroller {
	@Autowried
	private customerserviceImpl cstserv;
	@postMapping("/creates")
	public customer create(@RequestBody customer cst)
	{
		return cstserv.create(cst);
	}
	@GetMapping("/get")
	public list<customer>getcustomer()
	{
		return cstser.getcustomer();
		}
	@put

}
