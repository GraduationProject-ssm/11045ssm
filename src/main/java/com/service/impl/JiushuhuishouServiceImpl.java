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


import com.dao.JiushuhuishouDao;
import com.entity.JiushuhuishouEntity;
import com.service.JiushuhuishouService;
import com.entity.vo.JiushuhuishouVO;
import com.entity.view.JiushuhuishouView;

@Service("jiushuhuishouService")
public class JiushuhuishouServiceImpl extends ServiceImpl<JiushuhuishouDao, JiushuhuishouEntity> implements JiushuhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiushuhuishouEntity> page = this.selectPage(
                new Query<JiushuhuishouEntity>(params).getPage(),
                new EntityWrapper<JiushuhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiushuhuishouEntity> wrapper) {
		  Page<JiushuhuishouView> page =new Query<JiushuhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiushuhuishouVO> selectListVO(Wrapper<JiushuhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiushuhuishouVO selectVO(Wrapper<JiushuhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiushuhuishouView> selectListView(Wrapper<JiushuhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiushuhuishouView selectView(Wrapper<JiushuhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
