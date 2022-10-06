package 命令模式;

/**
 * @author pengzhong
 * @desc 没有任何命令，空执行；用于初始化所有按钮;
 * 这种设计模式可以省去对空判断
 * @since 2022/10/6
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

}
