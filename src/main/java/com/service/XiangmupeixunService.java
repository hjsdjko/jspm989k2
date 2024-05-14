package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmupeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmupeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmupeixunView;


/**
 * 项目培训
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
public interface XiangmupeixunService extends IService<XiangmupeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmupeixunVO> selectListVO(Wrapper<XiangmupeixunEntity> wrapper);
   	
   	XiangmupeixunVO selectVO(@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);
   	
   	List<XiangmupeixunView> selectListView(Wrapper<XiangmupeixunEntity> wrapper);
   	
   	XiangmupeixunView selectView(@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmupeixunEntity> wrapper);
   	

}

