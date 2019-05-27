package com.steins.controller;

import com.steins.entity.Comment;
import com.steins.entity.Food;
import com.steins.entity.Store;
import com.steins.entity.User;
import com.steins.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sunny
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

    private static String uploadPath = "C:\\Program Files\\Apache Software Foundation\\apache-tomcat-8.5.41\\webapps\\ROOT\\static\\custom\\images"+ File.separator;
    //	定义一个文件下载的目录
    private static String downloadPath="D:"+File.separator;


    @RequestMapping("/insertFoodInter")
    public String insertFoodInter(HttpServletRequest request,@RequestParam("storeId") int storeId,HttpSession session){
        System.out.println(storeId+"storeId is");
//	    String storeId= String.valueOf(request.getAttribute("storeId"));
//		if (storeId.isEmpty()||storeId.equals("")||storeId==null){
//			storeId="0";
//		}
        session.setAttribute("storeId",storeId);
        System.out.println("insertFoodInter==================="+storeId);
        return "cpad";

    }
	@RequestMapping(value = "/insertFood")
	public String insertFood(@RequestParam("file") MultipartFile multipartFile, Model model,HttpServletRequest request, RedirectAttributes attr, @RequestParam(value = "storeId",required=false) Integer storeId){
            String foodPic="";
    //		1 判断
        if (!multipartFile.isEmpty()&&multipartFile!=null) {
//			不空才传
//		    2 获取原始的文件名
            String originalFileName = multipartFile.getOriginalFilename();

//		    3 先截取源文件名的前缀，不带后缀
            String originalFileNamePrefix=originalFileName.substring(0,originalFileName.lastIndexOf("."));

//		    4 加工处理文件名，将原文文件名+时间戳
//			时间戳如果带着空格等特殊字符也会上传失败！！！
            String newFileNamePrefix=originalFileNamePrefix+System.currentTimeMillis();

//		    5 得到新的文件名
            String newFileName=newFileNamePrefix+originalFileName.substring(originalFileName.lastIndexOf("."));
            System.out.println(newFileName);
//			System.out.println(newFileName);
//		    6 构建文件对象
            File file=new File(uploadPath+newFileName);
//		    7 上传
            try {
                multipartFile.transferTo(file);
                foodPic=newFileName;
//                model.addAttribute("fileName",newFileName);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }Food food=new Food();

		food.setFoodName(request.getParameter("foodName"));
		food.setFoodPic(foodPic);
		System.out.println("insertFood==================");
//		String storeId= String.valueOf(request.getSession().getAttribute("storeId"));
//		if (storeId.isEmpty()||storeId.equals("")||storeId==null){
//			storeId="0";
//		}
		System.out.println(storeId);
		food.setStoreId(storeId);
		boolean flag=adminService.insertFood(food);
		if (flag){
		    attr.addAttribute("storeId",storeId);
			return "redirect:queryOneStoreFoodList";
		}
		else {
			return "fail";
		}
	}

	@RequestMapping(value = "/deleteFood")
	public String deleteFood(HttpServletRequest request,HttpSession session, @RequestParam("foodId") int foodId,RedirectAttributes attr){
		System.out.println("admin/deleteFood++++++"+foodId);
		boolean flag=adminService.deleteFood(foodId);
		String storeId= String.valueOf(request.getSession().getAttribute("storeId"));
		if (storeId.isEmpty()||storeId.equals("")||storeId==null){
			storeId="0";
		}
		session.setAttribute("storeId",storeId);
		System.out.println("==================="+storeId);
		if (flag){
//			session.setAttribute("storeId",storeId);
            attr.addAttribute("storeId",storeId) ;
            return "redirect:queryOneStoreFoodList";
		}
		else {
			return "fail";
		}
	}
	@RequestMapping("/updateFoodInter")
	public String updateFoodInter(HttpServletRequest request,@RequestParam("foodId")int foodId,@RequestParam("storeId") int storeId,HttpSession session){
        System.out.println(storeId+"storeId is");
//	    String storeId= String.valueOf(request.getAttribute("storeId"));
//		if (storeId.isEmpty()||storeId.equals("")||storeId==null){
//			storeId="0";
//		}
		session.setAttribute("foodId",foodId);
		session.setAttribute("storeId",storeId);
		System.out.println(foodId+"==================="+storeId);
		return "cpbj";

	}

	@RequestMapping(value = "/updateFood")
//    @ResponseBody
	public String updateFood(RedirectAttributes attr,HttpServletRequest request, HttpSession session, @RequestParam("foodId") int foodId, @RequestParam("storeId") int storeId){
		Food food=new Food();
//		String foodId= String.valueOf(request.getSession().getAttribute("foodId"));
//		if (foodId.isEmpty()||foodId.equals("")||foodId==null){
//			foodId="0";
//		}
		food.setFoodId(foodId);
		food.setFoodName(request.getParameter("foodName"));
		food.setFoodDesc(request.getParameter("foodDesc"));
		food.setFoodPic(request.getParameter("foodPic"));
//		String storeId= String.valueOf(request.getSession().getAttribute("storeId"));
//		if (storeId.isEmpty()||storeId.equals("")||storeId==null){
//			storeId="0";
//		}
		food.setStoreId(storeId);

		boolean flag=adminService.updateFood(food);
		if (flag){
//            session.setAttribute("storeId",storeId);
            attr.addAttribute("storeId",storeId);
			return "redirect:queryOneStoreFoodList";
		}
		else {
			return "fail";
		}
	}
	@ResponseBody
	@RequestMapping(value = "/queryOneFood",method = RequestMethod.POST)
	public Food queryOneFood(HttpServletRequest request,@RequestParam("foodId") int foodId){
		Food food=new Food();
		food=adminService.queryOneFood(foodId);
		return food;
	}
	@ResponseBody
	@RequestMapping(value = "/queryFoodList")
	public List<Food> queryFoodList(HttpServletRequest request){
		List<Food> foodList=new ArrayList<>();
		foodList=adminService.queryFoodList();
		return foodList;
	}
//	@ResponseBody
	@RequestMapping(value = "/queryOneStoreFoodList")
	public String queryOneStoreFoodList(HttpServletRequest request,@RequestParam("storeId") int storeId,HttpSession session){
		List<Food> foodList=new ArrayList<>();
		foodList=adminService.queryOneStoreFoodList(storeId);

		request.setAttribute("foodList",foodList);
		session.setAttribute("storeId",storeId);
		System.out.println("/queryOneStoreFoodList"+storeId);
		return "fl";
	}
//	@RequestMapping("/insertStoreInter")
//	public String insertStoreInter(HttpServletRequest request,@RequestParam("storeId") int storeId,HttpSession session){
//		System.out.println(storeId+"storeId is");
////	    String storeId= String.valueOf(request.getAttribute("storeId"));
////		if (storeId.isEmpty()||storeId.equals("")||storeId==null){
////			storeId="0";
////		}
//		session.setAttribute("storeId",storeId);
//		System.out.println("insertFoodInter==================="+storeId);
//		return "cpad";
//
//	}
//	@ResponseBody
	@RequestMapping(value = "/insertStore")
	public String insertStore(HttpServletRequest request){
		Store store=new Store();
		store.setStoreName(request.getParameter("storeName"));
		store.setStoreDesc(request.getParameter("storeDesc"));
		store.setStorePic(request.getParameter("storePic"));
//		store.setStoreScore(Integer.valueOf(request.getParameter("storeScore")));
//		store.setStoreRanking(Integer.valueOf(request.getParameter("storeRanking")));
//		store.setStoreTel(request.getParameter("storeTel"));
		boolean flag=adminService.insertStore(store);
		if (flag){
			return "redirect:queryStoreList";
		}
		else {
			return "fail";
		}
	}
//	@ResponseBody
	@RequestMapping(value = "/deleteStore")
	public String deleteStore(HttpServletRequest request,@RequestParam("storeId") int storeId){
		System.out.println(storeId);
		boolean flag=adminService.deleteStore(storeId);
		if (flag){
			return "redirect:queryStoreList";
		}
		else {
			return "fail";
		}
	}
	@RequestMapping("/updateStoreInter")
	public String updateStoreInter(HttpSession session,@RequestParam("storeId") int storeId,RedirectAttributes attr){
	    System.out.println("updateStoreInter+"+storeId);
//	    attr.addAttribute("storeId",storeId);
		session.setAttribute("storeId",storeId);
		return "glbj";
	}
//	@ResponseBody
	@RequestMapping(value ="/updateStore")
	public String updateStore(HttpServletRequest request,HttpSession session,RedirectAttributes attr){

	    Store store=new Store();
        Integer storeId=0;
        try {
            storeId= (Integer) request.getSession().getAttribute("storeId");
            System.out.println("updateStore1+"+storeId);

            if (storeId.equals("") || storeId == null||storeId==0) {
                return "false";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("updateStore2+"+storeId);
//		System.out.println(storeId);
		store.setStoreId(storeId);
		store.setStoreName(request.getParameter("storeName"));
		store.setStoreDesc(request.getParameter("storeDesc"));
		store.setStorePic(request.getParameter("storePic"));
//		store.setStoreScore(storeId);
//		store.setStoreRanking(Integer.valueOf(request.getParameter("storeRanking")));
//		store.setStoreTel(request.getParameter("storeTel"));
//		request.setAttribute("storeId",storeId);
		boolean flag=adminService.updateStore(store);
		if (flag){
		    attr.addAttribute("storeId",storeId);
			return "redirect:queryStoreList";
		}
		else {
			return "fail";
		}
	}

//	@ResponseBody
	@RequestMapping(value = "/queryOneStore")
	public String queryOneStore(HttpServletRequest request,HttpSession session,@RequestParam("storeId") int storeId){
		Store store=new Store();
		store=adminService.queryOneStore(storeId);
		session.setAttribute("storeId",storeId);
		request.setAttribute("store",store);
		return "fl";
	}
	@RequestMapping(value = "queryStoreList")
	public String queryStoreList(HttpServletRequest request, HttpServletResponse response){
		List<Store> storeList=new ArrayList<>();
		storeList=adminService.queryStoreList();

		request.getSession().setAttribute("storeList",storeList);


		return "gljm";
	}

	@RequestMapping("queryAllUser")
	public String queryAllUser(HttpServletRequest request, HttpServletResponse response){
		List<User> userList=new ArrayList<>();
		userList=adminService.queryAllUser();
		request.getSession().setAttribute("userList",userList);

		return "gljm";
	}
	@RequestMapping("queryAllComment")
	public String queryAllComment(HttpServletRequest request, HttpServletResponse response){
		List<Comment> commentList=new ArrayList<>();
		commentList=adminService.queryAllComment();
		request.getSession().setAttribute("userList",commentList);

		return "gljm";
	}

	@RequestMapping("deleteUser")
	public String deleteUser(HttpServletRequest request,@RequestParam("userId") int userId){
		System.out.println(userId);
		boolean flag=adminService.deleteUser(userId);
		if (flag){
			return "redirect:queryStoreList";
		}
		else {
			return "fail";
		}
	}


	@RequestMapping("deleteComment")
	public String deleteComment(HttpServletRequest request,@RequestParam("commentId") int commentId){
		System.out.println(commentId);
		boolean flag=adminService.deleteComment(commentId);
		if (flag){
			return "redirect:queryStoreList";
		}
		else {
			return "fail";
		}
	}
	
}
