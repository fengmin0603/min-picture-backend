package com.fmin.minpicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.fmin.minpicturebackend.model.entity.SpaceUser;
import com.fmin.minpicturebackend.service.SpaceUserService;
import com.fmin.minpicturebackend.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【space_user(空间用户关联)】的数据库操作Service实现
* @createDate 2026-06-18 10:41:04
*/
@Service
public class SpaceUserServiceImpl extends ServiceImpl<SpaceUserMapper, SpaceUser>
    implements SpaceUserService{

}




