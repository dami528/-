package com.rjxy.fitness.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rjxy.fitness.entity.Fitnessuser;
import com.rjxy.fitness.mapper.FitnessuserMapper;


public abstract class Test {
     public static void main(String[] args) {
		//��ȡspring������Ϣ
    	 ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml","spring_mvc.xml");
    	//��ȡspring�����е�mapper����
    	//spring����mapper����Ĺ�����������ĸСд������mapper�����ID
    	 FitnessuserMapper userMapper=(FitnessuserMapper)ac.getBean("fitnessuserMapper");
    	 //Fitnessuser user =userMapper.selectByPrimaryKey("20151612206");
    	
    	 //���Ե�¼����
    	 Map<String,String> paramMap = new HashMap<String,String>();
    	 paramMap.put("userid","zqb");
    	 paramMap.put("password","123456");
    	 Fitnessuser user = userMapper.selectLoginUser(paramMap);
    	 if(user == null)
    		  System.out.println("�û���¼ʧ��");
    	 else
    		 System.out.println("��ӭ��"+user.getNickname());
    	 //������ݵĽ��
    	// System.out.println(user.getNickname());
	}
}
