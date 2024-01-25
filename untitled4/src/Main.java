import javax.swing.JOptionPane;

class Main{
    public static void main(String args[]) throws Exception{
        TestTread TT = new TestTread();
        TT.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력해주세요");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}

class TestTread extends Thread{
    public void run(){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (Exception e){}
        }
    }
}