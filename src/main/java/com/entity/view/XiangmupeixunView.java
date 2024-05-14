package com.entity.view;

import com.entity.XiangmupeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
@TableName("xiangmupeixun")
public class XiangmupeixunView  extends XiangmupeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmupeixunView(){
	}
 
 	public XiangmupeixunView(XiangmupeixunEntity xiangmupeixunEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmupeixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
