package Assignment7;

class FSA {
    private int state;
    private boolean active;


    public FSA(int states) {
        if (states >= 4) {
            System.out.println("This is an invalid state. Starting at state 0");
            states = 0;
            this.state = states;
        }

         this.state = states;
     }

     int goToNextState(int states) {
         if (!isActive()) {
             System.out.println("This machine is not active");
         }
         //active = true;
        
        return ++state;
         
     }

     boolean end() {
        if (state >= 3) {
            active = false;
            return true;
        } else {
            return false;
        }
     }

     int showCurrentState() {
        return state;
     }

     boolean isActive() {
        if (active) { return true; } else { return false; }
        }


    void setActive(boolean active) {
        this.active = active;
    }    
}
