import java.util.HashSet;

public class Store {
    private HashSet<Account> store = new HashSet<>();

    public boolean addAccount(Account account){
        return store.add(account);
    }

    public boolean removeAccount(Account account){
        return store.remove(account);
    }
}
