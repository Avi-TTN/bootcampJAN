package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailServiceTest {
    @Test
    public void testGetInstance_ShouldReturnSingleObject(){
        EmailService instance1 = EmailService.getInstance();
        EmailService instance2 = EmailService.getInstance();
        assertSame(instance1, instance2);
    }
    @Test
    public void testEmailService_ShouldNotAllowCreatingTwoObjects(){
        EmailService instance1 = new EmailService();
        EmailService instance2 = new EmailService();
        assertSame(instance1, instance2);
    }
    @Test
    public void testSendEmail_ShouldThrowAnRuntimeException(){
        assertThrows(RuntimeException.class, () -> {
            EmailService instance = EmailService.getInstance();
            Order order = new Order(1 , "iPhone", 120000);
            instance.sendEmail(order);
        });
    }
    @Test
    public void testSendEmail_WithCC_ShouldNotifyCustomer(){
        EmailService instance = EmailService.getInstance();
        Order order = new Order(1 , "iPhone", 120000);
        instance.sendEmail(order, "avi.vyas@tothenew.com");
        assertEquals(true, order.isCustomerNotified());
    }

}
