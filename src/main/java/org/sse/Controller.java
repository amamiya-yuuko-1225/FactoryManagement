package org.sse;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.sse.mapper.FacrotyMapper;
import org.sse.pojo.Factory;

import java.util.List;

@RestController
@SuppressWarnings("all")
@CrossOrigin(origins = {"*", "null"})
public class Controller {
    private Gson gson = new Gson();
    @Autowired
    private FacrotyMapper facrotyMapper;
    @GetMapping("getFactories")
    public String getFactories () {
        List<Factory> factories = facrotyMapper.selectList(null);
        return gson.toJson(factories);
    }
    @GetMapping("addFactory")
    public void addFactory (@RequestBody Factory factory) {
        facrotyMapper.insert(factory);
    }
    @GetMapping("deleteFactory")
    public void deleteFactory (@RequestBody Factory factory) {
        facrotyMapper.deleteById(factory);
    }
    @GetMapping("updateFactory")
    public void updateFactory (@RequestBody Factory factory) {
        facrotyMapper.updateById(factory);
    }
}
