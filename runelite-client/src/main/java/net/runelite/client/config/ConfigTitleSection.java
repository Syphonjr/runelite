/*
 * Copyright (c) 2019, Hydrox6 <ikada@protonmail.ch>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ConfigTitleSection
{
	/**
	 * Displayed position of the title section.
	 *
	 * @return The index of the title section.
	 */
	int position();

	/**
	 * This is not visible to users
	 *
	 * @return name used for finding the config section
	 * from the properties map. Hence, KEY name.
	 */
	String keyName();

	/**
	 * This is the name that is shown to users when looking
	 * at the config panel.
	 * <p>
	 * Choose a name carefully, as there is a maximum width
	 * that depends on the users DPI scaling. Short is best.
	 *
	 * @return display name for the config title section.
	 */
	String name();

	/**
	 * This will be shown to the user if they are hovering
	 * the config item in the config panel.
	 *
	 * @return the description of the config item.
	 */
	String description();

	/**
	 * Setting this will tell the panel
	 * that this title should be placed beneath
	 * said section.
	 *
	 * @return parent section.
	 */
	String section() default "";

	/**
	 * Setting this will tell the panel
	 * that this title should be placed beneath
	 * said title.
	 *
	 * @return parent title section.
	 */
	String titleSection() default "";

	/**
	 * NOT USED.
	 */
	boolean hidden() default false;

	/**
	 * NOT USED.
	 */
	String unhide() default "";

	/**
	 * NOT USED.
	 */
	String unhideValue() default "";

	/**
	 * NOT USED.
	 */
	String hide() default "";

	/**
	 * NOT USED.
	 */
	String hideValue() default "";
}
