package Assignment7;

class FSA {
    private int state;


    public FSA(int states) {
        if (states >= 4) {
            System.out.println("This is an invalid state. Starting at state 0");
            states = 0;
            this.state = 0;
        }

         this.state = states;
     }

     int goToNextState(int states) {
        state = states;
         return state++;
     }

     boolean end() {
        if (state == 3) {
            return true;
        } else {
            return false;
        }
     }
}
