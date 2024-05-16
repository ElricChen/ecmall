package com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecmall4j.cloud.ecmall4cloudadmin.common.utils.R;
import com.ecmall4j.cloud.ecmall4cloudadmin.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
