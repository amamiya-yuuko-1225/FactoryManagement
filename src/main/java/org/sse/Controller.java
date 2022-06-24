package org.sse;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.sse.mapper.*;
import org.sse.pojo.*;

import java.util.List;

@RestController
@SuppressWarnings("all")
@CrossOrigin(origins = {"*", "null"})
public class Controller {
    private Gson gson = new Gson();

    //Factory------------------------------------------------------------------------------------------------
    @Autowired
    private FacrotyMapper facrotyMapper;
    @GetMapping("getAllFactories")
    public String getAllFactories () {
        List<Factory> factories = facrotyMapper.selectList(null);
        return gson.toJson(factories);
    }
    //通过设置了条件的对象进行条件查询
    @GetMapping("getFactoriesByQuery")
    public String getFactoriesByQuery(@RequestBody Factory factory){
        QueryWrapper<Factory> factoryQueryWrapper = new QueryWrapper<>(factory);
        List<Factory> factoryList = facrotyMapper.selectList(factoryQueryWrapper);
        return gson.toJson(factoryList);
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

    @GetMapping("countAllFactory")
    public long countAllFactories(){
        long count =  facrotyMapper.selectCount(null);
        return count;
    }

    //Device-----------------------------------------------------------------------------------------------------

    @Autowired
    private DeviceMapper deviceMapper;

    @GetMapping("getAllDevice")
    public String getAllDevice () {
        List<Device> devices = deviceMapper.selectList(null);
        return gson.toJson(devices);
    }
    //通过设置了条件的对象进行条件查询
    @GetMapping("getDeviceByQuery")
    public String getDeviceByQuery(@RequestBody Device device){
        QueryWrapper<Device> deviceQueryWrapper = new QueryWrapper<>(device);
        List<Device> deviceList = deviceMapper.selectList(deviceQueryWrapper);
        return gson.toJson(deviceList);
    }

    @GetMapping("addDevice")
    public void addDevice (@RequestBody Device device) {
        deviceMapper.insert(device);
    }
    @GetMapping("deleteDevice")
    public void deleteDevice (@RequestBody Device device) {
        deviceMapper.deleteById(device);
    }
    @GetMapping("updateDevice")
    public void updateDevice (@RequestBody Device device) {
        deviceMapper.updateById(device);
    }

    @GetMapping("countAllDevice")
    public long countAllDevice(){
        long count =  deviceMapper.selectCount(null);
        return count;
    }

    //对可用设备计数
    @GetMapping("countUsableDevice")
    public long countUsableDevice(){
        QueryWrapper<Device> queryWrapper=new QueryWrapper();
        queryWrapper.eq("status",1);
        long count =  deviceMapper.selectCount(queryWrapper);
        return count;
    }

    //Product---------------------------------------------------------------------------------------------------
    @Autowired
    private ProductMapper productMapper;

    @GetMapping("getAllProduct")
    public String getAllProduct () {
        List<Product> products = productMapper.selectList(null);
        return gson.toJson(products);
    }
    //通过设置了条件的对象进行条件查询
    @GetMapping("getProductBYQuery")
    public String getProductByQuery(@RequestBody Product product){
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>(product);
        List<Product> productList = productMapper.selectList(productQueryWrapper);
        return gson.toJson(productList);
    }

    @GetMapping("addProduct")
    public void addProduct (@RequestBody Product product) {
        productMapper.insert(product);
    }
    @GetMapping("deleteProduct")
    public void deleteProduct (@RequestBody Product product) {
        productMapper.deleteById(product);
    }
    @GetMapping("updateProduct")
    public void updateProduct (@RequestBody Product product) {
        productMapper.updateById(product);
    }

    //Order-----------------------------------------------------------------------------------------------------
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("getAllOrder")
    public String getAllOrder () {
        List<Order> orders = orderMapper.selectList(null);
        return gson.toJson(orders);
    }
    //通过设置了条件的对象进行条件查询
    @GetMapping("getOrderByQuery")
    public String getOrderBYQuery(@RequestBody Order order){
        QueryWrapper<Order> orderQueryWrapper = new QueryWrapper<>(order);
        List<Order> orderList = orderMapper.selectList(orderQueryWrapper);
        return gson.toJson(orderList);
    }
    @GetMapping("addOrder")
    public void addOrder (@RequestBody Order order) {
        orderMapper.insert(order);
    }
    @GetMapping("deleteOrder")
    public void deleteOrder (@RequestBody Order order) {
        orderMapper.deleteById(order);
    }
    @GetMapping("updateOrder")
    public void updateOrder (@RequestBody Order order) {
        orderMapper.updateById(order);
    }

    @GetMapping("countAllOrder")
    public long countAllOrder(){
        long count =  orderMapper.selectCount(null);
        return count;
    }
    //对完成的订单计数
    @GetMapping("countDoneOrder")
    public long countDoneOrder(){
        QueryWrapper<Order> queryWrapper=new QueryWrapper();
        queryWrapper.eq("status",1);
        long count =  orderMapper.selectCount(queryWrapper);
        return count;
    }

    //GeneratePlan--------------------------------------------------------------------------------------------
    @Autowired
    private GeneratePlanMapper generatePlanMapper;

    @GetMapping("addGeneratePlan")
    public void addGeneratePlan (@RequestBody GeneratePlan generatePlan) {
        generatePlanMapper.insert(generatePlan);
    }
    @GetMapping("deleteGeneratePlan")
    public void deleteGeneratePlan (@RequestBody GeneratePlan generatePlan) {
        generatePlanMapper.deleteById(generatePlan);
    }
    @GetMapping("updateGeneratePlan")
    public void updateGeneratePlan (@RequestBody GeneratePlan generatePlan) {
        generatePlanMapper.updateById(generatePlan);
    }

    @GetMapping("countAllGeneratePlan")
    public long countAllGeneratePlan(){
        long count =  generatePlanMapper.selectCount(null);
        return count;
    }
    //对完成的生产计划计数
    @GetMapping("countDoneGeneratePlan")
    public long countDoneGeneratePlan(){
        QueryWrapper<GeneratePlan> queryWrapper=new QueryWrapper();
        queryWrapper.eq("status",1);
        long count =  generatePlanMapper.selectCount(queryWrapper);
        return count;
    }

    //生产调度（待续）-----------------------------------------------------------------------------------------

}
