package com.dao;

import com.entity.BaomingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingxinxiVO;
import com.entity.view.BaomingxinxiView;


/**
 * 报名信息
 * 
 * @author 
 * @email 
 * @date 2022-04-23 16:14:02
 */
public interface BaomingxinxiDao extends BaseMapper<BaomingxinxiEntity> {
	
	List<BaomingxinxiVO> selectListVO(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
	BaomingxinxiVO selectVO(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
	List<BaomingxinxiView> selectListView(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);

	List<BaomingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	
	BaomingxinxiView selectView(@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BaomingxinxiEntity> wrapper);
}
