package com.fmin.minpicturebackend.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fmin.minpicturebackend.constant.UserConstant;
import com.fmin.minpicturebackend.exception.BusinessException;
import com.fmin.minpicturebackend.exception.ErrorCode;
import com.fmin.minpicturebackend.model.VO.LoginUserVO;
import com.fmin.minpicturebackend.model.VO.UserVO;
import com.fmin.minpicturebackend.model.dto.user.UserQueryRequest;
import com.fmin.minpicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Administrator
* @description 针对表【user(用户)】的数据库操作 Service
* @createDate 2026-06-15 18:04:28
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获得脱敏后的登录用户信息
     *
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);
    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);
    /**
     * 用户退出登录
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取加密后的密码
     *
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
    /**
     * 是否为管理员
     *
     * @param user
     * @return
     */
    boolean isAdmin(User user);
}