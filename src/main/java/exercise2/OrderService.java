package exercise2;

public class OrderService implements OrderDao{
    //todo méthode createOrder(Order order) qui appelle OrderDao.saveOrder(order)
    private final OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao=orderDao;
    }

    boolean createOrder(Order order){
        return orderDao.saveOrder(order);
    }


    @Override
    public boolean saveOrder(Order order) {
        return true;
    }
}
