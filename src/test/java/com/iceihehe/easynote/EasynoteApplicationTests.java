package com.iceihehe.easynote;

import com.iceihehe.easynote.domain.User;
import com.iceihehe.easynote.repository.UserRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasynoteApplicationTests {

    @Autowired
    private UserRepo userRepo;

	@Test
	public void contextLoads() {
	}

	@Test
    public void findUserByUsername() {
	    User xiba = userRepo.findByUsername("xiba");
	    assert xiba == null;
    }

}
