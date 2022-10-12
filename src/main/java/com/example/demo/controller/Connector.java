package com.example.demo.controller;
//import static org.assertj.core.api.Assertions.as;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.AccessVoter;
//import com.example.demo.model.Accept1;
import com.example.demo.model.AddAdmin;
import com.example.demo.model.AddVoter;
//import com.example.demo.model.AddParticipants;
import com.example.demo.model.AdminLogin;
import com.example.demo.model.Login;
//import com.example.demo.model.Post;
import com.example.demo.model.Signup;
import com.example.demo.model.SubmitVote;
import com.example.demo.model.Superadminuserannouncement;
import com.example.demo.model.Vote;
//import com.example.demo.model.Vote;
import com.example.demo.model.VoterAccess;
//import com.example.demo.repository.PostRepo;
import com.example.demo.service.accessVoterService;
//import com.example.demo.service.accept1Service;
import com.example.demo.service.addAdminService;
import com.example.demo.service.addVoterService;
//import com.example.demo.service.addParticipantsService;
import com.example.demo.service.adminLoginService;
import com.example.demo.service.loginService;
import com.example.demo.service.signupService;
import com.example.demo.service.submitVoteService;
import com.example.demo.service.superAdminLoginService;
import com.example.demo.service.superAdminUserAnnouncementService;
import com.example.demo.service.voteService;
//import com.example.demo.service.voteService;
import com.example.demo.service.voterAccessService;
@RestController
public class Connector {
	private static String voterid  = null;
	@Autowired
	private loginService ls;
	@Autowired
	private signupService ss;
	@Autowired
	private adminLoginService als;
	@Autowired
	private superAdminLoginService adls;
	@Autowired
	private superAdminUserAnnouncementService sauas;
	@Autowired
	private addAdminService aas;
	@Autowired
	private voterAccessService vas;
	@Autowired
	private accessVoterService avs;
	@Autowired
	private voteService voteservice;
	@Autowired
	private addVoterService advs;
	@Autowired
	private submitVoteService svs;
	
	String confirm="";
	@GetMapping("/")
    public ModelAndView home()
    {
    	ModelAndView mv=new ModelAndView();
    	mv.setViewName("home");
    	return mv;
    }
	@GetMapping("/adminhomepage")
	public ModelAndView AdminHomePage()
	{
		ModelAndView mv =new ModelAndView();
		mv.setViewName("adminhomepage");
		return mv;
	}
	
	
	@GetMapping("/userhomepage")
	public ModelAndView UserHomePage(HttpServletRequest request)
	{
		
		//Object voterid = null;
		request.getSession().setAttribute("VOTERID",voterid);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("userhomepage");
		return mv;
	}
	
	
	@PostMapping("/access-voter")
    public ModelAndView accessvoter()
    {
		//request.getSession().setAttribute("studentid",studentid);
    	return new ModelAndView("accept1","av",new AccessVoter());
    }
	
	
	
	
	@GetMapping("/userlogin")
    public ModelAndView login()
    {
    	return new ModelAndView("userlogin","log",new Login());
    }
	
	@GetMapping("/viewadmins")
    public ModelAndView viewadmins()
    {
    	return new ModelAndView("viewadmins","log",new Login());
    }
	
	@GetMapping("viewresults")
    public ModelAndView ViewResults()
    {
    	return new ModelAndView("viewResults","log",new Login());
    }
	
	@GetMapping("/conductElection")
    public ModelAndView ConductElection()
    {
    	return new ModelAndView("conductelecetions","log",new Login());
    }
	
	@GetMapping("/stopElection")
    public ModelAndView stopElection()
    {
    	return new ModelAndView("stopelections","log",new Login());
    }
	
	@GetMapping("/loginvalidator")
    public ModelAndView loginvalidator()
    {
    	return new ModelAndView("loginvalidator","loginvalidator",new Login());
    }
	
