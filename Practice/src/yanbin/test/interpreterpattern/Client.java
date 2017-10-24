package yanbin.test.interpreterpattern;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by henrymbp on 18/10/17.
 */
public class Client {
    public static void main(final String[] args) {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<String, Expression>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
