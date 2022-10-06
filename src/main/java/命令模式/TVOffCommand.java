package 命令模式;

/**
 * @author pengzhong
 * @since 2022/10/6
 */
public class TVOffCommand implements Command{

    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }

}
