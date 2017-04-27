package ai.nitro.bot4j.integration.deployment.receive.webhook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Markus on 26.04.2017.
 */
public interface DeploymentWebhook {
    HttpServletResponse delete(HttpServletRequest req, HttpServletResponse res);

    HttpServletResponse get(HttpServletRequest req, HttpServletResponse res);

    HttpServletResponse post(HttpServletRequest req, HttpServletResponse res);

    HttpServletResponse put(HttpServletRequest req, HttpServletResponse res);


}
