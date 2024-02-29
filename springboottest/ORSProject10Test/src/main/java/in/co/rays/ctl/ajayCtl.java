package in.co.rays.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.rays.dao.ajayInt;
import in.co.rays.dto.ajayDTO;
import in.co.rays.form.ajayForm;

@RestController
@RequestMapping("ajay")
public class ajayCtl {
	
@Autowired
 ajayInt dao;
	
	@PostMapping("test")
	public void testPostMan(@RequestBody ajayForm form) {
		
		ajayDTO dto = new ajayDTO();
		dto.setId(form.getId());
		dto.setFname(form.getFname());
		dto.setLname(form.getLname());
		dao.save(dto);
	}
	

}
