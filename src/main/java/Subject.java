/**
 * Created by Артем on 06.03.2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void  notifyObservers();
}
