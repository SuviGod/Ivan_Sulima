package ua.sulima.webapi.factories.api;

import lombok.extern.slf4j.Slf4j;
import ua.sulima.webapi.dropbox.DropboxAPI;
import ua.sulima.webapi.dropbox.DropboxAPIImpl;
import ua.sulima.webapi.factories.api.APIFactory;

import java.util.ResourceBundle;

@Slf4j
public class APIFactoryImpl1 implements APIFactory {
    public DropboxAPI dropboxAPI;

    APIFactoryImpl1() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("application");
        String accessToken = resourceBundle.getString("ACCESS_TOKEN");
        log.info("Creating a DropboxAPI instance");
        dropboxAPI = new DropboxAPIImpl(accessToken);
        log.info("DropboxAPI instance created");
    }

    public DropboxAPI getDropboxAPI() {
        return dropboxAPI;
    }
}
