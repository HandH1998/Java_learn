package oo.polymorphism.demo04;

public class Computer {
    public void powerOn(){
        System.out.println("开机");
    }
    public void powerOff(){
        System.out.println("关机");
    }
    //使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();//打开设备
        if(usb instanceof Mouse){//先判断
            Mouse mouse=(Mouse) usb;//向下转型
            mouse.click();
        }
        if(usb instanceof KeyBoard){
            KeyBoard keyBoard=(KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();//关闭设备
    }

}
