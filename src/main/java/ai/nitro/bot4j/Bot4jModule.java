/*
 * Copyright (C) 2016, nitro.ai
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package ai.nitro.bot4j;

import ai.nitro.bot4j.integration.deployment.DeploymentModule;
import com.google.inject.AbstractModule;

import ai.nitro.bot4j.integration.alexa.AlexaModule;
import ai.nitro.bot4j.integration.facebook.FacebookModule;
import ai.nitro.bot4j.integration.slack.SlackModule;
import ai.nitro.bot4j.integration.telegram.TelegramModule;
import ai.nitro.bot4j.middle.MiddlewareModule;

public class Bot4jModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new FacebookModule());
		install(new SlackModule());
		install(new TelegramModule());
		install(new AlexaModule());
		install(new DeploymentModule());

		install(new MiddlewareModule());
	}
}
