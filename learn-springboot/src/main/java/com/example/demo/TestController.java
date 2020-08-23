package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.annotation.StringResult;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
	/*
	 * 
	 * @Autowired //private DataSource dataSource;
	 * 
	 * 
	 * @GetMapping("/api/{mth}/getMapInfo") public Map<Integer, Object>
	 * getMapINfo(@PathVariable("mth") int i) { Map<Integer, Object> map = new
	 * LinkedHashMap<Integer, Object>(); for (int j = 0; j < i; j++) { map.put(j,
	 * "zhangsan" + j); } int p = 2/0;
	 * 
	 * return map; }
	 * 
	 * @StringResult("1234")
	 * 
	 * @GetMapping("/testApi") public Map<String , Object> test(Integer page,Integer
	 * limit) { Map<Integer, Object> map = new LinkedHashMap<Integer, Object>();
	 * Map<String, Object> map1 = new LinkedHashMap<String, Object>(); for (int j =
	 * 0; j < 10; j++) { map.put(j, "zhangsan" + j); } log.debug("测试日志！！！");
	 * map1.put("data", map); map1.put("success", 200); return map1; }
	 * 
	 */}
