package com.steins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

/**
 * @author Sunny
 */
@SuppressWarnings("AlibabaAvoidNewDateGetTime")
@Controller

@RequestMapping("/transfer")
public class TransferController{
	private static String uploadPath = "C:\\Program Files\\Apache Software Foundation\\apache-tomcat-8.5.41\\webapps\\images"+ File.separator;
//	定义一个文件下载的目录
	private static String downloadPath="D:"+File.separator;
	

	@RequestMapping(value = "/upload")
	public String upload(@RequestParam("file")MultipartFile multipartFile, Model model){
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
				model.addAttribute("fileName",newFileName);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "/uploadSuccess";
		
	}
	@ResponseBody
	@RequestMapping("/download")
	public String download(HttpServletResponse response){
		response.setCharacterEncoding("UTF-8");
//		通过输出流写到客户端，浏览器
//		1 获取文件下载名
		String fileName="绿色.mp3";
//		2 构建一个文件对象通过Paths工具类获取一个Path对象
		Path path= Paths.get(downloadPath,fileName);
//		3 判断是否存在
		if (Files.exists(path)){
//			存在即下载
//			通过response设定他的响应类型
//			4 获取文件的后缀
			String fileSuffix=fileName.substring(fileName.lastIndexOf(".")+1);
//			5 设置content Type ，只有制定他才能去下载
			response.setContentType("application/"+fileSuffix);
//			iso8859-1
			try {
				response.addHeader("Content-Disposition","attachment; filename="+new String (fileName.getBytes("UTF-8"),"ISO8859-1"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
//			6 通过Path写出去就可以
			try {
				Files.copy(path,response.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "download";
	}
	
	
}