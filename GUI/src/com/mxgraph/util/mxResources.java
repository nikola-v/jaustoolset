package com.mxgraph.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;

public class mxResources
{

	/**
	 * Ordered list of the inserted resource bundles.
	 */
	protected static LinkedList bundles = new LinkedList();

	/**
	 * Returns the bundles.
	 * 
	 * @return Returns the bundles.
	 */
	public static LinkedList getBundles()
	{
		return bundles;
	}

	/**
	 * Sets the bundles.
	 * 
	 * @param bundles
	 *            The bundles to set.
	 */
	public static void setBundles(LinkedList bundles)
	{
		mxResources.bundles = bundles;
	}

	/**
	 * Adds a resource bundle.
	 * 
	 * @param basename
	 *            The basename of the resource bundle to add.
	 */
	public static void add(String basename)
	{
		bundles.addFirst(PropertyResourceBundle.getBundle(basename));
	}

	/**
	 * Adds a resource bundle.
	 * 
	 * @param basename
	 *            The basename of the resource bundle to add.
	 */
	public static void add(String basename, Locale locale)
	{
		bundles.addFirst(PropertyResourceBundle.getBundle(basename, locale));
	}

	/**
	 * 
	 */
	public static String get(String key)
	{
		return get(key, null, null);
	}

	/**
	 * 
	 */
	public static String get(String key, String defaultValue)
	{
		return get(key, null, defaultValue);
	}

	/**
	 * Returns the value for the specified resource key.
	 */
	public static String get(String key, String[] params)
	{
		return get(key, params, null);
	}

	/**
	 * Returns the value for the specified resource key.
	 */
	public static String get(String key, String[] params, String defaultValue)
	{
		String value = getResource(key);

		// Applies default value if required
		if (value == null)
		{
			value = defaultValue;
		}

		// Replaces the placeholders with the values in the array
		if (value != null && params != null)
		{
			StringBuffer result = new StringBuffer();
			String index = null;

			for (int i = 0; i < value.length(); i++)
			{
				char c = value.charAt(i);

				if (c == '{')
				{
					index = "";
				}
				else if (index != null && c == '}')
				{
					int tmp = Integer.parseInt(index) - 1;

					if (tmp >= 0 && tmp < params.length)
					{
						result.append(params[tmp]);
					}

					index = null;
				}
				else if (index != null)
				{
					index += c;
				}
				else
				{
					result.append(c);
				}
			}

			value = result.toString();
		}

		return value;
	}

	/**
	 * Returns the value for <code>key</code> by searching the resource
	 * bundles in inverse order or <code>null</code> if no value can be found
	 * for <code>key</code>.
	 */
	protected static String getResource(String key)
	{
		Iterator it = bundles.iterator();

		while (it.hasNext())
		{
			try
			{
				return ((PropertyResourceBundle) it.next()).getString(key);
			}
			catch (MissingResourceException mrex)
			{
				// continue
			}
		}

		return null;
	}

}
