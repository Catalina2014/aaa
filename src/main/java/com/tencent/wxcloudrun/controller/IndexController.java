package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * index控制器
 */
@Controller

public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping
  public String index(HttpServletRequest request) {
// 获取请求者的 IP 地址
        String ipAddress = request.getRemoteAddr();
        
        // 获取其他请求相关信息，如 User-Agent 等
        String userAgent = request.getHeader("User-Agent");

        // 可以根据需要记录更多信息，如请求时间、请求路径
        
        // 在这里处理记录信息的逻辑，例如保存到日志
        System.out.println("IP地址：" + ipAddress);
        System.out.println("User-Agent：" + userAgent);
    return "index";
  }

}
