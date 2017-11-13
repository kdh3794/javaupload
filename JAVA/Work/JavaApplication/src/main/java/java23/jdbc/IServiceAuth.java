package java23.jdbc;

public interface IServiceAuth extends IAuth {
    
    //추가되는 메서드. service 레이에서만 사용되는 메서드다.
    public int transCommit(ModelAuth a1, ModelAuth a2);
    public int transRollback(ModelAuth a1, ModelAuth a2);
    
}
