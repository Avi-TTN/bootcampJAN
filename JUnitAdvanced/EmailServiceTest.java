package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
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
        Order order = mock(Order.class);
        EmailService emailService = spy(EmailService.getInstance());
        assertThrows(RuntimeException.class, () -> {
            emailService.sendEmail(order);
        });
        verify(emailService, times(1)).sendEmail(order);
        verify(order, times(1)).setCustomerNotified(false);
    }

    @Test
    public void testSendEmail_WithCC_ShouldNotifyCustomer(){
        Order order = spy(Order.class);
        EmailService emailService = spy(EmailService.getInstance());
        emailService.sendEmail(order, "avi.vyas@tothenew.com");
        assertEquals(true, order.isCustomerNotified());
        verify(emailService, times(1)).sendEmail(order, "avi.vyas@tothenew.com");
        verify(order, times(1)).setCustomerNotified(true);
    }


}
