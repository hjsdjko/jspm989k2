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


import com.dao.XiangmupeixunDao;
import com.entity.XiangmupeixunEntity;
import com.service.XiangmupeixunService;
import com.entity.vo.XiangmupeixunVO;
import com.entity.view.XiangmupeixunView;

@Service("xiangmupeixunService")
public class XiangmupeixunServiceImpl extends ServiceImpl<XiangmupeixunDao, XiangmupeixunEntity> implements XiangmupeixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmupeixunEntity> page = this.selectPage(
                new Query<XiangmupeixunEntity>(params).getPage(),
                new EntityWrapper<XiangmupeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmupeixunEntity> wrapper) {
		  Page<XiangmupeixunView> page =new Query<XiangmupeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmupeixunVO> selectListVO(Wrapper<XiangmupeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmupeixunVO selectVO(Wrapper<XiangmupeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmupeixunView> selectListView(Wrapper<XiangmupeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmupeixunView selectView(Wrapper<XiangmupeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
