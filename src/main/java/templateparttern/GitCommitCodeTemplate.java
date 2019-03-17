package templateparttern;

/**
 * git代码提交简易模板
 */
public abstract class GitCommitCodeTemplate {
    private boolean flag = true;

    public void stepOfCommitCode(String code)
    {
        //1、pull代码
        flag = pull(code);

        //2、如果pull成功则执行status查看。否则执行revert回退操作再pull
        if (!flag)
        {
            copyCode(code);
            String anotherCode = executeRevert();
            pull(anotherCode);
        }

        getStatus();

        //3、执行diff检查操作
        executeDiff(code);

        //4、执行add操作
        executeAdd(code);

        //5、执行commit操作
        executeCommit(code);
    }

    abstract boolean pull(String code);

    protected void getStatus(){
        System.out.println("get code status");
    }

    abstract String executeRevert();

    protected void executeDiff(String code){
        System.out.println("diff code");
    };

    protected void executeAdd(String code){
        System.out.println("add code");
    };

    protected void executeCommit(String code){
        System.out.println("commit code");
    };

    protected void copyCode(String code){
        System.out.println("copy code");
    };
}
