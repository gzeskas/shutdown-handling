package lt.gzeskas.samples.shutdown;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

@Service
public class ShutdownListener implements DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(ShutdownListener.class);

    @Override
    public void destroy() throws Exception {
        logger.info("Received shutdown signal");
    }
}
