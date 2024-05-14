package com.dao;

import com.entity.PeixunanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeixunanpaiVO;
import com.entity.view.PeixunanpaiView;


/**
 * 培训安排
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
public interface PeixunanpaiDao extends BaseMapper<PeixunanpaiEntity> {
	
	List<PeixunanpaiVO> selectListVO(@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);
	
	PeixunanpaiVO selectVO(@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);
	
	List<PeixunanpaiView> selectListView(@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);

	List<PeixunanpaiView> selectListView(Pagination page,@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);
	
	PeixunanpaiView selectView(@Param("ew") Wrapper<PeixunanpaiEntity> wrapper);
	

}
