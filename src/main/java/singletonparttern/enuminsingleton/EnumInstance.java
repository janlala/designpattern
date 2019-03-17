package singletonparttern.enuminsingleton;

/**
 * 枚举单例
 * 最安全的单例
 */
public enum EnumInstance {
    INSTANCE;

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static EnumInstance getInstance()
    {
        return INSTANCE;
    }
}
