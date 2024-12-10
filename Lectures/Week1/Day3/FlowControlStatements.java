public class FlowControlStatements {
    public static void main(String[] args) {
        int precipitation = 0;
        int waterOutput = 0;
        int temperature = 80;

        //start an if-statement
        if (precipitation < 20){
            waterOutput = 30;
        }else if (precipitation < 31){
            waterOutput = 10; 
        }else if (precipitation < 56){
            waterOutput = 0;
        }else {
            waterOutput = 0;
        }

        System.out.println("The water output should be " + waterOutput);


        //start an if-statement
        if (precipitation < 20){
        	if (temperature <= 75){
                waterOutput = 30;
            }
            else {
                waterOutput = 45;
            }
        }else if (precipitation < 31){
        	if (temperature <= 75){
                waterOutput = 10;
            }
            else {
                waterOutput = 25;
            } 
        }else if (precipitation < 56){
        	if (temperature <= 75){
                waterOutput = 0;
            }
            else {
                waterOutput = 15;
            }
        }else {
        	waterOutput = 0;
        }
        
        System.out.println("The water output should be " + waterOutput);

        //Switch Case
        int x = 10;
        switch(x) {
        	case 10: System.out.println("x case 10 ran");
        }
        //Default Case

        int y = 5;
		switch(y) {
			case 10: System.out.println("y case 10 ran");
			default: System.out.println("y The default case ran.");
		}
        //Fall-through

        int z = 5;
		switch(z) {
			default: System.out.println("z The default case ran.");
			case 10: System.out.println("z case 10 ran");
		}

        int a = 5;
        switch(a) {
            case 6: System.out.println("a case 6 ran");
            default: System.out.println("a The default case ran.");
            case 7: System.out.println("a case 7 ran");
            case 10: System.out.println("a case 10 ran");
        }
        //Using break
        int b = 5;
        switch(b) {
            case 6:
                System.out.println("b case 6 ran");
                break;
            default:
                System.out.println("b The default case ran.");
                break;
            case 7:
                System.out.println("b case 7 ran");
                break;
            case 10:
                System.out.println("b case 10 ran");
        }
        int c = 5;

        switch(c) {
            case 6: {
                System.out.println("c case 6 ran");
                break;
            }
            default:{
                System.out.println("c The default case ran.");
                break;
            }
            case 7:{
                System.out.println("c case 7 ran");
                break;
            }
            case 10:{
                System.out.println("c case 10 ran");
                break;
            }
        }

        for (int i = 1; i <= 10; i++){
    		System.out.println(i);
        }

        boolean on = true;
    	while (on){
    		System.out.println("Inside the while loop");
    		on = false;
    	}

        int d = 1;
        while (d <= 5){
            System.out.println(d);
            d++;
        }

        boolean on2 = false;
    	do{
    		System.out.println("Inside the do-while loop");
    	} while (on2);

        // Initially loop is set to run from 0-9
		for (int i = 0; i < 10; i++) {
			// Terminate the loop when i is 5
			if (i == 5)
				break;
			System.out.println("i: " + i);
		}
		System.out.println("Out of Loop");


        // First label
        first:
        for (int i = 0; i < 3; i++) {
        // Second label
        second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {

                    // Using break statement with label
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }

        int i = 2;
		switch (i) {
		case 0:
			System.out.println("i is zero.");
			break;
		case 1:
			System.out.println("i is one.");
			break;
		case 2:
			System.out.println("i is two.");
			break;
		default:
			System.out.println("Invalid number");
		}
        
        for (int j = 0; i < 10; i++) {
			// If the number is 2
			// skip and continue
			if (j == 2)
				continue;

			System.out.print(j + " ");
		}
    }
}
