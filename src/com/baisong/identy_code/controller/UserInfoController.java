package com.baisong.identy_code.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baisong.identy_code.domain.AdminInfo;
import com.baisong.identy_code.domain.Name;
import com.baisong.identy_code.domain.Salary;
import com.baisong.identy_code.domain.Staff;
import com.baisong.identy_code.domain.UserInfo;
import com.baisong.identy_code.service.UserInfoService;
import com.sun.mail.iap.Response;


@Controller

public class UserInfoController 
{

	@Resource
	UserInfoService userInfoService;
	
	//用户登录界面
	@RequestMapping("/servlet/loginServlet.action")
	public String login(UserInfo user,Model model) throws Exception 
	{
		//核对登陆信息
        user=userInfoService.checkLogin(user.getUsername(), user.getPassword());
    
        if(user!=null)
        {
            model.addAttribute(user);
        
            if(user.getUsername().equals("admin"))
            {
            	return "redirect:/servlet/nameServlet.action";//重定向          
            }
            else
            {
            	return "redirect:/servlet/staffServlet.action?username="+user.getUsername();// 路径 WEB-INF/test/welcome.jsp
            }
            
        }
        return "fail";
    }
	
	
	//跳转到管理员职工号页面
	@RequestMapping("/servlet/nameServlet.action")
	public String name(Model model)
	{
		//获取管理员信息集合
		List<Name> name = userInfoService.findName(null);
		model.addAttribute("name", name); //控制器是通过Model把数据传到view层
		return "name";
	}
	
	//跳转到管理员薪资页面
	@RequestMapping("/servlet/salaryServlet.action")
	public String salary(Model model)
	{
		//获取管理员信息集合
		List<Salary> salary = userInfoService.findSalary(null);
		model.addAttribute("salary", salary); //控制器是通过Model把数据传到view层
		return "salary";
	}
	
	//跳转到职工页面
		@RequestMapping("/servlet/staffServlet.action")
		public String staffList(String username, Model model)
		{
			//获取管理员信息集合
			List<Staff> staff = userInfoService.findStaffByName(username);
			model.addAttribute("staff", staff); //控制器是通过Model把数据传到view层
			return "staff";
		}
		
		//修改职工信息之后返回职工主页
		@RequestMapping("/servlet/staffServlets.action")
		public String staffLists(String staff_num, Model model)
		{
			//获取管理员信息集合
			List<Staff> staff = userInfoService.findStaffByName(staff_num);
			model.addAttribute("staff", staff); //控制器是通过Model把数据传到view层
			return "staff";
		}
	
		//跳转到薪资信息界面
		@RequestMapping("/servlet/toSalaryServlet.action")
		public String toStaffList(String staff_num, Model model)
		{
			//获取管理员信息集合
			Name name = userInfoService.findNameSalary(staff_num);
			model.addAttribute("name", name); //控制器是通过Model把数据传到view层
			return "salaryRM";
		}
		
	//转到管理员职工号新增页面
	@RequestMapping("/servlet/toNameCreate.action")
	public String toNameCreate()
	{
		return "CreateName";
	}
	
	//转到管理员薪资新增页面
		@RequestMapping("/servlet/toSalaryCreate.action")
		public String toCreate()
		{
			return "CreateSalary";
		}
	
	//转到职工新增页面
		@RequestMapping("/servlet/toStaffCreate.action")
		public String tostaffCreate()
		{
			return "CreateStaff";
		}
	
	//管理员职工号添加保存内容
	@RequestMapping("/servlet/insertName.action")
	public String insertName(Name name, UserInfo user)
	{
		user.setUsername(name.getStaff_num());
		user.setPassword("123456");
		userInfoService.insertName(name);
		userInfoService.insertUser(user);
		//实现重定向
		return "redirect:/servlet/nameServlet.action";
	}
	
	

	//管理员薪资添加保存内容
	@RequestMapping("/servlet/insertSalary.action")
	public String insertSalary(Salary salary)
	{
		userInfoService.insertSalary(salary);
		//实现重定向
		return "redirect:/servlet/salaryServlet.action";
	}
	
	
	//职工添加保存内容
		@RequestMapping("/servlet/insertStaffServlet.action")
		public String insertStaff(Staff staff)
		{
			userInfoService.insertStaff(staff);
			//实现重定向
			return "redirect:/servlet/staffServlet.action";
		}
	
		/*
		 * 修改管理员职工号信息
		 * 1. 跳转到EditName.jsp
		 * 2. 修改内容
		 * 3. 跳转到管理员职工号主页
		 */
		@RequestMapping("/servlet/findUserByName.action") 
	    public String findUserByName(String staff_num,HttpServletRequest request,Model model){  
	        //el表达式是从四大与对象获取数据
			request.setAttribute("user", userInfoService.findUserByName(staff_num));  
	        //控制器通过model将数据通过view层
			model.addAttribute("user", userInfoService.findUserByName(staff_num));  
	        return "EditUser";  
		}
		
			//管理员职工号修改内容
			@RequestMapping("/servlet/updateUser.action")
			public String updateUser(UserInfo user, Model model, HttpServletRequest request)
			{
				 if(userInfoService.updateUser(user))
				 { 
					//通过id来获取对象
					UserInfo users = userInfoService.findUserByName(user.getUsername());
					request.setAttribute("user", users);//el获取对象
					model.addAttribute("user", users);
					//实现重定向，转到管理员主页
					return "redirect:/servlet/staffServlet.action";
				 }
				 else
				 {
					 return null;
				 }
			}
		
		
		
