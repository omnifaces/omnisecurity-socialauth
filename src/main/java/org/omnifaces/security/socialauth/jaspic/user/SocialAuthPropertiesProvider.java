/*
 * Copyright 2013 OmniFaces.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.omnifaces.security.socialauth.jaspic.user;

import java.util.Properties;

import javax.enterprise.context.ApplicationScoped;

import org.brickred.socialauth.SocialAuthManager;
import org.omnifaces.security.socialauth.jaspic.authmodules.SocialServerAuthModule;

/**
 * A provider for properties for the {@link SocialServerAuthModule}'s internal {@link SocialAuthManager} configuration.
 * <p>
 * This interface should be implemented by a single bean on the classpath that can subsequently be retrieved by CDI.
 * In most cases this should be an {@link ApplicationScoped} bean.
 * <p>
 * If no bean implementing this interface is present, the SAM will use the {@link SocialAuthManager}'s default configuration,
 * which loads a <code>oauth_consumer.properties</code> from the classpath root.
 * 
 * @author Arjan Tijms
 *
 */
public interface SocialAuthPropertiesProvider {

	Properties getProperties();
	
}
