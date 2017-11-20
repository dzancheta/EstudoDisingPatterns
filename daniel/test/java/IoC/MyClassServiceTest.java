package IoC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MyClassServiceTest {

    private MyClassService myClassService;
    private MyClassDao myClassDao;

    @BeforeEach
    public void setUp(){
        this.myClassDao = Mockito.mock(MyClassDao.class);
        this.myClassService = new MyClassService(myClassDao);
    }


    @Test
    public void deveRetornarHello(){
        Mockito.when(myClassDao.insereTexto("Hello")).thenReturn("Não foi salvo com sucesso");
        Assertions.assertEquals(myClassService.insereQualquerCoisa("Hello"),"Não foi salvo com sucesso");
    }
}
