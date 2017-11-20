package IoC;

public class MyClassService {

    private MyClassDao myClassDao;

    public MyClassService(MyClassDao myClassDao) {
        this.myClassDao = myClassDao;
    }

    public String insereQualquerCoisa(String msg){
        return  myClassDao.insereTexto(msg);
    }
}
