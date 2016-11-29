package com.royalservice;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royaldao.Userdao;
import com.royalmodel.User;

//@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService {
//@Autowired

/*private Userdao userdao;

	public Userdao getUserdao() {
	return userdao;
}

public void setUserdao(Userdao userdao) {
	this.userdao = userdao;
}
*/
@Transactional
	public void insert(User user) {
		//userdao.insert(user);

	}

}
