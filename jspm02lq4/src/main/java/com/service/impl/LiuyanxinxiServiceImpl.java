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


import com.dao.LiuyanxinxiDao;
import com.entity.LiuyanxinxiEntity;
import com.service.LiuyanxinxiService;
import com.entity.vo.LiuyanxinxiVO;
import com.entity.view.LiuyanxinxiView;

@Service("liuyanxinxiService")
public class LiuyanxinxiServiceImpl extends ServiceImpl<LiuyanxinxiDao, LiuyanxinxiEntity> implements LiuyanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiuyanxinxiEntity> page = this.selectPage(
                new Query<LiuyanxinxiEntity>(params).getPage(),
                new EntityWrapper<LiuyanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiuyanxinxiEntity> wrapper) {
		  Page<LiuyanxinxiView> page =new Query<LiuyanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiuyanxinxiVO> selectListVO(Wrapper<LiuyanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiuyanxinxiVO selectVO(Wrapper<LiuyanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiuyanxinxiView> selectListView(Wrapper<LiuyanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiuyanxinxiView selectView(Wrapper<LiuyanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
