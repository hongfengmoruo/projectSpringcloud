package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;
import com.springcloud.service.ClassService;
import com.springcloud.vo.ResultValue;

/**
 * һ�������������Ŀ�����
 * 
 * @author WM
 *
 */
@RestController
@RequestMapping("type")
public class ClassController {
	
	@Autowired
	private ClassService classService;
	
	/**
	 * ��ѯ����һ�������Ϣ
	 * @return
	 */
	@RequestMapping("/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();
		try {
			List<Class1> list = this.classService.selectAllClass1();
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				map.put("classList", list);
				rv.setDataMap(map);
				return rv;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
	
	/**
	 * ����һ������Ų�ѯ��Ӧ�Ķ��������Ϣ
	 * @param class1Id		һ�������
	 * @return				
	 */
	@RequestMapping("/selectById")
	public ResultValue selectById(@RequestParam("class1Id") Integer class1Id) {
		ResultValue rv = new ResultValue();
		try {
			List<Class2> list2 = this.classService.selectAllClass2ByClass1(class1Id);
			if (list2 != null && list2.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				map.put("classTypeList", list2);
				rv.setDataMap(map);
				return rv;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
	
}
