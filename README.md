<h2> Check Internet Connection in Android <h2/>


<p style="text-align: center;"><span style="color: #000000;"><span style="caret-color: #333399;"><strong>Download APK Link&nbsp;</strong></span></span></p>
<p style="text-align: left;"><span style="color: #000000;">https://github.com/vishaltorgal/NetworkConnection/blob/master/networkcheckv2.apk</span></p>

<br><br>
<p style="text-align: center;"><img src="https://github.com/vishaltorgal/NetworkConnection/blob/master/src/main/res/drawable/nwc1.png" alt="" width="400" height="550"/>&nbsp;</p>


<h3> Type 1 </h3>

    public boolean isInternetAvailable(String url) {
        try {
            final InetAddress address = InetAddress.getByName(url);
            return !address.equals("");

        } catch (UnknownHostException e) {
            // Log error
        }
        return false;
    }

<h3> Type 2 </h3>

     public boolean isNetworkAvailable(Context context) 
      {
        
        final ConnectivityManager connectivityManager = ((ConnectivityManager)      context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }



  
  
