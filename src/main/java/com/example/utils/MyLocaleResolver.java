//package com.example.utils;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.LocaleResolver;
//import org.thymeleaf.util.StringUtils;
//
//import java.util.Locale;
//
//public class MyLocaleResolver   implements LocaleResolver {
//    @Override
//    public Locale resolveLocale(HttpServletRequest request) {
//        // 接收语言的参数 - 传进来的就是形如'zh_CN'这样的参数
//        String lan = request.getParameter("lan");
//        // 使用默认的语言 - 在文中就是login.properties文件里配置的
//        Locale locale = Locale.getDefault();
//        // 判断接收的参数是否为空，不为空就设置为该语言
//        if(!StringUtils.isEmpty(lan)){
//            // 将参数分隔 - 假设传进来的是'zh_CN'
//            String[] s = lan.split("_");
//            // 语言编码:zh   地区编码:CN
//            locale = new Locale(s[0],s[1]);
//        }
//        return locale;
//    }
//
//    @Override
//    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
//
//    }
//}
