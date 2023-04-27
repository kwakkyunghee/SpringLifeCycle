package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); //config 읽어서 로딩
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("obj1: " + obj1); //주소 출력
        //ctx.close(); //컨테이너에 있는 객체 소멸

    }
}