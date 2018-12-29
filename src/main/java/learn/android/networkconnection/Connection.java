package learn.android.networkconnection;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Connection {

    public boolean isNetworkAvailable(Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    public boolean isInternetAvailable(String url) {
        try {
            final InetAddress address = InetAddress.getByName(url);
            return !address.equals("");

        } catch (UnknownHostException e) {
            // Log error
        }
        return false;
    }
}
