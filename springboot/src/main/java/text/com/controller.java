package text.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller
{
	@GetMapping("/hai")
	public String hello()
	{
	return "welcome";
}

}
