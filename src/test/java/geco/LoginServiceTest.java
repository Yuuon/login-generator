package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/11/22.
 */
public class LoginServiceTest {
    String[] test = {"test1","test2"};
    LoginService ls = new LoginService(test);
    @Test
    public void loginExists() throws Exception {
        boolean r = true;
        assertEquals(r, ls.loginExists("test1"));
    }

    @Test
    public void addLogin() throws Exception {
        ls.addLogin("test3");
        boolean r = true;
        assertEquals(r, ls.loginExists("test3"));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        assertEquals(list,ls.findAllLoginsStartingWith("test"));
    }

    @Test
    public void findAllLogins() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        assertEquals(list,ls.findAllLogins());
    }

}