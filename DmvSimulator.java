public class DmvSimulator {
    public static void main (String[] args){
        System.out.println("Welcome to the DMV! Make sure to take a number!");
        int number = (int) Math.floor(Math.random()*100)+1;
        System.out.println("Your number is: "+number+". Please wait for it to be called.");
        int count = number + 1;
        try {
            while(!(count == number)){

                System.out.println(count);
                Thread.sleep(1000);

                if(count == 100){
                    count = 1;
                }
                count++;
            }
            System.out.println(number);
            System.out.println("Sorry, you do not have the correct paperwork!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}