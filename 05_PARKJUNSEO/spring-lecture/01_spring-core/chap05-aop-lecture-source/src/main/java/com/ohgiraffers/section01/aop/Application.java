package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        MemberService memberService = context.getBean("memberService", MemberService.class);
        System.out.println("=============== selectMembers ===============");
        System.out.println(memberService.selectMembers());
        System.out.println("=============== selectMember ===============");
        System.out.println(memberService.selectMember(1L));

        MemberTwoService memberService2 = context.getBean("memberTwoService", MemberTwoService.class);
        System.out.println("=============== selectMembers2 ===============");
        System.out.println(memberService2.selectMembers());
        System.out.println("=============== selectMember2 ===============");
        System.out.println(memberService2.selectMember(1L));


    }


}
