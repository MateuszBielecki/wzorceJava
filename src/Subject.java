public interface Subject {
    void notifyMissions();
    void pickupItem(Item item);
    void removeItem(Item item);
    void registerMission(Observer o);
    void removeMission(Observer o);
}