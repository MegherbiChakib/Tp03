package exercise2;

public class OrderController{
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    boolean createOrder(Order order){
        return orderService.createOrder(order);
    }



    //todo Créer une classe OrderController avec une méthode createOrder(Order order) qui appelle OrderService.createOrder(order)

}
