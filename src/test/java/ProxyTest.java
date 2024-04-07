import org.example.lab2.Proxy.CacheProxyYouTubeApiClient;
import org.example.lab2.Proxy.YouTubeApiClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ProxyTest {
    @Test
    public void Testing(){
YouTubeApiClient client = new CacheProxyYouTubeApiClient();
long start =System.currentTimeMillis();
client.popularVideos();
long end = System.currentTimeMillis();
long firstRequestTime = end - start;
start = System.currentTimeMillis();
client.popularVideos();
end =System.currentTimeMillis();
long secondRequestTime = end - start;
        System.out.println("CacheProxyYouTubeApiClientTests");
        System.out.println("First request took " + firstRequestTime + "ms");
        System.out.println("Second request took " + secondRequestTime + "ms");
assertTrue(secondRequestTime < firstRequestTime);
    }
}