	@GetMapping("/superadminannouncement")
    public ModelAndView superadminannouncement()
    {
    	return new ModelAndView("superadminannouncement","saua",new Superadminuserannouncement());
    }
	
	/*@GetMapping("/superadminuserannouncement")
    public ModelAndView superadminuserannouncement()
    {
    	return new ModelAndView("superadminuserannouncement","superadminuserannouncement",new AdminLogin());
    }
	*/
	@GetMapping("/userprofile")
    public ModelAndView userprofile()
    {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userprofile");
		return mv;
		
    	//return new ModelAndView("userprofile","userprofile",new Login());
    }
	
	
	/*@PostMapping(value="/add-voter")
	  public ModelAndView addproduct(AddVoter p,@RequestParam("image") MultipartFile multipartFile)  throws IOException
	  {
	
	    ModelAndView mv=new ModelAndView("adminhome");
	    System.out.println(p.getCandidateid());
	     String fileName =(String) StringUtils.cleanPath(multipartFile.getOriginalFilename());
	          p.setImage(fileName);
	           
	          AddVoter savedUser = addvr.save(p);
	   
	          String uploadDir = "user-photos/" + savedUser.getCandidateid();
	   
	          FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
	          mv.addObject("product",p);
	    return mv;
	  }
	  */
	
	
	/*@RequestMapping(value = { "/add-voter" }, method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public ModelAndView saveUser(AddVoter user,
            @RequestParam("image") MultipartFile multipartFile) throws IOException {
         
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        user.setImage(fileName);
         
        AddVoter savedUser = addvr.save(user);
 
        String uploadDir = "user-photos/" + savedUser.getCandidateid();
 
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        
        return new ModelAndView ("/adminhome");
    }
	*/
	
	
	
	
	
	@GetMapping("/addadmin")
    public ModelAndView addadmin()
    {
		/*ModelAndView mv=new ModelAndView();
		mv.setViewName("addadmin");
		return mv;
		*/
		
    	return new ModelAndView("addadmin","aas",new AddAdmin());
    }
	
	@GetMapping("/voteraccess")
    public ModelAndView voteraccess(@ModelAttribute("log") Login log,HttpServletRequest request)
    {
		/*ModelAndView mv=new ModelAndView();
		mv.setViewName("addadmin");
		return mv;
		*/
		
		Signup s = ss.findVoterId(log.getVoterid());
		Vote a=voteservice.findVoterId(log.getVoterid());
		request.getSession().setAttribute("VOTERID",voterid);
		
    	return new ModelAndView("voteraccess","va",new VoterAccess());
    }
	
	@GetMapping("/superadminmainpage")
    public ModelAndView superadminmainpage()
    {
    	return new ModelAndView("/superadminmainpage","superadminmain",new AdminLogin());
    }
	@PostMapping("/accept")
    public ModelAndView accept(@ModelAttribute("av") AccessVoter av)
    {
		
    	return new ModelAndView("accept");
    }
	@GetMapping("/viewregistered")
    public ModelAndView viewregistered()
    {
		
    	return new ModelAndView("viewregistered");
    }
	@GetMapping("/votingprocess")
    public ModelAndView votingprocess()
    {
		
    	return new ModelAndView("votingprocess");
    }
	
	@GetMapping("/register")
    public ModelAndView signup()
    {
    	return new ModelAndView("signup","sig",new Signup());
    }
	@GetMapping("/checkvoteaccess")
    public ModelAndView checkvoteaccess()
    {
    	return new ModelAndView("checkvoteaccess");
    }
	/*@PostMapping("/accept1")
	public ModelAndView Accept1(@ModelAttribute("a1") Accept1 a1)
	{
		Accept1 a=a1s.findStudentId(a1.getStudentid());
		ModelAndView mv= new ModelAndView();
		//a1s.addsign(a1);
		return new ModelAndView("checkvoteaccess");
		
		//return new ModelAndView("addadmin","aa",new AddAdmin());
	}
	*/
	
