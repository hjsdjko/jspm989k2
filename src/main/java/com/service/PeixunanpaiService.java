package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixunanpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixunanpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunanpaiView;


/**
 * 培训安排
 *
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
public interface PeixunanpaiService extends IService<PeixunanpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixunanpaiVO> selectListVO(Wrapper<PeixunanpaiEntity> wrapper);
   	
   	PeixunanpaiVO selectVO(@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);
   	
   	List<PeixunanpaiView> selectListView(Wrapper<PeixunanpaiEntity> wrapper);
   	
   	PeixunanpaiView selectView(@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixunanpaiEntity> wrapper);
   	

}

