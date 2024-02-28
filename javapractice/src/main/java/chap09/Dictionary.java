package chap09;

public class Dictionary extends PairMap {

    private int set;

    public Dictionary(int num){
        KeyArray = new String[num];
        valueArray = new String[num];
    }
    @Override
    String get(String key) {
        for(int i = 0; i < KeyArray.length; i++){
            if(key.equals(KeyArray[i])){
                return valueArray[i];
            }
        } return null;
    }



    @Override
    void put(String key, String value) {
        for(int i = 0; i<KeyArray.length; i++){
            if(key.equals(KeyArray[i])){
                KeyArray[i] = key;
            }
        }
    }

    @Override
    String delete(String key) {
        return null;
    }

    @Override
    int length() {
        return 0;
    }
}
