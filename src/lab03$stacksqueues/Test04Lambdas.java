package lab03$stacksqueues;

/******************************************************************
 * Lab-01 : Lambda Expressions
 * This refers to a question in the lab quiz.
 * Question :
 * Fill in the correct code for test.setOnAction2(__________)
 * below using the interface F2 indicated.
 ******************************************************************/

public class Test04Lambdas {

//TODO: What is the argument for setOnAction2 for this interface?
    public static void main(String[] args) {
        Test04Lambdas test = new Test04Lambdas();

        //FIXME: Update arguments with interface F2 to make this compile
        //test.setOnAction2();
    }

    public void apply(Double d){}

    public void setOnAction2(F2 f) {
        f.function(4.5);
    }

}


