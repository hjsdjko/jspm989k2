package com.entity.view;

import com.entity.PeixunanpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 培训安排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
@TableName("peixunanpai")
public class PeixunanpaiView  extends PeixunanpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeixunanpaiView(){
	}
 
 	public PeixunanpaiView(PeixunanpaiEntity peixunanpaiEntity){
 	try {
			BeanUtils.copyProperties(this, peixunanpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
