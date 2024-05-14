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


import com.dao.PeixunanpaiDao;
import com.entity.PeixunanpaiEntity;
import com.service.PeixunanpaiService;
import com.entity.vo.PeixunanpaiVO;
import com.entity.view.PeixunanpaiView;

@Service("peixunanpaiService")
public class PeixunanpaiServiceImpl extends ServiceImpl<PeixunanpaiDao, PeixunanpaiEntity> implements PeixunanpaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixunanpaiEntity> page = this.selectPage(
                new Query<PeixunanpaiEntity>(params).getPage(),
                new EntityWrapper<PeixunanpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixunanpaiEntity> wrapper) {
		  Page<PeixunanpaiView> page =new Query<PeixunanpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixunanpaiVO> selectListVO(Wrapper<PeixunanpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixunanpaiVO selectVO(Wrapper<PeixunanpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixunanpaiView> selectListView(Wrapper<PeixunanpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixunanpaiView selectView(Wrapper<PeixunanpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
