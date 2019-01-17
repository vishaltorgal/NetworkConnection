## Check Internet Connection in Android

<a href="https://github.com/vishaltorgal/NetworkConnection/raw/master/networkcheck.apk"><img src="https://github.com/vishaltorgal/SendingEmails/blob/master/dlapk.png" width="150" height="80" title="White flower" alt="Flower"></a>

<br><br>
<p style="text-align: center;"><img src="https://github.com/vishaltorgal/NetworkConnection/blob/master/nwc1.png" alt="" width="400" height="550"/>&nbsp;</p>

<br><br>



```java

    public boolean isInternetAvailable(String url) {
        try {
            final InetAddress address = InetAddress.getByName(url);
            return !address.equals("");

        } catch (UnknownHostException e) {
            // Log error
        }
        return false;
    }
```

```java
<h3> Type 2 </h3>

     public boolean isNetworkAvailable(Context context) 
      {
        
        final ConnectivityManager connectivityManager = ((ConnectivityManager)      context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

```

  
  
