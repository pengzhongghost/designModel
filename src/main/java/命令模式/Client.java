package 命令模式;

/**
 * @author pengzhong
 * @since 2022/10/6
 */
public class Client {

    public static void main(String[] args) {
        //1。创建电灯的对象(接收器)
        LightReceiver lightReceiver = new LightReceiver();
        //2。创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //3.需要一个遥控器
        RemoteController remoteController = new RemoteController();

        remoteController.setOnCommand(0, lightOnCommand, lightOffCommand);
        //打开电灯
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        //关闭电灯
        remoteController.undoButtonWasPushed();

        //开关tv
        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        remoteController.setOnCommand(1, tvOnCommand, tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();

    }

}
