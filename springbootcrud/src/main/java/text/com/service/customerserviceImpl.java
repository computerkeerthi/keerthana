package text.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import text.com.Repository.customerRepository;
import text.com.entity.customer;

@Service

public class customerserviceImpl {
	@Autowired
	private customerRepository cstRepo;
	public customer create(customer cst)
	{
		return cstRepo.save(cst);
	}
	public List<customer>getcustomer(){
		return cstRepo.findAll();
	}
	public customer update(int id,customer cst) {
		return cstRepo.save(cst);
	}
	public void delete(int id) {
		cstRepo.deleteById(id);
	}
	
	
	

}
