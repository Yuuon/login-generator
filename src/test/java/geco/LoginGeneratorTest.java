package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/11/22.
 */
public class LoginGeneratorTest {
    LoginService loginService = new LoginService(new String[] {"JROL", "BPER",
            "CGUR", "JDUP", "JRAL", "JRAL1"});
    LoginGenerator loginGenerator = new LoginGenerator(loginService);

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String gene1 = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals(gene1,"PDUR");
        String gene2 = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals(gene2, "JRAL2");
    }

}