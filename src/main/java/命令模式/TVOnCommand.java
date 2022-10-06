package 命令模式;

/**
 * @author pengzhong
 * @since 2022/10/6
 */
public class TVOnCommand implements Command{

    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }

}
