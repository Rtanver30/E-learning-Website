package com.education.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.education.Entity.Entity1;
import com.education.reo.HomeContactInsterRepository;


@org.springframework.stereotype.Controller


public class Controller {

    @Autowired
    private HomeContactInsterRepository userRepository;

    @PostMapping("/savecontact")
    public String saveUser(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("subject") String subject,
            @RequestParam("message") String message
    ) {
        Entity1 user = new Entity1();
        user.setName(name);
        user.setEmail(email);
        user.setSubject(subject);
        user.setMessage(message);
        userRepository.save(user);
        return "savecontact";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/course")
    public String course() {
        return "course";
    }
    
    @GetMapping("/about")
    public String about() {
        return "ReadMore/histoy";
    }
        
    @GetMapping("/history")
    public String history() {
        return "ReadMore/history";
    }

    @GetMapping("/polity")
    public String polity() {
        return "ReadMore/polity";
        
    }
    @GetMapping("/savecontct")
    public String savecontact() {
    	return "savecontact";
    }
    
    	@GetMapping("/itimain")
    	public String itimain() {
    		return "ITI/itimain";
    	}
    		@GetMapping("/index")
    		public String index() {
    			return "index";
    		}
    		
    		@GetMapping("/special")
    		public String special() {
    			return "ITI/special";
    		}
    		@GetMapping("/fitter")
    		public String fitter() {
    			return "ITI/all_trade/fitter/fitter";
    		}

    		@GetMapping("/take_quiz")
    		public String take_quiz() {
    			return "ITI/all_trade/fitter/take_quiz";
    		}
    		
    				
    		@GetMapping("/electronics")
    		public String electronics() {
    			return "ITI/all_trade/electronics/electronics";
    		}
    		@GetMapping("/machinist")
    		public String machinist() {
    			return "ITI/all_trade/machinist/machinist";
    		}
    		@GetMapping("/electrician")
    		public String electrician() {
    			return "ITI/all_trade/electrician/electrician";
    		}
    		@GetMapping("/copa")
    		public String copa() {
    			return "ITI/all_trade/copa/copa";
    		}
    		@GetMapping("/networking")
    		public String networking() {
    			return "ITI/all_trade/Networking/networking";
    		}
    		@GetMapping("/welder")
    		public String welder() {
    			return "ITI/all_trade/welder/welder";
    		}
    		@GetMapping("/tarner")
    		public String tarner() {
    			return "ITI/all_trade/tarner/tarner";
    		}
    		@GetMapping("/beautician")
    		public String beautician() {
    			return "ITI/all_trade/beautician/beautician";
    		}
    		@GetMapping("/carpenter")
    		public String carpenter() {
    			return "ITI/all_trade/carpenter/carpenter";
    		}
    		
    @GetMapping("/Back to Topics")
    public String BacktoTopics() {
    return "ITI/itimain";
    }
    		
    
}
