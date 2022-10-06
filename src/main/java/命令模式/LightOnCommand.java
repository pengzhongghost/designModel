package 命令模式;

/**
 * @author pengzhong
 * @since 2022/10/6
 */
public class LightOnCommand implements Command{

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }

}
