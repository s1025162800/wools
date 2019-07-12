package com.shiro;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShiroDbRealm extends AuthorizingRealm {


	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		return null;
	}

	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken at) throws AuthenticationException {


		String username = "wools2"; // 得到用户名
//
//		if (at == null || StringUtils.isBlank(username)) {
//			return null;
//		}
//		UserinfoC user = login.selectUser(username);
//
//		if (user == null) {
//			return null;
//		}
//		
		//已写死
		
		 SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo( username , 
				 username,  ByteSource.Util.bytes(username), getName()); 
				return authenticationInfo;
		

	}

}