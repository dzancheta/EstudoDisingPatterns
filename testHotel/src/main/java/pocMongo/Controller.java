package pocMongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private Teste teste;
    private Client client;

    @GetMapping("/find")
    public Object getAll(@RequestParam(value = "name", required = false) String name){
        return teste.test(name);
    }

    @PostMapping("/insert")
    public String insert(@RequestBody Client client){
        return teste.insert(client.getName(), client.getStatus(), client.getAge());
     }

    @GetMapping("/delete")
    public String find(@RequestParam(value = "age") String age){
        return teste.delete(age);
     }

    @GetMapping("/update")
    public void update(@RequestParam(value = "name")String name,
                       @RequestParam(value = "nameUpdate")String nameUpdate){
        teste.update(name,nameUpdate);
    }
}