	@GetMapping("/viewapplications")
    public ModelAndView viewapplications()
    {
    	return new ModelAndView("viewapplications");
    }
	
	@GetMapping("/addparticipants")
    public ModelAndView addparticipants()
    {
    	return new ModelAndView("addparticipants");
    }
	
	@GetMapping("/vote")
    public ModelAndView vote()
    {
    	return new ModelAndView("vote","vs" ,new Vote());
    }
	
	@PostMapping("/signsub")
	public ModelAndView signsub(@ModelAttribute("sig") Signup sig)
    {
		Signup a=ss.findVoterId(sig.getEmailid());
		ModelAndView mv= new ModelAndView();
		if(a==null)
		{	
			
			ss.addsign(sig);
			return new ModelAndView("userlogin","log",new Login());
		}
		else
		{
			
			mv.setViewName("Signup");
			//return new ModelAndView("signup","signup",new Signup());
			return mv;
			
		}
    }
	
	
	
	@PostMapping("/signSucess")
	public ModelAndView signSucess()
    {
		
			return new ModelAndView("userlogin");
		
    }
	
	
	
	
	
	@PostMapping("/add-admin")
	public ModelAndView Add_Admin(@ModelAttribute("aa") AddAdmin aa)
	{
		AddAdmin a=aas.findAdminId(aa.getAdminid());
		ModelAndView mv= new ModelAndView();
		aas.addsign(aa);
		return new ModelAndView("addadminsucessfull");
		
		//return new ModelAndView("addadmin","aa",new AddAdmin());
	}
	
	@PostMapping("/voter-access")
	public ModelAndView Voter_Access(@ModelAttribute("va") VoterAccess va)
	{
		Signup s = ss.findVoterId(va.getVoterid());
		VoterAccess a=vas.findVoterId(va.getVoterid());
		ModelAndView mv= new ModelAndView();
		
		/*try
		{
		  //String voterid=(String)request.getSession().getAttribute("voterid");

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="system";
		String password="manager";
		String query= "SELECT * from sdpsign";
		System.out.println(va.getVoterid());
		Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement stmt=conn.prepareStatement("SELECT * from voteraccess where VOTERID=?");
		stmt.setString(1,va.getVoterid());
		//ResultSet s1 =stmt.executeQuery();
		ResultSet rs=stmt.executeQuery();
		confirm=rs.getString("confirm");
		   
		   rs.close();
		   stmt.close();
		   conn.close();
		    
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		}




		
		
		if( confirm == "null")
		{*/
			vas.addlog(va);
			return new ModelAndView("checkvoteaccess");
		/*}
		else if(confirm == "0")
		{
			return new ModelAndView("/");
		}
		
		else
		{
			return new ModelAndView("userlogin");
		}
		/*}
		else
		{
			return new ModelAndView("Signup");
		}
		*/
		
		//return new ModelAndView("addadmin","aa",new AddAdmin());
	}
	
	@PostMapping("/submitvote")
	public ModelAndView Vote(@ModelAttribute("vs") Vote vs)
	{
		Signup s = ss.findVoterId(vs.getVoterid());
		Vote a=voteservice.findVoterId(vs.getVoterid());
		ModelAndView mv= new ModelAndView();
		
					voteservice.addlog(vs);
			return new ModelAndView("userlogin","log",new Login());
		
	}
	
	
	@GetMapping("/viewannouncements")
	public ModelAndView getUsers() {
	List<Superadminuserannouncement> users = sauas.getAllRecords();
	ModelAndView model = new ModelAndView();
	model.setViewName("viewannouncements");
	model.addObject("users", users);
	return model;

	}
	
	/*@GetMapping("/viewannouncement")
	public ModelAndView getAnnounce()
	{
		return new ModelAndView("viewannouncements","viewannouncements",new Login());
	}
	*/
	
