package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChengjixinxiDao;
import com.entity.ChengjixinxiEntity;
import com.service.ChengjixinxiService;
import com.entity.vo.ChengjixinxiVO;
import com.entity.view.ChengjixinxiView;

@Service("chengjixinxiService")
public class ChengjixinxiServiceImpl extends ServiceImpl<ChengjixinxiDao, ChengjixinxiEntity> implements ChengjixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjixinxiEntity> page = this.selectPage(
                new Query<ChengjixinxiEntity>(params).getPage(),
                new EntityWrapper<ChengjixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
		  Page<ChengjixinxiView> page =new Query<ChengjixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjixinxiVO> selectListVO(Wrapper<ChengjixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjixinxiVO selectVO(Wrapper<ChengjixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjixinxiView> selectListView(Wrapper<ChengjixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjixinxiView selectView(Wrapper<ChengjixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
