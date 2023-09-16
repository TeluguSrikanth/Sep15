package www.sk.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import www.sk.com.model.Student;
import www.sk.com.repo.SkRepo;

@Controller
public class SkController 
{
    @Autowired
    SkRepo skRepo;
    
    @RequestMapping("/")
    public String getSk()
    {
    	return "index";
    	
    }
    @RequestMapping("/addSkv")
    public String addSk(Student student)
    {
    	skRepo.save(student);
    	return "view.jsp"; 
    }
}
