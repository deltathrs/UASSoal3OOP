class Hotdog extends Robot implements Runnable{

        private String menu;
        
        Hotdog(String menu){
            this.menu = menu;
        }
        
        void set_data(String menu){
            this.menu = menu;
        }
        public void run(){
            System.out.println( menu + " Processing" );
            try{
                Thread.sleep(1000);
                System.out.println( menu + " Finished" );
        } catch(InterruptedException e) {
            
        }
    }
}