	@PostMapping("/superadminuserannouncement")
	public ModelAndView superadminuserannouncement(@ModelAttribute("saua") Superadminuserannouncement saua)
    {
		//SuperAdminUserAnnouncementRepository a=sauas.findAnnouncement(saua.getAnnouncement());
		//Superadminuserannouncement a=(Superadminuserannouncement) sauas.findAnnouncement(saua.getAnnouncement());
		ModelAndView mv= new ModelAndView();
		sauas.addAnnouncement(saua);
		
			return new ModelAndView("userlogin","log",new Login());
		
			
			
		
    }
	
	
	@PostMapping("/loginsub")
	public ModelAndView loginsub(@ModelAttribute("log") Login log,HttpServletRequest request) {
	String voterid=log.getVoterid();
	Signup a = ss.findVoterId(log.getVoterid());
	Login b = ls.findVoterId(log.getVoterid());
	AddAdmin aa=aas.findAdminId(log.getVoterid());
	//SuperAdminLogin sal=adls.findVoterId(log.getVoterid());
	//request.getSession().setAttribute("voterid",voterid);
	ModelAndView mv= new ModelAndView();
	if(a!=null && (a.getPassword().equals(log.getPassword()))) {
		  //Object vi = null;
		  //if(b!=null && (b.getPassword().equals(log.getPassword()))){
		//ls.addlog(log);
		  request.getSession().setAttribute("voterid",a.getVoterid());
		    mv.addObject("username",log.getVoterid());
		    mv.setViewName("userhomepage");
		    return mv;
	}
	else if(aa!=null && (aa.getPassword().equals(log.getPassword())))
	{
		request.getSession().setAttribute("voterid",voterid);
		mv.addObject("username",log.getVoterid());
		mv.setViewName("adminhomepage");
	return mv;//("userhomepage");
	}
	else if(log.getVoterid().equals("ADMIN@HOD") && log.getPassword().equals("ADMIN@HOD"))
	{
		request.getSession().setAttribute("voterid",voterid);
		mv.addObject("username",log.getVoterid());
		mv.setViewName("superadminmainpage");
	return mv;//("userhomepage");
	}
	
	else {
	//ls.addlog(log);
	//request.getSession().setAttribute("email", em);
	 return new ModelAndView("signup","sig",new Signup());
	}

	//}
	//else if(c!=null && (c.getPassword().equals(log.getPassword()))) {
	//request.getSession().setAttribute("email",em);
	//return new ModelAndView("adminhome");
	//}
	//else if(d!=null&&(d.getPassword().equals(log.getPassword()))) {
	//request.getSession().setAttribute("email",em);
	//return new ModelAndView("polhome");
	//}
	}
	
	@GetMapping("/addvoter")

	public ModelAndView add_candidate_1()
	{
		return new ModelAndView("addvoter", "av",new AddVoter());
	}
	
	@PostMapping("/add-voter")
	public ModelAndView Add_Vote(@ModelAttribute("av") AddVoter av)
	{
		//Signup s = ss.findVoterId(av.getVoterid());
		//AddVoter a=advs.findVoterId(av.getVoterid());
		advs.addsign(av);
		ModelAndView mv= new ModelAndView();
		
			
			return new ModelAndView("userlogin","log",new Login());
		
	}
	@GetMapping("/uservote")

	public ModelAndView uservote()
	{
		return new ModelAndView("uservote","res",new SubmitVote());
	}
	
	@GetMapping("/addadminsucess")

	public ModelAndView addaminsucess()
	{
		return new ModelAndView("addadminsucessfull");
	}
	
	@PostMapping("/submitForm")
	public ModelAndView SubmitVote(@ModelAttribute("res") SubmitVote res)
	{
		//Signup s = ss.findVoterId(av.getVoterid());
		//AddVoter a=advs.findVoterId(av.getVoterid());
		svs.addreservationrecord(res);
		ModelAndView mv= new ModelAndView();
		
			
			return new ModelAndView("userlogin","log",new Login());
		
	}
	
	
	
	
	
}
