public interface Hash {

    void set(String key, Integer value);
    void delete(String key);
    Integer get(String key);
    boolean isEmpty();
    long size();
    public Integer bucketSize(String key);
}
