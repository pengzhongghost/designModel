package 命令模式;

/**
 * @author pengzhong
 * @since 2022/10/6
 */
public class RemoteController {

    //开关按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给我们的按钮设置需要的命令
    public void setOnCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        //记录此次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下开按钮
    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        //记录此次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
