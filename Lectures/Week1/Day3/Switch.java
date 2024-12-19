public class Switch {
    public static void main(String[] args){
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
    }
}
