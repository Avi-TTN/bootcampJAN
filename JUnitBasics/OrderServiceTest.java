package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class OrderServiceTest {
    @Test
    public void testGetInstance_ShouldReturnSingleObject(){
        OrderService instance1 = OrderService.getInstance();
        OrderService instance2 = OrderService.getInstance();
        assertSame(instance1, instance2);
    }
    @Test
    public void testOrderService_ShouldNotAllowCreatingTwoObjects(){
        OrderService instance1 = new OrderService();
        OrderService instance2 = new OrderService();
        assertSame(instance1, instance2);
    }
    @Test
    public void testPlaceOrder_ShouldCalculateCorrectPriceWithTax(){
        Order order = new Order(1 , "iPhone", 120000);
        OrderService orderService = OrderService.getInstance();
        try{
            orderService.placeOrder(order);
        }
        catch (RuntimeException re){}
        assertEquals(144000,order.getPriceWithTax(), 0.1);
    }
    @Test
    public void testPlaceOrder_ShouldThrowRuntimeException(){
        Order order = new Order(1 , "iPhone", 120000);
        OrderService orderService = OrderService.getInstance();
        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));
    }
    @Test
    public void testPlaceOrder_ShouldNotNotifyCustomer(){
        Order order = new Order(1 , "iPhone", 120000);
        OrderService orderService = OrderService.getInstance();
        try{
            orderService.placeOrder(order);
        }
        catch (RuntimeException re){}
        assertEquals(false,order.isCustomerNotified());
    }
    @Test
    public void testPlaceOrder_WithCC_ShouldCalculateCorrectPriceWithTax(){
        Order order = new Order(1 , "iPhone", 120000);
        OrderService orderService = OrderService.getInstance();
        try{
            orderService.placeOrder(order, "avi.vyas@tothenew.com");
        }
        catch (RuntimeException re){}
        assertEquals(144000,order.getPriceWithTax(), 0.1);
    }
    @Test
    public void testPlaceOrder_WithCC_ShouldNotifyCustomer(){
        Order order = new Order(1 , "iPhone", 120000);
        OrderService orderService = OrderService.getInstance();
        orderService.placeOrder(order, "avi.vyas@tothenew.com");
        assertEquals(true,order.isCustomerNotified());
    }

}