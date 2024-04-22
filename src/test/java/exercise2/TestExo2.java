package exercise2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestExo2 {
    @Mock
    private OrderDao orderDaoMock;


    @Test
    public void testSaveOrder(){
        //creation dun ordre
        Order order=new Order(1);
        //init orderService
        OrderService orderService = new OrderService(orderDaoMock);
        //init ordercontroller
        OrderController orderController = new OrderController(orderService);
        // un test JUnit pour OrderController.createOrder(Order order)par un  mocks pour   OrderDao.
        boolean resultat1= orderController.createOrder(order);
        verify(orderDaoMock).saveOrder(order);
        System.out.println("1");



        //un test JUnit pour OrderController.createOrder(Order order)par un  mocks pour  OrderService .
        //comportement du orderService
        //when(orderServiceMock.createOrder(order)).thenReturn(true);
        //OrderController orderControlleer = new OrderController(orderServiceMock);
        //orderControlleer.createOrder(order);
        //verify(orderControlleer.createOrder(order));







    }



}