	/*
	 * 修改管理员职工号信息
	 * 1. 跳转到EditName.jsp
	 * 2. 修改内容
	 * 3. 跳转到管理员职工号主页
	 */
	@RequestMapping("/servlet/findNameById.action") 
    public String findNameById(int id,HttpServletRequest request,Model model){  
        //el表达式是从四大与对象获取数据
		request.setAttribute("name", userInfoService.findNameById(id));  
        //控制器通过model将数据通过view层
		model.addAttribute("name", userInfoService.findNameById(id));  
        return "EditName";  
	}
	
		//管理员职工号修改内容
		@RequestMapping("/servlet/updateName.action")
		public String updateName(Name name, Model model, HttpServletRequest request)
		{
			 if(userInfoService.updateName(name))
			 { 
				//通过id来获取对象
				Name names = userInfoService.findNameById(name.getId());
				request.setAttribute("name", names);//el获取对象
				model.addAttribute("name", names);
				//实现重定向，转到管理员主页
				return "redirect:/servlet/nameServlet.action";
			 }
			 else
			 {
				 return null;
			 }
		}
	
		
		/*
		 * 修改管理员信息
		 * 1. 跳转到EditSalary.jsp
		 * 2. 修改内容
		 * 3. 跳转到管理员主页
		 */
		@RequestMapping("/servlet/findSalaryById.action") 
	    public String findSalaryById(int id,HttpServletRequest request,Model model){  
	        //el表达式是从四大与对象获取数据
			request.setAttribute("salary", userInfoService.findSalaryById(id));  
	        //控制器通过model将数据通过view层
			model.addAttribute("salary", userInfoService.findSalaryById(id));  
	        return "EditSalary";  
		}
		
		@RequestMapping("/servlet/findSalaryByName.action") 
	    public String findSalaryByName(String staff_num,HttpServletRequest request,Model model){  
	        //el表达式是从四大与对象获取数据,需要的参数是“staff”--即name属性值
			request.setAttribute("salary", userInfoService.findSalaryByName(staff_num));  
	        //控制器通过model将数据通过view层
			model.addAttribute("salary", userInfoService.findSalaryByName(staff_num));  
	        return "salaryX";  
		}
		
			//管理员修改内容
			@RequestMapping("/servlet/updateSalary.action")
			public String updateSalary(Salary salary, Model model, HttpServletRequest request)
			{
				 if(userInfoService.updateSalary(salary))
				 { 
					//通过id来获取对象
					Salary salary2 = userInfoService.findSalaryById(salary.getId());
					request.setAttribute("salary", salary2);//el获取对象
					model.addAttribute("salary", salary2);
					//实现重定向，转到管理员主页
					return "redirect:/servlet/salaryServlet.action";
				 }
				 else
				 {
					 return null;
				 }
			}
		
		
		/*
		 * 修改职工信息
		 * 1. 跳转到EditStaff.jsp
		 * 2. 修改内容
		 * 3. 跳转到管理员主页
		 */
		@RequestMapping("/servlet/findStaffById.action") 
	    public String findStaffById(int id,HttpServletRequest request,Model model){  
	        //el表达式是从四大与对象获取数据,需要的参数是“staff”--即name属性值
			request.setAttribute("staff", userInfoService.findStaffById(id));  
	        //控制器通过model将数据通过view层
			model.addAttribute("staff", userInfoService.findStaffById(id));  
	        return "EditStaff";  
		}
		
			//管理员修改内容
			@RequestMapping("/servlet/updateStaffServlet.action")
			public String updateStaff(Staff staff, Model model, HttpServletRequest request)
			{
				 if(userInfoService.updateStaff(staff))
				 { 
					//通过id来获取对象
					Staff staff1 = userInfoService.findStaffById(staff.getId());
					request.setAttribute("staff", staff1);//el获取对象
					model.addAttribute("staff", staff1);
					//实现重定向，转到管理员主页
					return "redirect:/servlet/staffServlets.action?staff_num="+staff1.getStaff_num();
				 }
				 else
				 {
					 return null;
				 }
			}

		
		//删除一条管理员职工号信息
		@RequestMapping("/servlet/deleteName.action")
		public void deleteName(int id, HttpServletResponse response)
		{
			 String result = "{\"result\":\"error\"}"; 
			 
			 if(userInfoService.deleteName(id))
			 { 
				result= "{\"result\":\"success\"}";
				
			 }
			 
			 response.setContentType("application/json");  
			 
			 try 
			 {  
		        PrintWriter out = response.getWriter();  
		        out.write(result);  
		     }
			 catch (IOException e) 
			 {  
		        e.printStackTrace();  
		     }  
		}
		
		//删除一条管理员薪资信息
				@RequestMapping("/servlet/deleteSalary.action")
				public void deleteSalary(int id, HttpServletResponse response)
				{
					 String result = "{\"result\":\"error\"}"; 
					 
					 if(userInfoService.deleteSalary(id))
					 { 
						result= "{\"result\":\"success\"}";
						
					 }
					 
					 response.setContentType("application/json");  
					 
					 try 
					 {  
				        PrintWriter out = response.getWriter();  
				        out.write(result);  
				     }
					 catch (IOException e) 
					 {  
				        e.printStackTrace();  
				     }  
				}
}
 