import com.company.Iteratordesignpattern.Iterator;
import com.company.Iteratordesignpattern.NameRepository;
import com.company.commanddesignpattern.Broker;
import com.company.commanddesignpattern.BuyStock;
import com.company.commanddesignpattern.SellStock;
import com.company.commanddesignpattern.Stock;
import com.company.interpretordesignpattern.InterpreterClient;
import com.company.interpretordesignpattern.InterpreterEngine;
import com.company.observerdesignpattern.BinaryObserver;
import com.company.observerdesignpattern.Subject;
import com.company.statedesignpattern.StartState;
import com.company.statedesignpattern.StateContext;
import com.company.statedesignpattern.StopState;
import com.company.strategydesignpattern.Context;
import com.company.strategydesignpattern.OperationAdd;
import com.company.strategydesignpattern.OperationSubstract;
import com.company.templatedesignpattern.Cricket;
import com.company.templatedesignpattern.Football;
import com.company.templatedesignpattern.Game;

public class Main {

    public static void main(String[] args) {
        System.out.println("template design pattern");
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        System.out.println("command design pattern");
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        System.out.println("Observer design pattern");
        Subject subject = new Subject();

        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        System.out.println("iterator design pattern");
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

        System.out.println("Strategy design pattern");
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        System.out.println("State design pattern");
        StateContext stateContext = new StateContext();

        StartState startState = new StartState();
        startState.doAction(stateContext);

        System.out.println(stateContext.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(stateContext);

        System.out.println(stateContext.getState().toString());

        System.out.println("Interpretor design pattern");


        InterpreterClient ic = new InterpreterClient(new InterpreterEngine());

        System.out.println("Result = " + ic.interpret("add 12 and 13"));
        System.out.println("Result = " + ic.interpret("subtract 76 from 621"));

    }
}
