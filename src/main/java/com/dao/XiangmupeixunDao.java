package com.dao;

import com.entity.XiangmupeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmupeixunVO;
import com.entity.view.XiangmupeixunView;


/**
 * 项目培训
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
public interface XiangmupeixunDao extends BaseMapper<XiangmupeixunEntity> {
	
	List<XiangmupeixunVO> selectListVO(@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);
	
	XiangmupeixunVO selectVO(@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);
	
	List<XiangmupeixunView> selectListView(@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);

	List<XiangmupeixunView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);
	
	XiangmupeixunView selectView(@Param("ew") Wrapper<XiangmupeixunEntity> wrapper);
	

}
