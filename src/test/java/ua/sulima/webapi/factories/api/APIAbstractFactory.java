package ua.sulima.webapi.factories.api;

public abstract class APIAbstractFactory{
    private static volatile APIFactory apiFactory;

    public static APIFactory getImpl1Instance() {
        if (apiFactory == null) {
            synchronized (APIFactory.class) {
                if (apiFactory == null) {
                    APIFactory newApiFactory =
                            new APIFactoryImpl1();
                    apiFactory = newApiFactory;
                }
            }
        }
        return apiFactory;
    }
}