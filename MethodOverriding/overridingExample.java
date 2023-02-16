package MethodOverriding;

class TV{
    public void switchOn(){
        System.out.println("TV is switched on");
    }

    public void changeChannel(){
        System.out.println("TV channel is changed");
    }
}

class smartTV extends TV {
    @Override
    public void switchOn(){
        System.out.println("TV is switched on");
    }
    @Override
    public void changeChannel(){
        System.out.println("TV channel is changed");
    }
}

public class overridingExample {
    public static void main(String[] args) {
        TV s = new TV();

        s.switchOn();
        s.changeChannel();

        smartTV s1 = new smartTV();

        s1.switchOn();
        s1.changeChannel();
    }
}
